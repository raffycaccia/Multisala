package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import model.ResourceLoader;
import model.Utente;

@SuppressWarnings("serial")
public class MenuPanel extends JPanel {

	private Utente status = Utente.CLIENTE;
	private JButton programmazioneBtn;
	private JButton prenotazioniBtn;
	private JPanel clienteMenu;
	private JPanel gestoreMenu;
	private JRadioButton clienteBtn;
	private JRadioButton gestoreBtn;
	
	public final static int MENU_WIDTH = 240;
	public final static int BUTTON_HEIGHT = 45;
	public final static int SWITCH_BUTTON_HEIGHT = 38;
	
	public MenuPanel() {
		
		setStyle();
		
		createMenu();
		
		if (status.equals(Utente.CLIENTE)) {
			setClientMenu();
		} else if (status.equals(Utente.GESTORE)) {
			setGestoreMenu();
		} else {
			setClientMenu();
		}
		
	}
	
	private void createMenu() {
		add(Box.createVerticalStrut(30));
		createLogo();
		add(Box.createVerticalStrut(80));
		createUtenteSwitch();
		add(Box.createVerticalStrut(15));
		createClienteMenu();
		createGestoreMenu();
	}
	
	public void createLogo() {
		ImageIcon logoIcon = new ImageIcon("image/Logo.png");
		JLabel logo = new JLabel(logoIcon);
		logo.setBorder(BorderFactory.createEmptyBorder(0,22,0,0));
		logo.setIconTextGap(0);
		logo.setHorizontalAlignment(SwingConstants.LEFT);
		add(logo);
	}
	
	private void createClienteMenu() {
		clienteMenu = new JPanel();
		
		clienteMenu.setLayout(new BoxLayout(clienteMenu, BoxLayout.Y_AXIS));
		clienteMenu.setPreferredSize(new Dimension(MENU_WIDTH, 0));
		clienteMenu.setBackground(Tema.MENU_COLOR);
		clienteMenu.setOpaque(true);
		
		clienteMenu.add(createProgrammaButton());
		clienteMenu.add(createPrenotazioniButton());
		add(clienteMenu);
		
	}
	
	private void createGestoreMenu() {
		gestoreMenu = new JPanel();
		
		gestoreMenu.setLayout(new BoxLayout(gestoreMenu, BoxLayout.Y_AXIS));
		gestoreMenu.setPreferredSize(new Dimension(MENU_WIDTH, 0));
		gestoreMenu.setBackground(Tema.MENU_COLOR);
		gestoreMenu.setOpaque(true);
		
		//gestoreMenu.add(createProgrammaButton());
		//gestoreMenu.add(createPrenotazioniButton());
		add(gestoreMenu);
	}
	
	// per ora li metto qua
	private void setClientMenu() {
		status = Utente.CLIENTE;
		clienteMenu.setVisible(true);
		//gestoreMenu.setVisible(false);
		ButtonStyler.setSwitchButtonSelectedStyle(clienteBtn);
		ButtonStyler.setSwitchButtonUnselectedStyle(gestoreBtn);
		
	}
	
	private void setGestoreMenu() {
		status = Utente.GESTORE;
		gestoreMenu.setVisible(true);
		clienteMenu.setVisible(false);
		ButtonStyler.setSwitchButtonSelectedStyle(gestoreBtn);
		ButtonStyler.setSwitchButtonUnselectedStyle(clienteBtn);
	}
	
	private void setStyle() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(MENU_WIDTH, 0));
		setBackground(Tema.MENU_COLOR);
		setOpaque(true);
		CompoundBorder menuBorder = new CompoundBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black),
						BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(83,84,85)));
		setBorder(menuBorder);
	}
	
	private JButton createProgrammaButton() {
		//ImageIcon icon = new ImageIcon(new ImageIcon("image/buttonIcon/programmazioneIcon@3x.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
		ImageIcon icon = new ImageIcon("image/buttonIcon/ProgrammazioneIconSelected.png");
		programmazioneBtn = new JButton("Programmazione", icon);
		ButtonStyler.setNavButtonStyle(programmazioneBtn);
		ButtonStyler.setNavButtonSelectedStyle(programmazioneBtn);
		programmazioneBtn.setAlignmentX(LEFT_ALIGNMENT);
		class ClickListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				JButton btn = (JButton)event.getSource();
				ButtonStyler.setNavButtonSelectedStyle(btn);
				ButtonStyler.setNavButtonUnselectedStyle(prenotazioniBtn);
			}
		}
		ActionListener listener = new ClickListener();
		programmazioneBtn.addActionListener(listener);
		return programmazioneBtn;
	}
	
	private JButton createPrenotazioniButton() {
		prenotazioniBtn = new JButton("Carrello", new ImageIcon("image/buttonIcon/carrello.png"));
		ButtonStyler.setNavButtonStyle(prenotazioniBtn);
		prenotazioniBtn.setAlignmentX(LEFT_ALIGNMENT);
		class ClickListener2 implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				JButton btn = (JButton)event.getSource();
				ButtonStyler.setNavButtonSelectedStyle(btn);
				ButtonStyler.setNavButtonUnselectedStyle(programmazioneBtn);
			}
		}
		ActionListener listener = new ClickListener2();
		prenotazioniBtn.addActionListener(listener);
		return prenotazioniBtn;
	}
	
	private void createUtenteSwitch() {
		//Crea pannello
		JLayeredPane switchPanel = new JLayeredPane();
		//Stile e layout
		//switchPanel.setLayout(new GridLayout(1,2));
		switchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		switchPanel.setMinimumSize(new Dimension(MENU_WIDTH, SWITCH_BUTTON_HEIGHT));
		switchPanel.setMaximumSize(new Dimension(MENU_WIDTH, SWITCH_BUTTON_HEIGHT));
		switchPanel.setPreferredSize(new Dimension(MENU_WIDTH, SWITCH_BUTTON_HEIGHT));
		switchPanel.setBorder(BorderFactory.createEmptyBorder(0,17,0,0));
		switchPanel.setAlignmentX(LEFT_ALIGNMENT);
		switchPanel.setBackground(Tema.MENU_COLOR);
		switchPanel.setOpaque(false);
		//Crea tasti
		clienteBtn = new JRadioButton("CLIENTE");
		gestoreBtn = new JRadioButton("GESTORE");
		//Imposta stile tasti
		ButtonStyler.setSwitchButtonStyle(clienteBtn);
		ButtonStyler.setSwitchButtonStyle(gestoreBtn);

		//clienteBtn.setMinimumSize(new Dimension(80, SWITCH_BUTTON_HEIGHT));
		//clienteBtn.setMaximumSize(new Dimension(80, SWITCH_BUTTON_HEIGHT));
		clienteBtn.setPreferredSize(new Dimension(95, SWITCH_BUTTON_HEIGHT - 10));

		//gestoreBtn.setMinimumSize(new Dimension(MENU_WIDTH/2, SWITCH_BUTTON_HEIGHT));
		//.setMaximumSize(new Dimension(MENU_WIDTH/2, SWITCH_BUTTON_HEIGHT));
		gestoreBtn.setPreferredSize(new Dimension(95, SWITCH_BUTTON_HEIGHT - 10));
		
		//Raggruppa tasti
		ButtonGroup utenteSwitch = new ButtonGroup();
		utenteSwitch.add(gestoreBtn);
		utenteSwitch.add(clienteBtn);
		//Comportamento tasti
		clienteBtn.addActionListener((ActionEvent)->setClientMenu());
		gestoreBtn.addActionListener((ActionEvent)->setGestoreMenu());
		clienteBtn.setSelected(true);
		//Aggiunge tasti al pannello
		switchPanel.add(clienteBtn);
		switchPanel.add(gestoreBtn);
		//Aggiunge pannello
		add(switchPanel);
	}
}

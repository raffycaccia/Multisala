package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import model.ResourceLoader;
import model.Utente;

public class MenuPanel extends JPanel {

	private Utente status = Utente.CLIENTE;
	private JButton programmazioneBtn;
	private JButton prenotazioniBtn;
	private JPanel clienteMenu;
	private JPanel gestoreMenu;
	
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
		add(Box.createVerticalStrut(80));
		createUtenteSwitch();
		createClienteMenu();
		createGestoreMenu();
	}
	
	private void createClienteMenu() {
		clienteMenu = new JPanel();
		
		clienteMenu.setLayout(new BoxLayout(clienteMenu, BoxLayout.Y_AXIS));
		clienteMenu.setPreferredSize(new Dimension(221, 800));
		clienteMenu.setBackground(Color.DARK_GRAY);
		clienteMenu.setOpaque(true);
		
		clienteMenu.add(createProgrammaButton());
		clienteMenu.add(createPrenotazioniButton());
		add(clienteMenu);
		
	}
	
	private void createGestoreMenu() {
		gestoreMenu = new JPanel();
		
		gestoreMenu.setLayout(new BoxLayout(gestoreMenu, BoxLayout.Y_AXIS));
		gestoreMenu.setPreferredSize(new Dimension(221, 800));
		gestoreMenu.setBackground(Color.DARK_GRAY);
		gestoreMenu.setOpaque(true);
		
		gestoreMenu.add(createProgrammaButton());
		//gestoreMenu.add(createPrenotazioniButton());
		add(gestoreMenu);
	}
	
	// per ora li metto qua
	private void setClientMenu() {
		status = Utente.CLIENTE;
		clienteMenu.setVisible(true);
		gestoreMenu.setVisible(false);
	}
	
	private void setGestoreMenu() {
		status = Utente.GESTORE;
		gestoreMenu.setVisible(true);
		clienteMenu.setVisible(false);
	}
	
	private void setStyle() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(221, 800));
		setBackground(Color.DARK_GRAY);
		setOpaque(true);
		CompoundBorder menuBorder = new CompoundBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black),
						BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(90,90,90)));
		setBorder(menuBorder);
	}
	
	private JButton createProgrammaButton() {
		//ImageIcon icon = new ImageIcon(new ImageIcon("image/buttonIcon/ProgrammazioneIcon@2x.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
		ImageIcon icon = new ImageIcon("image/buttonIcon/ProgrammazioneIcon.png");
		JButton ProgrammazioneBtn = new JButton("Programmazione", icon);
		ButtonStyler.setNavButtonSelectedStyle(ProgrammazioneBtn);
		ProgrammazioneBtn.setAlignmentX(LEFT_ALIGNMENT);
		return ProgrammazioneBtn;
	}
	
	private JButton createPrenotazioniButton() {
		JButton Prenotazionibtn = new JButton("Carrello", new ImageIcon("image/buttonIcon/carrello.png"));
		ButtonStyler.setNavButtonStyle(Prenotazionibtn);
		Prenotazionibtn.setAlignmentX(LEFT_ALIGNMENT);
		return Prenotazionibtn;
	}
	
	private void createUtenteSwitch() {
		//Crea pannello
		JPanel switchPanel = new JPanel();
		//Stile e layout
		switchPanel.setLayout(new GridLayout(1,2));
		switchPanel.setMaximumSize(new Dimension(221, 50));
		switchPanel.setBorder(BorderFactory.createEmptyBorder(0,15,0,0));
		switchPanel.setAlignmentX(LEFT_ALIGNMENT);
		switchPanel.setOpaque(false);
		//Crea tasti
		JRadioButton clienteBtn = new JRadioButton("Cliente");
		JRadioButton gestoreBtn = new JRadioButton("Gestore");
		//Comportamento tasti
		clienteBtn.addActionListener((ActionEvent)->setClientMenu());
		gestoreBtn.addActionListener((ActionEvent)->setGestoreMenu());
		//Imposta stile tasti
		ButtonStyler.setSwitchButtonStyle(clienteBtn);
		ButtonStyler.setSwitchButtonStyle(gestoreBtn);
		//Raggruppa tasti
		ButtonGroup utenteSwitch = new ButtonGroup();
		utenteSwitch.add(gestoreBtn);
		utenteSwitch.add(clienteBtn);
		//Aggiunge tasti al pannello
		switchPanel.add(clienteBtn);
		switchPanel.add(gestoreBtn);
		//Aggiunge pannello
		add(switchPanel);
	}
}

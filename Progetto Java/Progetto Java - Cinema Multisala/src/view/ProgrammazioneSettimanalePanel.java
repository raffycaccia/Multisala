package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Data;
import model.ResourceLoader;
import model.Sala;
import model.Spettacolo;

@SuppressWarnings("serial")
public class ProgrammazioneSettimanalePanel extends JPanel {

	//private static final int PANEL_SIZE = 400;
	private JComboBox<String> selectSala;
	private ArrayList<Spettacolo> arrSpettacoli;
	private ArrayList<Sala> arrSale;
	private JPanel operaList;
	private JComboBox<String> ordine;
	private JCheckBox visualizzaProssimi;
	//private JButton switchVista;

	public ProgrammazioneSettimanalePanel(ArrayList<Spettacolo> arrSpettacoli, ArrayList<Sala> arrSale) {

		this.arrSpettacoli = arrSpettacoli;
		this.arrSale = arrSale;

		//Stile e layout pannello
		setBackground(Tema.RIGHT_PANEL_BACKGROUND_COLOR);
		//setLayout(new BorderLayout());
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(new EmptyBorder(32, 32, 32, 32));

		//Crea header, subheader e lista
		createHeader();
		//Se esistono sale crea filtro sala e il subheader
		if ((arrSale != null) && arrSale.size() > 0) {
			//Crea subheader
			addSubHeader(arrSale);
		} else {
			//Distanzia la lista se non c'é il subheader
			add(Box.createVerticalStrut(40), BorderLayout.CENTER);
		}
		createListPanel(arrSpettacoli);

	}

	private void createHeader() {
		//Header label
		JLabel headerLbl = new JLabel("Programma Settimanale");
		TextStyler.setNavHeaderStyle(headerLbl);
		//headerLbl.setBorder(new EmptyBorder(0,8,0,0));
		headerLbl.setAlignmentX(LEFT_ALIGNMENT);
		add (headerLbl, BorderLayout.NORTH);
		add(Box.createVerticalStrut(5));
		addDivisore(3000);
	}
	/*
	private JButton addSwitchVista() {
		switchVista = new JButton("Vedi tutto");
		class ClickListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(switchVista.getText().compareTo("Vedi tutto") == 0) {
					switchVista.setText("Vedi questa settimana");
				} else {
					switchVista.setText("Vedi tutto");
					ArrayList<Spettacolo> spettacoliSettimanaCorrente = new ArrayList<Spettacolo>();
					for (Spettacolo s : arrSpettacoli) {
						Data data = s.getData();
						int anno = (data.getAnno() - LocalDateTime.now().getYear()) * 525600; //MOLTIPLICO PER I minuti in un anno
						int mese = (data.getMese() - LocalDateTime.now().getMonthValue()) * 44640; //moltiplico prt i minuti in un mese
						int giorno = (data.getGiorno() - LocalDateTime.now().getDayOfMonth()) * 1440;
						int ora = (data.getOra() - LocalDateTime.now().getHour()) * 60;
						int minuto = data.getMinuto() - LocalDateTime.now().getMinute();
						if ((anno + mese + giorno + ora + minuto) > 0) {
							prossimiSpettacoli.add(s);
						}
					}
					this.remove(operaList);
					createListPanel(prossimiSpettacoli);
				}
			}

		}
		ActionListener listener = new ClickListener();
		switchVista.addActionListener(listener);
		return switchVista;
	}
	 */
	private JPanel addSalaFilterPanel(ArrayList<Sala> arrSale) {
		JPanel filtroSala = new JPanel();
		//Stile e layout pannello
		filtroSala.setOpaque(false);
		filtroSala.setLayout(new BoxLayout(filtroSala, BoxLayout.Y_AXIS));
		filtroSala.setAlignmentX(LEFT_ALIGNMENT);

		JLabel tipoFiltroLbl = new JLabel("Filtra per sala".toUpperCase());
		tipoFiltroLbl.setAlignmentX(LEFT_ALIGNMENT);
		TextStyler.setFilterTypeStyle(tipoFiltroLbl);
		filtroSala.add(tipoFiltroLbl);

		//Crea selettore sala
		selectSala = new JComboBox<String>();
		selectSala.addItem("Tutte le sale");
		for (Sala s : arrSale) {
			selectSala.addItem(s.getNome());
		}
		selectSala.setAlignmentX(LEFT_ALIGNMENT);
		//Dimensione selettore
		selectSala.setPreferredSize(new Dimension(150,30));


		class ChoiceListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				visualizzaProssimi.setEnabled(false);
				ordine.setEnabled(false);
				visualizzaListaSala();
			}

		}

		ActionListener listener = new ChoiceListener();
		selectSala.addActionListener(listener);
		filtroSala.add(selectSala);

		return filtroSala;
	}

	private void visualizzaListaSala() {
		String salaScelta = (String) selectSala.getSelectedItem();
		boolean isPresent = false;
		for (Sala s : arrSale) {
			if (s.getNome().equals(salaScelta)) {
				isPresent = true;
			}
		}
		if (!isPresent) {
			this.remove(operaList);
			createListPanel(arrSpettacoli);
			visualizzaProssimi.setEnabled(true);
			ordine.setEnabled(true);
			return;
		}
		System.out.println("is present");
		ArrayList<Spettacolo> arrFiltrato = new ArrayList<Spettacolo>();
		for (Spettacolo spet : arrSpettacoli) {
			if (spet.getSala().getNome().equals(salaScelta)) {
				arrFiltrato.add(spet);
			}
		}
		this.remove(operaList);
		this.revalidate(); // Aggiorna il frame
		createListPanel(arrFiltrato);
	}

	private JPanel addSpettacoliFilterPanel() {
		JPanel filtroSpettacoli = new JPanel();
		//Stile e layout pannello
		filtroSpettacoli.setOpaque(false);
		filtroSpettacoli.setLayout(new BoxLayout(filtroSpettacoli, BoxLayout.Y_AXIS));
		filtroSpettacoli.setAlignmentX(LEFT_ALIGNMENT);

		JLabel tipoFiltroLbl = new JLabel("Filtra per spettacoli".toUpperCase());
		tipoFiltroLbl.setAlignmentX(LEFT_ALIGNMENT);
		TextStyler.setFilterTypeStyle(tipoFiltroLbl);
		filtroSpettacoli.add(tipoFiltroLbl);

		//Crea checkbox per visualizzare solo le prossime proiezioni
		visualizzaProssimi = new JCheckBox("Solo prossimi spettacoli".toUpperCase());
		//visualizzaProssimi.setForeground(new Color(1,122,255));
		visualizzaProssimi.setForeground(Tema.CHECKBOX_COLOR);
		visualizzaProssimi.setFont(ResourceLoader.HeavyFont.deriveFont(13f));
		visualizzaProssimi.setPreferredSize(new Dimension(300,30));
		visualizzaProssimi.setOpaque(false);
		visualizzaProssimi.setAlignmentX(LEFT_ALIGNMENT);
		visualizzaProssimi.setBorderPainted(false);
		visualizzaProssimi.setFocusPainted(false);
		visualizzaProssimi.setFocusable(false);
		//Aggiunge la checkbox al subheader
		filtroSpettacoli.add(visualizzaProssimi, BorderLayout.CENTER);
		//Crea selettore filtri
		ordine = new JComboBox<String>();
		ordine.setName("Ordine");
		ordine.addItem("Cronologico");
		ordine.addItem("Sala crescente");
		ordine.addItem("A-Z");
		ordine.setVisible(false);
		ordine.setAlignmentX(LEFT_ALIGNMENT);
		//Aggiunge selettore filtri al pannello subheader
		filtroSpettacoli.add(ordine, BorderLayout.EAST);
		//Distanzia subheader dalla lista degli spettacoli
		//filtroSpettacoli.add(Box.createVerticalStrut(10), BorderLayout.SOUTH);
		//Comportamento checkbox
		visualizzaProssimi.addActionListener((ActionEvent)->{
			if (visualizzaProssimi.isSelected()) {

				ArrayList<Spettacolo> prossimiSpettacoli = new ArrayList<Spettacolo>();
				for (Spettacolo s : arrSpettacoli) {
					Data data = s.getData();
					int anno = (data.getAnno() - LocalDateTime.now().getYear()) * 525600; //MOLTIPLICO PER I minuti in un anno
					int mese = (data.getMese() - LocalDateTime.now().getMonthValue()) * 44640; //moltiplico prt i minuti in un mese
					int giorno = (data.getGiorno() - LocalDateTime.now().getDayOfMonth()) * 1440;
					int ora = (data.getOra() - LocalDateTime.now().getHour()) * 60;
					int minuto = data.getMinuto() - LocalDateTime.now().getMinute();
					if ((anno + mese + giorno + ora + minuto) > 0) {
						prossimiSpettacoli.add(s);
					}
				}
				this.remove(operaList);
				createListPanel(prossimiSpettacoli);
				if (prossimiSpettacoli.size() > 0) {
					ordine.setVisible(true);
				}
				selectSala.setEnabled(false);
			} else {
				ordine.setVisible(false);
				selectSala.setEnabled(true);
				this.remove(operaList);
				createListPanel(arrSpettacoli);
			}
		});

		return filtroSpettacoli;

	}

	private void addSubHeader(ArrayList<Sala> arrSale) {
		//Crea pannello subheader
		JPanel subHeader = new JPanel();
		//Stile e layout pannello
		subHeader.setOpaque(false);
		subHeader.setLayout(new FlowLayout(FlowLayout.LEFT));
		subHeader.setBorder(new EmptyBorder(0,2,0,0));
		subHeader.setAlignmentX(LEFT_ALIGNMENT);
		//Distanzia il subheader dall'header
		add(Box.createVerticalStrut(3));

		//subHeader.add(addSwitchVista());

		subHeader.add(addSalaFilterPanel(arrSale));

		subHeader.add(Box.createHorizontalStrut(30));

		subHeader.add(addSpettacoliFilterPanel());
		
		//Aggiunge subheader al pannello della programmazione
		add(subHeader);
		//add(Box.createVerticalStrut(60));

	}

	private void createListPanel(ArrayList<Spettacolo> arrSpettacoli) {
		operaList = new OperaListPanel(arrSpettacoli);
		add(operaList, BorderLayout.SOUTH);
	}

	private void addDivisore(int lunghezza) {
		LineaDivisore l = new LineaDivisore(lunghezza);
		add(l);
	}
}


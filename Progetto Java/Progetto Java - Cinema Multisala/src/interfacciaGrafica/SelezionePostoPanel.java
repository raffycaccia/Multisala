package interfacciaGrafica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import eccezioni.PostoIndisponibileException;
import progetto.Posto;
import progetto.Sala;
import progetto.Spettacolo;

public class SelezionePostoPanel extends JPanel {
	Spettacolo spet;

	public SelezionePostoPanel(Spettacolo spettacolo) {
		spet=spettacolo;
		initGui(spet);
	}



	private void initGui(Spettacolo spettacolo) {

		ImageIcon posto_disp = new ImageIcon("image/sala/seat_disponibile.png");
		ImageIcon posto_ind = new ImageIcon("image/sala/seat_disponibile.png");
		ImageIcon posto_pren = new ImageIcon("image/sala/seat_disponibile.png");
		ImageIcon posto_vend = new ImageIcon("image/sala/seat_disponibile.png");
		ImageIcon schermo = new ImageIcon("image/sala/schermo.png");

		Sala sala = spettacolo.getSala();

		ArrayList<Posto> posti = new ArrayList<Posto>(); 
		ArrayList<Posto> postiA = new ArrayList<Posto>(); 
		ArrayList<Posto> postiP = new ArrayList<Posto>(); 
		
		 this.removeAll();
         this.setLayout(new BorderLayout(20, 30)); 
		
		JPanel LayoutPosti = new JPanel(new GridLayout(sala.getRighe(), sala.getColonne(), 0, 1));
		
		JPanel nord = new JPanel();
        JPanel center = new JPanel(new BorderLayout());
		
        JLabel screen = new JLabel(schermo);
        nord.add(screen);
        
		/*
		 * qui va aggiunto il
		 * metodo del controller che carica i posti nei vari array list
		 */
		
		//########## METODO DI PROVA - SERVE SOLO AL TESTER
		for(int i=0;i<sala.getRighe()*sala.getColonne();i++) {
			posti.add(new Posto(i,posto_disp));
		}
		//########## DEVE SCOMPARIRE
		
		

		/**
		 * FOR PER SETTARE I POSTI VENDUTI
		 */
		for (int i = 0; i < postiA.size(); i++) {
			for (int j = 0; j < posti.size(); j++) {
				if (postiA.get(i).getId() == posti.get(j).getId()) {
					posti.get(j).setIcon(posto_vend);
					posti.get(j).setVenduto(true);
				}
			}
		}
		
		/**
		 * FOR PER SETTARE I POSTI PRENOTATI
		 */
		for (int i = 0; i < postiP.size(); i++) {
			for (int j = 0; j < posti.size(); j++) {
				if (postiP.get(i).getId() == posti.get(j).getId()) {
					posti.get(j).setIcon(posto_pren);
					posti.get(j).setPrenotato(true);
				}
			}
		}

		/**
		 * FOR CHE AGGIUNGE I POSTI ALLA TABELLA E SETTA LE FUNZIONI
		 */
		for (int i = 0; i < posti.size(); i++) {
				posti.get(i).addActionListener(postoClick(posti.get(i))); //definire
			
			LayoutPosti.add(posti.get(i));
		}
		
		center.add(LayoutPosti, BorderLayout.CENTER);


		this.add(nord, BorderLayout.NORTH);
		this.add(center, BorderLayout.CENTER);
	}

	/*
	 * ACTION LISTENER
	 */
	private ActionListener  postoClick(Posto posto) {
		ActionListener evento = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//lancio eccezione nel caso si clicchi su un pulsante non selezionabile
				if (posto.isIndisponibile() == true || posto.isVenduto() == true || posto.isPrenotato() == true) {
					throw new PostoIndisponibileException();
				}
			}
		};
		return evento;

	}


}



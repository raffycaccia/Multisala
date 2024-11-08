package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Posto;
import model.PostoIndisponibileException;
import model.Sala;
import model.Spettacolo;
import view.Tema;

@SuppressWarnings("serial")
public class SelezionePostoPanel extends JPanel {
	Spettacolo spet;
    CarrelloPanel cart = new CarrelloPanel();

	public SelezionePostoPanel(Spettacolo spettacolo) {
		spet=spettacolo;
		initGui(spet);
	}



	private void initGui(Spettacolo spettacolo) {
		
		this.setBackground(Tema.RIGHT_PANEL_BACKGROUND_COLOR);

		ImageIcon posto_disp = new ImageIcon("image/sala/seat_disponibile.png");
		ImageIcon posto_ind = new ImageIcon("image/sala/seat_indisponibile.png");
		ImageIcon posto_pren = new ImageIcon("image/sala/seat_prenotato.png");
		ImageIcon posto_vend = new ImageIcon("image/sala/seat_venduto.png");
		ImageIcon schermo = new ImageIcon("image/sala/schermo.png");

		Sala sala = spettacolo.getSala();

		ArrayList<Posto> posti = new ArrayList<Posto>(); 
		ArrayList<Posto> postiA = new ArrayList<Posto>(); 
		ArrayList<Posto> postiP = new ArrayList<Posto>(); 
		
		 this.removeAll();
         this.setLayout(new BorderLayout(20, 30)); 
		
		JPanel LayoutPosti = new JPanel(new GridLayout(sala.getRighe(), sala.getColonne(), 0, 1));
		LayoutPosti.setBackground(Tema.RIGHT_PANEL_BACKGROUND_COLOR);
		
		JPanel nord = new JPanel();
		nord.setBackground(Tema.RIGHT_PANEL_BACKGROUND_COLOR);
        JPanel center = new JPanel(new BorderLayout());
		
        JLabel screen = new JLabel(schermo);
        nord.add(screen);
        
        JPanel hall= new JPanel(new BorderLayout(20, 30));
        hall.setBackground(Tema.RIGHT_PANEL_BACKGROUND_COLOR);
		/*
		 * TODO
		 * qui va aggiunto il
		 * metodo del controller che carica i posti nei vari array list
		 */
		
		//########## METODO DI PROVA - SERVE SOLO AL TESTER
		for(int i=0;i<sala.getRighe()*sala.getColonne();i++) {
			posti.add(new Posto(i,posto_disp));
		}
		posti.get(2).setimage(posto_vend);
		posti.get(2).setVenduto(true);
		
		posti.get(5).setimage(posto_vend);
		posti.get(5).setVenduto(true);
		
		posti.get(9).setimage(posto_pren);
		posti.get(9).setPrenotato(true);
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
		hall.add(nord, BorderLayout.NORTH);
		hall.add(center, BorderLayout.CENTER);
		
		//
        this.add(hall, BorderLayout.CENTER);
		this.add(cart, BorderLayout.EAST);
		
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
				}else {
					
					if(posto.isSelected()) {
						posto.setSelected(false);
						cart.removePostoCarrello(posto);
					}else {
						posto.setSelected(true);
						cart.addPostoCarrello(posto);
					}
					
				}
			}
		};
		return evento;

	}


}



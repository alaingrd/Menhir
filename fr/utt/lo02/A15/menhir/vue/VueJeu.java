package fr.utt.lo02.A15.menhir.vue;


import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.utt.lo02.A15.menhir.modele.DefensiveStrategy;
import fr.utt.lo02.A15.menhir.modele.Partie;

import javax.swing.Box;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Observable;
import java.util.Observer;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Classe vue intervenant dans le cadre du design pattern MVC <br>
 * Implémente l'interface Observer <br>
 * Permet de visualiser les composants du jeu
 * @author alain
 *
 */
public class VueJeu implements Observer{

	private JFrame frame;
	JLabelObserver labelObsTypePartie;
	JLabelObserver labelObsNbGraines;
	public JLabelObserver labelObsNbMenhirs;
	
	JLabelObserver labelObsNbGrainesJ2;
	JLabelObserver labelObsNbMenhirsJ2;
	JLabelObserver labelObsTypeStrategieJ2;
	
	JLabelObserver labelObsNbGrainesJ3;
	JLabelObserver labelObsNbMenhirsJ3;
	JLabelObserver labelObsTypeStrategieJ3;

	JLabelObserver labelObsNbGrainesJ4;
	JLabelObserver labelObsNbMenhirsJ4;
	JLabelObserver labelObsTypeStrategieJ4;
	
	JLabelObserver labelObsNbGrainesJ5;
	JLabelObserver labelObsNbMenhirsJ5;
	JLabelObserver labelObsTypeStrategieJ5;
	
	JLabelObserver labelObsNbGrainesJ6;
	JLabelObserver labelObsNbMenhirsJ6;
	JLabelObserver labelObsTypeStrategieJ6;
	
	
	JLabelObserver labelObsSaisonCourante;
	JLabelObserver labelObsTourCourant;
	JLabelObserver labelObsMancheCourante;
	
	JLabelObserver labelObsDerniereActionJ1;
	JLabelObserver labelObsDerniereActionJ2;
	JLabelObserver labelObsDerniereActionJ3;
	JLabelObserver labelObsDerniereActionJ4;
	JLabelObserver labelObsDerniereActionJ5;
	JLabelObserver labelObsDerniereActionJ6;
	
	JLabelObserver labelObsVainqueur;
	
	Partie monModelePartie;
	

	
	
	
	public JLabelObserver getLabelObsDerniereActionJ1() {
		return labelObsDerniereActionJ1;
	}

	public JLabelObserver getLabelObsDerniereActionJ2() {
		return labelObsDerniereActionJ2;
	}

	public JLabelObserver getLabelObsDerniereActionJ3() {
		return labelObsDerniereActionJ3;
	}

	public JLabelObserver getLabelObsDerniereActionJ4() {
		return labelObsDerniereActionJ4;
	}

	public JLabelObserver getLabelObsDerniereActionJ5() {
		return labelObsDerniereActionJ5;
	}

	public JLabelObserver getLabelObsDerniereActionJ6() {
		return labelObsDerniereActionJ6;
	}

	public JLabelObserver getLabelObsVainqueur() {
		return labelObsVainqueur;
	}

	public JLabelObserver getLabelObsNbGrainesJ3() {
		return labelObsNbGrainesJ3;
	}

	public JLabelObserver getLabelObsNbMenhirsJ3() {
		return labelObsNbMenhirsJ3;
	}

	public JLabelObserver getLabelObsTypeStrategieJ3() {
		return labelObsTypeStrategieJ3;
	}

	public JLabelObserver getLabelObsNbGrainesJ4() {
		return labelObsNbGrainesJ4;
	}

	public JLabelObserver getLabelObsNbMenhirsJ4() {
		return labelObsNbMenhirsJ4;
	}

	public JLabelObserver getLabelObsTypeStrategieJ4() {
		return labelObsTypeStrategieJ4;
	}

	public JLabelObserver getLabelObsNbGrainesJ5() {
		return labelObsNbGrainesJ5;
	}

	public JLabelObserver getLabelObsNbMenhirsJ5() {
		return labelObsNbMenhirsJ5;
	}

	public JLabelObserver getLabelObsTypeStrategieJ5() {
		return labelObsTypeStrategieJ5;
	}

	public JLabelObserver getLabelObsNbGrainesJ6() {
		return labelObsNbGrainesJ6;
	}

	public JLabelObserver getLabelObsNbMenhirsJ6() {
		return labelObsNbMenhirsJ6;
	}

	public JLabelObserver getLabelObsTypeStrategieJ6() {
		return labelObsTypeStrategieJ6;
	}

	public JLabelObserver getLabelObsTourCourant() {
		return labelObsTourCourant;
	}

	public JLabelObserver getLabelObsMancheCourante() {
		return labelObsMancheCourante;
	}

	public JLabelObserver getLabelObsNbMenhirs() {
		return labelObsNbMenhirs;
	}

	public JLabelObserver getLabelObsNbGraines() {
		return labelObsNbGraines;
	}

	public JLabelObserver getLabelObsNbGrainesJ2() {
		return labelObsNbGrainesJ2;
	}

	public JLabelObserver getLabelObsNbMenhirsJ2() {
		return labelObsNbMenhirsJ2;
	}

	public JLabelObserver getLabelObsTypeStrategieJ2() {
		return labelObsTypeStrategieJ2;
	}
	
	

	public JLabelObserver getLabelObsSaisonCourante() {
		return labelObsSaisonCourante;
	}

	/**
	 * Create the application.
	 * @param monModelePartie 
	 */
	public VueJeu(Partie monModelePartie) {
		this.monModelePartie = monModelePartie;
		initialize();
	}

	/**
	 * Initialise le contenu de la frame.
	 */
	/**
	 * Initialise le contenu de la frame <br>
	 * Est ajusté en fonction du nombre de joueurs
	 */
	private void initialize() {
		frame = new JFrame("Jeu du Menhir - Vue du Jeu");
		frame.setBounds(100, 100, 590, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{591, 0};
		gridBagLayout.rowHeights = new int[]{15, 15, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox.anchor = GridBagConstraints.NORTH;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox.gridx = 0;
		gbc_horizontalBox.gridy = 0;
		frame.getContentPane().add(horizontalBox, gbc_horizontalBox);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		JLabel labelPresentTypePartie = new JLabel("Type de partie : ");
		labelPresentTypePartie.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox.add(labelPresentTypePartie);
		
		labelObsTypePartie = new JLabelObserver((String) null);
		labelObsTypePartie.setFont(new Font("Ubuntu", Font.BOLD, 14));
		labelObsTypePartie.setText("Le type");
		horizontalBox.add(labelObsTypePartie);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.anchor = GridBagConstraints.NORTH;
		gbc_horizontalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox_1.gridx = 0;
		gbc_horizontalBox_1.gridy = 1;
		frame.getContentPane().add(horizontalBox_1, gbc_horizontalBox_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		JLabel labelPresentMancheCourante = new JLabel("Manche courante : ");
		labelPresentMancheCourante.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_1.add(labelPresentMancheCourante);
		
		labelObsMancheCourante = new JLabelObserver((String) null);
		labelObsMancheCourante.setFont(new Font("Ubuntu", Font.BOLD, 14));
		labelObsMancheCourante.setText("1");
		horizontalBox_1.add(labelObsMancheCourante);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_3);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_2 = new GridBagConstraints();
		gbc_horizontalBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox_2.anchor = GridBagConstraints.NORTH;
		gbc_horizontalBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_2.gridx = 0;
		gbc_horizontalBox_2.gridy = 2;
		frame.getContentPane().add(horizontalBox_2, gbc_horizontalBox_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		JLabel labelPresentTourCourant = new JLabel("Tour courant : ");
		labelPresentTourCourant.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_2.add(labelPresentTourCourant);
		
		labelObsTourCourant = new JLabelObserver((String) null);
		labelObsTourCourant.setFont(new Font("Ubuntu", Font.BOLD, 14));
		labelObsTourCourant.setText("1");
		horizontalBox_2.add(labelObsTourCourant);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		JLabel labelPresentSaisonCourante = new JLabel("Saison courante : ");
		labelPresentSaisonCourante.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_2.add(labelPresentSaisonCourante);
		
		labelObsSaisonCourante = new JLabelObserver((String) null);
		labelObsSaisonCourante.setFont(new Font("Ubuntu", Font.BOLD, 14));
		labelObsSaisonCourante.setText("Printemps");
		horizontalBox_2.add(labelObsSaisonCourante);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_6);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_3 = new GridBagConstraints();
		gbc_horizontalBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox_3.gridx = 0;
		gbc_horizontalBox_3.gridy = 4;
		frame.getContentPane().add(horizontalBox_3, gbc_horizontalBox_3);
		
		JLabel labelPresentJ1 = new JLabel("J1 ->");
		labelPresentJ1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_3.add(labelPresentJ1);
		
		JLabel labelPresentNbGraines = new JLabel("Nombre de Graines :");
		horizontalBox_3.add(labelPresentNbGraines);
		
		labelObsNbGraines = new JLabelObserver((String) null);
		labelObsNbGraines.setText("nbGraines");
		labelObsNbGraines.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_3.add(labelObsNbGraines);
		
		JLabel labelPresentNbMenhirs = new JLabel("Nombre de Menhirs :");
		horizontalBox_3.add(labelPresentNbMenhirs);
		
		labelObsNbMenhirs = new JLabelObserver((String) null);
		labelObsNbMenhirs.setText("nbMenhirs");
		labelObsNbMenhirs.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_3.add(labelObsNbMenhirs);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_8);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_4 = new GridBagConstraints();
		gbc_horizontalBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox_4.gridx = 0;
		gbc_horizontalBox_4.gridy = 5;
		frame.getContentPane().add(horizontalBox_4, gbc_horizontalBox_4);
		
		JLabel labelPresentJ2 = new JLabel("J2 ->");
		labelPresentJ2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_4.add(labelPresentJ2);
		
		JLabel labelPresentNbGrainesJ2 = new JLabel("Nombre de Graines :");
		horizontalBox_4.add(labelPresentNbGrainesJ2);
		
		labelObsNbGrainesJ2 = new JLabelObserver((String) null);
		labelObsNbGrainesJ2.setText("nbGraines");
		labelObsNbGrainesJ2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_4.add(labelObsNbGrainesJ2);
		
		JLabel labelPresentNbMenhirsJ2 = new JLabel("Nombre de Menhirs :");
		horizontalBox_4.add(labelPresentNbMenhirsJ2);
		
		labelObsNbMenhirsJ2 = new JLabelObserver((String) null);
		labelObsNbMenhirsJ2.setText("nbMenhirs");
		labelObsNbMenhirsJ2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_4.add(labelObsNbMenhirsJ2);
		
		JLabel labelPresentTypeStrategieJ2 = new JLabel("Stratégie : ");
		horizontalBox_4.add(labelPresentTypeStrategieJ2);
		
		labelObsTypeStrategieJ2 = new JLabelObserver((String) null);
		labelObsTypeStrategieJ2.setText("Offensive");
		labelObsTypeStrategieJ2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_4.add(labelObsTypeStrategieJ2);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_7);
		
		//-----------
		
		if (monModelePartie.getNbJoueurs() >=3) {
			Box horizontalBox_5 = Box.createHorizontalBox();
			GridBagConstraints gbc_horizontalBox_5 = new GridBagConstraints();
			gbc_horizontalBox_5.insets = new Insets(0, 0, 5, 0);
			gbc_horizontalBox_5.gridx = 0;
			gbc_horizontalBox_5.gridy = 6;
			frame.getContentPane().add(horizontalBox_5, gbc_horizontalBox_5);
			
			JLabel labelPresentJ3 = new JLabel("J3 ->");
			labelPresentJ3.setFont(new Font("Ubuntu", Font.BOLD, 14));
			horizontalBox_5.add(labelPresentJ3);
			
			JLabel labelPresentNbGrainesJ3 = new JLabel("Nombre de Graines :");
			horizontalBox_5.add(labelPresentNbGrainesJ3);
			
			labelObsNbGrainesJ3 = new JLabelObserver((String) null);
			labelObsNbGrainesJ3.setText("nbGraines");
			labelObsNbGrainesJ3.setFont(new Font("Ubuntu", Font.BOLD, 14));
			horizontalBox_5.add(labelObsNbGrainesJ3);
			
			JLabel labelPresentNbMenhirsJ3 = new JLabel("Nombre de Menhirs :");
			horizontalBox_5.add(labelPresentNbMenhirsJ3);
			
			labelObsNbMenhirsJ3 = new JLabelObserver((String) null);
			labelObsNbMenhirsJ3.setText("nbMenhirs");
			labelObsNbMenhirsJ3.setFont(new Font("Ubuntu", Font.BOLD, 14));
			horizontalBox_5.add(labelObsNbMenhirsJ3);
			
			JLabel labelPresentTypeStrategieJ3 = new JLabel("Stratégie : ");
			horizontalBox_5.add(labelPresentTypeStrategieJ3);
			
			labelObsTypeStrategieJ3 = new JLabelObserver((String) null);
			labelObsTypeStrategieJ3.setText("Offensive");
			labelObsTypeStrategieJ3.setFont(new Font("Ubuntu", Font.BOLD, 14));
			horizontalBox_5.add(labelObsTypeStrategieJ3);
			
			Component horizontalGlue_9 = Box.createHorizontalGlue();
			horizontalBox_5.add(horizontalGlue_9);
			
			
			Box horizontalBox_11 = Box.createHorizontalBox();
			GridBagConstraints gbc_horizontalBox_11 = new GridBagConstraints();
			gbc_horizontalBox_11.insets = new Insets(0, 0, 5, 0);
			gbc_horizontalBox_11.gridx = 0;
			gbc_horizontalBox_11.gridy = 14;
			frame.getContentPane().add(horizontalBox_11, gbc_horizontalBox_11);
			
			JLabel labelPresentDerniereActionJ3 = new JLabel("Dernière action de J3 : ");
			labelPresentDerniereActionJ3.setFont(new Font("Ubuntu", Font.BOLD, 14));
			horizontalBox_11.add(labelPresentDerniereActionJ3);
			
			labelObsDerniereActionJ3 = new JLabelObserver((String) null);
			labelObsDerniereActionJ3.setText("");
			labelObsDerniereActionJ3.setFont(new Font("Ubuntu", Font.BOLD, 14));
			horizontalBox_11.add(labelObsDerniereActionJ3);
			
			Component horizontalGlue_15 = Box.createHorizontalGlue();
			horizontalBox_11.add(horizontalGlue_15);
			
			if (monModelePartie.getNbJoueurs() >=4) {
				//---------------------------------------------------------------------------------------
				Box horizontalBox_6 = Box.createHorizontalBox();
				GridBagConstraints gbc_horizontalBox_6 = new GridBagConstraints();
				gbc_horizontalBox_6.insets = new Insets(0, 0, 5, 0);
				gbc_horizontalBox_6.gridx = 0;
				gbc_horizontalBox_6.gridy = 7;
				frame.getContentPane().add(horizontalBox_6, gbc_horizontalBox_6);
				
				JLabel labelPresentJ4 = new JLabel("J4 ->");
				labelPresentJ4.setFont(new Font("Ubuntu", Font.BOLD, 14));
				horizontalBox_6.add(labelPresentJ4);
				
				JLabel labelPresentNbGrainesJ4 = new JLabel("Nombre de Graines :");
				horizontalBox_6.add(labelPresentNbGrainesJ4);
				
				labelObsNbGrainesJ4 = new JLabelObserver((String) null);
				labelObsNbGrainesJ4.setText("nbGraines");
				labelObsNbGrainesJ4.setFont(new Font("Ubuntu", Font.BOLD, 14));
				horizontalBox_6.add(labelObsNbGrainesJ4);
				
				JLabel labelPresentNbMenhirsJ4 = new JLabel("Nombre de Menhirs :");
				horizontalBox_6.add(labelPresentNbMenhirsJ4);
				
				labelObsNbMenhirsJ4 = new JLabelObserver((String) null);
				labelObsNbMenhirsJ4.setText("nbMenhirs");
				labelObsNbMenhirsJ4.setFont(new Font("Ubuntu", Font.BOLD, 14));
				horizontalBox_6.add(labelObsNbMenhirsJ4);
				
				JLabel labelPresentTypeStrategieJ4 = new JLabel("Stratégie : ");
				horizontalBox_6.add(labelPresentTypeStrategieJ4);
				
				labelObsTypeStrategieJ4 = new JLabelObserver((String) null);
				labelObsTypeStrategieJ4.setText("Offensive");
				labelObsTypeStrategieJ4.setFont(new Font("Ubuntu", Font.BOLD, 14));
				horizontalBox_6.add(labelObsTypeStrategieJ4);
				
				Component horizontalGlue_10 = Box.createHorizontalGlue();
				horizontalBox_6.add(horizontalGlue_10);
				
				//----------------------------------------------------------------------------------------------------
				Box horizontalBox_12 = Box.createHorizontalBox();
				GridBagConstraints gbc_horizontalBox_12 = new GridBagConstraints();
				gbc_horizontalBox_12.insets = new Insets(0, 0, 5, 0);
				gbc_horizontalBox_12.gridx = 0;
				gbc_horizontalBox_12.gridy = 15;
				frame.getContentPane().add(horizontalBox_12, gbc_horizontalBox_12);
				
				JLabel labelPresentDerniereActionJ4 = new JLabel("Dernière action de J4 : ");
				labelPresentDerniereActionJ4.setFont(new Font("Ubuntu", Font.BOLD, 14));
				horizontalBox_12.add(labelPresentDerniereActionJ4);
				
				labelObsDerniereActionJ4 = new JLabelObserver((String) null);
				labelObsDerniereActionJ4.setText("");
				labelObsDerniereActionJ4.setFont(new Font("Ubuntu", Font.BOLD, 14));
				horizontalBox_12.add(labelObsDerniereActionJ4);
				
				Component horizontalGlue_16 = Box.createHorizontalGlue();
				horizontalBox_12.add(horizontalGlue_16);
				
				if (monModelePartie.getNbJoueurs() >= 5) {
					//---------------------------------------------------------------------------------------
					
					Box horizontalBox_7 = Box.createHorizontalBox();
					GridBagConstraints gbc_horizontalBox_7 = new GridBagConstraints();
					gbc_horizontalBox_7.insets = new Insets(0, 0, 5, 0);
					gbc_horizontalBox_7.gridx = 0;
					gbc_horizontalBox_7.gridy = 9;
					frame.getContentPane().add(horizontalBox_7, gbc_horizontalBox_7);
					
					JLabel labelPresentJ5 = new JLabel("J5->");
					labelPresentJ5.setFont(new Font("Ubuntu", Font.BOLD, 14));
					horizontalBox_7.add(labelPresentJ5);
					
					JLabel labelPresentNbGrainesJ5 = new JLabel("Nombre de Graines :");
					horizontalBox_7.add(labelPresentNbGrainesJ5);
					
					labelObsNbGrainesJ5 = new JLabelObserver((String) null);
					labelObsNbGrainesJ5.setText("nbGraines");
					labelObsNbGrainesJ5.setFont(new Font("Ubuntu", Font.BOLD, 14));
					horizontalBox_7.add(labelObsNbGrainesJ5);
					
					JLabel labelPresentNbMenhirsJ5 = new JLabel("Nombre de Menhirs :");
					horizontalBox_7.add(labelPresentNbMenhirsJ5);
					
					labelObsNbMenhirsJ5 = new JLabelObserver((String) null);
					labelObsNbMenhirsJ5.setText("nbMenhirs");
					labelObsNbMenhirsJ5.setFont(new Font("Ubuntu", Font.BOLD, 14));
					horizontalBox_7.add(labelObsNbMenhirsJ5);
					
					JLabel labelPresentTypeStrategieJ5 = new JLabel("Stratégie : ");
					horizontalBox_7.add(labelPresentTypeStrategieJ5);
					
					labelObsTypeStrategieJ5 = new JLabelObserver((String) null);
					labelObsTypeStrategieJ5.setText("Offensive");
					labelObsTypeStrategieJ5.setFont(new Font("Ubuntu", Font.BOLD, 14));
					horizontalBox_7.add(labelObsTypeStrategieJ5);
					
					Component horizontalGlue_11 = Box.createHorizontalGlue();
					horizontalBox_7.add(horizontalGlue_11);
					
					
					
					//---------------------------------------------------------------------------------------
					
					
					Box horizontalBox_13 = Box.createHorizontalBox();
					GridBagConstraints gbc_horizontalBox_13 = new GridBagConstraints();
					gbc_horizontalBox_13.insets = new Insets(0, 0, 5, 0);
					gbc_horizontalBox_13.gridx = 0;
					gbc_horizontalBox_13.gridy = 16;
					frame.getContentPane().add(horizontalBox_13, gbc_horizontalBox_13);
					
					JLabel labelPresentDerniereActionJ5 = new JLabel("Dernière action de J5 : ");
					labelPresentDerniereActionJ5.setFont(new Font("Ubuntu", Font.BOLD, 14));
					horizontalBox_13.add(labelPresentDerniereActionJ5);
					
					labelObsDerniereActionJ5 = new JLabelObserver((String) null);
					labelObsDerniereActionJ5.setText("");
					labelObsDerniereActionJ5.setFont(new Font("Ubuntu", Font.BOLD, 14));
					horizontalBox_13.add(labelObsDerniereActionJ5);
					
					Component horizontalGlue_17 = Box.createHorizontalGlue();
					horizontalBox_13.add(horizontalGlue_17);
					
					
					if (monModelePartie.getNbJoueurs() >= 6) {
						//---------------------------------------------------------------------------------------
						
						Box horizontalBox_8 = Box.createHorizontalBox();
						GridBagConstraints gbc_horizontalBox_8 = new GridBagConstraints();
						gbc_horizontalBox_8.insets = new Insets(0, 0, 5, 0);
						gbc_horizontalBox_8.gridx = 0;
						gbc_horizontalBox_8.gridy = 11;
						frame.getContentPane().add(horizontalBox_8, gbc_horizontalBox_8);
						
						JLabel labelPresentJ6 = new JLabel("J6->");
						labelPresentJ6.setFont(new Font("Ubuntu", Font.BOLD, 14));
						horizontalBox_8.add(labelPresentJ6);
						
						JLabel labelPresentNbGrainesJ6 = new JLabel("Nombre de Graines :");
						horizontalBox_8.add(labelPresentNbGrainesJ6);
						
						labelObsNbGrainesJ6 = new JLabelObserver((String) null);
						labelObsNbGrainesJ6.setText("nbGraines");
						labelObsNbGrainesJ6.setFont(new Font("Ubuntu", Font.BOLD, 14));
						horizontalBox_8.add(labelObsNbGrainesJ6);
						
						JLabel labelPresentNbMenhirsJ6 = new JLabel("Nombre de Menhirs :");
						horizontalBox_8.add(labelPresentNbMenhirsJ6);
						
						labelObsNbMenhirsJ6 = new JLabelObserver((String) null);
						labelObsNbMenhirsJ6.setText("nbMenhirs");
						labelObsNbMenhirsJ6.setFont(new Font("Ubuntu", Font.BOLD, 14));
						horizontalBox_8.add(labelObsNbMenhirsJ6);
						
						JLabel labelPresentTypeStrategieJ6 = new JLabel("Stratégie : ");
						horizontalBox_8.add(labelPresentTypeStrategieJ6);
						
						labelObsTypeStrategieJ6 = new JLabelObserver((String) null);
						labelObsTypeStrategieJ6.setText("Offensive");
						labelObsTypeStrategieJ6.setFont(new Font("Ubuntu", Font.BOLD, 14));
						horizontalBox_8.add(labelObsTypeStrategieJ6);
						
						Component horizontalGlue_12 = Box.createHorizontalGlue();
						horizontalBox_8.add(horizontalGlue_12);
						
						
						//---------------------------------------------------------------------------------------
						
						Box horizontalBox_14 = Box.createHorizontalBox();
						GridBagConstraints gbc_horizontalBox_14 = new GridBagConstraints();
						gbc_horizontalBox_14.insets = new Insets(0, 0, 5, 0);
						gbc_horizontalBox_14.gridx = 0;
						gbc_horizontalBox_14.gridy = 17;
						frame.getContentPane().add(horizontalBox_14, gbc_horizontalBox_14);
						
						JLabel labelPresentDerniereActionJ6 = new JLabel("Dernière action de J6 : ");
						labelPresentDerniereActionJ6.setFont(new Font("Ubuntu", Font.BOLD, 14));
						horizontalBox_14.add(labelPresentDerniereActionJ6);
						
						labelObsDerniereActionJ6 = new JLabelObserver((String) null);
						labelObsDerniereActionJ6.setText("");
						labelObsDerniereActionJ6.setFont(new Font("Ubuntu", Font.BOLD, 14));
						horizontalBox_14.add(labelObsDerniereActionJ6);
						
						Component horizontalGlue_18 = Box.createHorizontalGlue();
						horizontalBox_14.add(horizontalGlue_18);
					}
					
				}
			}
		}
		
		//---------------------------------------------------------------------------------------
		
		
		Box horizontalBox_9 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_9 = new GridBagConstraints();
		gbc_horizontalBox_9.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox_9.gridx = 0;
		gbc_horizontalBox_9.gridy = 12;
		frame.getContentPane().add(horizontalBox_9, gbc_horizontalBox_9);
		
		JLabel labelPresentDerniereActionJ1 = new JLabel("Dernière action de J1 : ");
		labelPresentDerniereActionJ1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_9.add(labelPresentDerniereActionJ1);
		
		labelObsDerniereActionJ1 = new JLabelObserver((String) null);
		labelObsDerniereActionJ1.setText("");
		labelObsDerniereActionJ1.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_9.add(labelObsDerniereActionJ1);
		
		Component horizontalGlue_14 = Box.createHorizontalGlue();
		horizontalBox_9.add(horizontalGlue_14);
		
		
		
		//---------------------------------------------------------------------------------------
		
		
		
		Box horizontalBox_10 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_10 = new GridBagConstraints();
		gbc_horizontalBox_10.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox_10.gridx = 0;
		gbc_horizontalBox_10.gridy = 13;
		frame.getContentPane().add(horizontalBox_10, gbc_horizontalBox_10);
		
		JLabel labelPresentDerniereActionJ2 = new JLabel("Dernière action de J2 : ");
		labelPresentDerniereActionJ2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_10.add(labelPresentDerniereActionJ2);
		
		labelObsDerniereActionJ2 = new JLabelObserver((String) null);
		labelObsDerniereActionJ2.setText("");
		labelObsDerniereActionJ2.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_10.add(labelObsDerniereActionJ2);
		
		Component horizontalGlue_13 = Box.createHorizontalGlue();
		horizontalBox_10.add(horizontalGlue_13);
		
		
		
		//---------------------------------------------------------------------------------------
		
		Box horizontalBox_15 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_15 = new GridBagConstraints();
		gbc_horizontalBox_15.gridx = 0;
		gbc_horizontalBox_15.gridy = 19;
		frame.getContentPane().add(horizontalBox_15, gbc_horizontalBox_15);
		
		JLabel labelPresentVainqueur = new JLabel("Vainqueur : ");
		labelPresentVainqueur.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_15.add(labelPresentVainqueur);
		
		labelObsVainqueur = new JLabelObserver((String) null);
		labelObsVainqueur.setText("");
		labelObsVainqueur.setFont(new Font("Ubuntu", Font.BOLD, 14));
		horizontalBox_15.add(labelObsVainqueur);
		
		Component horizontalGlue_19 = Box.createHorizontalGlue();
		horizontalBox_15.add(horizontalGlue_19);
		
		JButton buttonMAJ = new JButton("Mettre à jour");
		buttonMAJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				update();
			}
		});
		horizontalBox_15.add(buttonMAJ);
		
		
		
		frame.setVisible(true);
	}

	public JLabelObserver getLabelObsTypePartie() {
		return labelObsTypePartie;
	}



	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	@Override
	/**
	 * Intervient dans le carde du pattern Observer-Observable <br>
	 * Met à jour les composants de la frame
	 */
	public void update(Observable o, Object arg) {
		
		
		this.getLabelObsNbGraines().setText(""+monModelePartie.getArrayListJoueurs().get(0).getNbGraines());
		this.getLabelObsNbMenhirs().setText(""+monModelePartie.getArrayListJoueurs().get(0).getNbMenhirs());
		
		this.getLabelObsNbGrainesJ2().setText(""+monModelePartie.getArrayListJoueurs().get(1).getNbGraines());
		this.getLabelObsNbMenhirsJ2().setText(""+monModelePartie.getArrayListJoueurs().get(1).getNbMenhirs());
		if (monModelePartie.getArrayListJoueurs().get(1).getTypeStrategy() instanceof DefensiveStrategy) {
			this.getLabelObsTypeStrategieJ2().setText("Défensive");
		}
		else {
			this.getLabelObsTypeStrategieJ2().setText("Offensive");
		}
		//Pour les actions effectuées
		this.getLabelObsDerniereActionJ1().setText(monModelePartie.getArrayListJoueurs().get(0).getDerniereAction());
		this.getLabelObsDerniereActionJ2().setText(monModelePartie.getArrayListJoueurs().get(1).getDerniereAction());
		
		
		//On met aussi à jour les autres joueurs s'il y en a
		if (monModelePartie.getNbJoueurs()>=3) {
			this.getLabelObsNbGrainesJ3().setText(""+monModelePartie.getArrayListJoueurs().get(2).getNbGraines());
			this.getLabelObsNbMenhirsJ3().setText(""+monModelePartie.getArrayListJoueurs().get(2).getNbMenhirs());
			this.getLabelObsDerniereActionJ3().setText(monModelePartie.getArrayListJoueurs().get(2).getDerniereAction());
			if (monModelePartie.getArrayListJoueurs().get(2).getTypeStrategy() instanceof DefensiveStrategy) {
				this.getLabelObsTypeStrategieJ3().setText("Défensive");
			}
			else {
				this.getLabelObsTypeStrategieJ3().setText("Offensive");
			}
			if (monModelePartie.getNbJoueurs()>=4) {
				this.getLabelObsNbGrainesJ4().setText(""+monModelePartie.getArrayListJoueurs().get(3).getNbGraines());
				this.getLabelObsNbMenhirsJ4().setText(""+monModelePartie.getArrayListJoueurs().get(3).getNbMenhirs());
				this.getLabelObsDerniereActionJ4().setText(monModelePartie.getArrayListJoueurs().get(3).getDerniereAction());
				if (monModelePartie.getArrayListJoueurs().get(3).getTypeStrategy() instanceof DefensiveStrategy) {
					this.getLabelObsTypeStrategieJ4().setText("Défensive");
				}
				else {
					this.getLabelObsTypeStrategieJ4().setText("Offensive");
				}
				if (monModelePartie.getNbJoueurs()>=5) {
					this.getLabelObsNbGrainesJ5().setText(""+monModelePartie.getArrayListJoueurs().get(4).getNbGraines());
					this.getLabelObsNbMenhirsJ5().setText(""+monModelePartie.getArrayListJoueurs().get(4).getNbMenhirs());
					this.getLabelObsDerniereActionJ5().setText(monModelePartie.getArrayListJoueurs().get(4).getDerniereAction());
					if (monModelePartie.getArrayListJoueurs().get(4).getTypeStrategy() instanceof DefensiveStrategy) {
						this.getLabelObsTypeStrategieJ5().setText("Défensive");
					}
					else {
						this.getLabelObsTypeStrategieJ5().setText("Offensive");
					}
					if (monModelePartie.getNbJoueurs()>=6) {
						this.getLabelObsNbGrainesJ6().setText(""+monModelePartie.getArrayListJoueurs().get(5).getNbGraines());
						this.getLabelObsNbMenhirsJ6().setText(""+monModelePartie.getArrayListJoueurs().get(5).getNbMenhirs());
						this.getLabelObsDerniereActionJ6().setText(monModelePartie.getArrayListJoueurs().get(5).getDerniereAction());
						if (monModelePartie.getArrayListJoueurs().get(5).getTypeStrategy() instanceof DefensiveStrategy) {
							this.getLabelObsTypeStrategieJ6().setText("Défensive");
						}
						else {
							this.getLabelObsTypeStrategieJ6().setText("Offensive");
						}
					}
				}
			}
		}
		
		this.getLabelObsVainqueur().setText(monModelePartie.getVainqueur());
		
		this.getLabelObsMancheCourante().setText(""+monModelePartie.getNumMancheCourante());
		this.getLabelObsTourCourant().setText(""+monModelePartie.getM().getNumTourCourant());
		
		this.getLabelObsSaisonCourante().setText(""+monModelePartie.getM().getMapSaison().get(monModelePartie.getM().getNumTourCourant()));
	}
	
	

	/**
	 * Intervient dans le carde du pattern Observer-Observable <br>
	 * Met à jour les composants de la frame <br>
	 * Est surchargée pour pouvoir être appelée plus facilement
	 */
	public void update() {
		
		this.getLabelObsNbGraines().setText(""+monModelePartie.getArrayListJoueurs().get(0).getNbGraines());
		this.getLabelObsNbMenhirs().setText(""+monModelePartie.getArrayListJoueurs().get(0).getNbMenhirs());
		
		this.getLabelObsNbGrainesJ2().setText(""+monModelePartie.getArrayListJoueurs().get(1).getNbGraines());
		this.getLabelObsNbMenhirsJ2().setText(""+monModelePartie.getArrayListJoueurs().get(1).getNbMenhirs());
		if (monModelePartie.getArrayListJoueurs().get(1).getTypeStrategy() instanceof DefensiveStrategy) {
			this.getLabelObsTypeStrategieJ2().setText("Défensive");
		}
		else {
			this.getLabelObsTypeStrategieJ2().setText("Offensive");
		}
		//Pour les actions effectuées
		this.getLabelObsDerniereActionJ1().setText(monModelePartie.getArrayListJoueurs().get(0).getDerniereAction());
		this.getLabelObsDerniereActionJ2().setText(monModelePartie.getArrayListJoueurs().get(1).getDerniereAction());
		
		
		//On met aussi à jour les autres joueurs s'il y en a
		if (monModelePartie.getNbJoueurs()>=3) {
			this.getLabelObsNbGrainesJ3().setText(""+monModelePartie.getArrayListJoueurs().get(2).getNbGraines());
			this.getLabelObsNbMenhirsJ3().setText(""+monModelePartie.getArrayListJoueurs().get(2).getNbMenhirs());
			this.getLabelObsDerniereActionJ3().setText(monModelePartie.getArrayListJoueurs().get(2).getDerniereAction());
			if (monModelePartie.getArrayListJoueurs().get(2).getTypeStrategy() instanceof DefensiveStrategy) {
				this.getLabelObsTypeStrategieJ3().setText("Défensive");
			}
			else {
				this.getLabelObsTypeStrategieJ3().setText("Offensive");
			}
			if (monModelePartie.getNbJoueurs()>=4) {
				this.getLabelObsNbGrainesJ4().setText(""+monModelePartie.getArrayListJoueurs().get(3).getNbGraines());
				this.getLabelObsNbMenhirsJ4().setText(""+monModelePartie.getArrayListJoueurs().get(3).getNbMenhirs());
				this.getLabelObsDerniereActionJ4().setText(monModelePartie.getArrayListJoueurs().get(3).getDerniereAction());
				if (monModelePartie.getArrayListJoueurs().get(3).getTypeStrategy() instanceof DefensiveStrategy) {
					this.getLabelObsTypeStrategieJ4().setText("Défensive");
				}
				else {
					this.getLabelObsTypeStrategieJ4().setText("Offensive");
				}
				if (monModelePartie.getNbJoueurs()>=5) {
					this.getLabelObsNbGrainesJ5().setText(""+monModelePartie.getArrayListJoueurs().get(4).getNbGraines());
					this.getLabelObsNbMenhirsJ5().setText(""+monModelePartie.getArrayListJoueurs().get(4).getNbMenhirs());
					this.getLabelObsDerniereActionJ5().setText(monModelePartie.getArrayListJoueurs().get(4).getDerniereAction());
					if (monModelePartie.getArrayListJoueurs().get(4).getTypeStrategy() instanceof DefensiveStrategy) {
						this.getLabelObsTypeStrategieJ5().setText("Défensive");
					}
					else {
						this.getLabelObsTypeStrategieJ5().setText("Offensive");
					}
					if (monModelePartie.getNbJoueurs()>=6) {
						this.getLabelObsNbGrainesJ6().setText(""+monModelePartie.getArrayListJoueurs().get(5).getNbGraines());
						this.getLabelObsNbMenhirsJ6().setText(""+monModelePartie.getArrayListJoueurs().get(5).getNbMenhirs());
						this.getLabelObsDerniereActionJ6().setText(monModelePartie.getArrayListJoueurs().get(5).getDerniereAction());
						if (monModelePartie.getArrayListJoueurs().get(5).getTypeStrategy() instanceof DefensiveStrategy) {
							this.getLabelObsTypeStrategieJ6().setText("Défensive");
						}
						else {
							this.getLabelObsTypeStrategieJ6().setText("Offensive");
						}
					}
				}
			}
		}
		
		this.getLabelObsVainqueur().setText(monModelePartie.getVainqueur());
		
		this.getLabelObsMancheCourante().setText(""+monModelePartie.getNumMancheCourante());
		this.getLabelObsTourCourant().setText(""+monModelePartie.getM().getNumTourCourant());
		
		this.getLabelObsSaisonCourante().setText(""+monModelePartie.getM().getMapSaison().get(monModelePartie.getM().getNumTourCourant()));
	}


}

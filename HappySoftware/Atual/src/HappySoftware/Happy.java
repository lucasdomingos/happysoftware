package HappySoftware;



import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.plaf.SliderUI;


import Telas.*;
import Util.GerenteConxao;
import Util.TesteConexao;

public class Happy {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {

        Splash s = new Splash();
		 
        Thread t = new Thread(s);
		//Runnable s = new Splash();
     t.start();
		
		String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
				
		for (int i = 1; i <= 1000000; i++) {
			char caractere = letras.charAt(new Random().nextInt(25)); 
			//System.out.print(caractere);
			
			if(i%1==0){
				System.out.print("\n");
			}
			if(i%100000==0){
				s.atualizar();
			}
			
		}
		
		t.interrupt();
		s.setVisible(false);
	    GerenteConxao test = new GerenteConxao();
	    test.getConexao();
	    TesteConexao testing = new TesteConexao();
	    testing.testing();
		TelaPrincipal abrir = new TelaPrincipal();
		abrir.setLocationRelativeTo(null);
		abrir.setVisible(true);
	}
	
	
}

	
	
	
	class Splash extends JWindow implements Runnable{
		int a=1;
		private JLabel carregando;
		private ImageIcon logo = new ImageIcon(Splash.class.getClassLoader().getResource("img/Splash.png"));
		private JProgressBar barraProgresso;
		
		public Splash() {

			setSize(540, 310);
			setLocationRelativeTo(null);
			setLayout(null);
			
			carregando = new JLabel("Carregando...");
			carregando.setIcon(logo);
			carregando.setBounds(0, 0, 540, 310);
			carregando.setHorizontalAlignment(JLabel.CENTER);
			carregando.setVerticalAlignment(JLabel.CENTER);
			add(carregando);
			
			barraProgresso = new JProgressBar();
			barraProgresso.setBounds(0, 280, 538, 7);
			barraProgresso.setForeground(Color.decode("#FF4500")); //#FF4500 #FF0000
			barraProgresso.setStringPainted(true);
			add(barraProgresso);
			
			setVisible(true);
		}

		public void atualizar(){
			
			int current = barraProgresso.getValue(); 
			
			
			if(current < 100){
				int next = current + 10;
				barraProgresso.setValue(next);
				barraProgresso.setString(next+"%");
			
			} else {
				dispose();
			}
		}
		
		public void run() {
			
			try {
				for (int i = 1; i <= 10; i++) {
					
				
					Thread.sleep(1000);
					//carregando.setText("carregando...("+i+"s)");
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}	



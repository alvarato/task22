package AppMain;

import java.awt.EventQueue;

import controllers.Controlador;
import models.Cliente;
import views.Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainApp {

	private JPanel contentPane;
	
	public static void main (String[] args) {
		Cliente modelo = new Cliente();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo,vista);
		controlador.iniciarVista();
		//controlador.addUser();
	}

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
}

package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class Vista extends JFrame {

	private JPanel contentPane;
	public JTextField textField_BuscarNombre;
	public JTextField textField_Nombre;
	public JTextField textField_Apellido;
	public JTextField textField_Direccion;
	public JTextField textField_Fecha;
	public JTextField textField_Dni;
	public JButton btnBorrarTodo, btnBuscar, btnCrearTabla, btnAñadirCliente;
	public JTextField textField_IdABorrar;
	public JTextArea textArea;


	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1196, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	//	setContentPane(contentPane);
		getContentPane().setLayout(null);

		btnBuscar = new JButton("Buscar por nombre");
		btnBuscar.setBounds(748, 12, 168, 43);
		getContentPane().add(btnBuscar);

		textField_BuscarNombre = new JTextField();
		textField_BuscarNombre.setBounds(562, 12, 160, 43);
		getContentPane().add(textField_BuscarNombre);
		textField_BuscarNombre.setColumns(10);

		btnBorrarTodo = new JButton("Borrar por ID");
		btnBorrarTodo.setBounds(206, 466, 117, 25);
		getContentPane().add(btnBorrarTodo);

		btnCrearTabla = new JButton("Crear tabla");
		btnCrearTabla.setBounds(246, 18, 150, 31);
		getContentPane().add(btnCrearTabla);

		textField_Nombre = new JTextField();
		textField_Nombre.setBounds(39, 151, 114, 19);
		getContentPane().add(textField_Nombre);
		textField_Nombre.setColumns(10);

		textField_Apellido = new JTextField();
		textField_Apellido.setColumns(10);
		textField_Apellido.setBounds(39, 184, 114, 19);
		getContentPane().add(textField_Apellido);

		textField_Direccion = new JTextField();
		textField_Direccion.setColumns(10);
		textField_Direccion.setBounds(39, 212, 114, 19);
		getContentPane().add(textField_Direccion);

		textField_Fecha = new JTextField();
		textField_Fecha.setColumns(10);
		textField_Fecha.setBounds(39, 244, 114, 19);
		getContentPane().add(textField_Fecha);

		textField_Dni = new JTextField();
		textField_Dni.setColumns(10);
		textField_Dni.setBounds(39, 270, 114, 19);
		getContentPane().add(textField_Dni);

		JLabel lblNombre = new JLabel("Apellido");
		lblNombre.setBounds(191, 186, 70, 15);
		getContentPane().add(lblNombre);

		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(191, 153, 70, 15);
		getContentPane().add(lblNombre_1);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(191, 214, 70, 15);
		getContentPane().add(lblDireccion);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(191, 246, 70, 15);
		getContentPane().add(lblFecha);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(191, 272, 70, 15);
		getContentPane().add(lblDni);

		JLabel lblNombre_1_1 = new JLabel("Panel de clientes");
		lblNombre_1_1.setBounds(50, 12, 178, 53);
		getContentPane().add(lblNombre_1_1);
		
		btnAñadirCliente = new JButton("Añadir Cliente");
		btnAñadirCliente.setBounds(39, 306, 150, 31);
		getContentPane().add(btnAñadirCliente);
		
		textField_IdABorrar = new JTextField();
		textField_IdABorrar.setBounds(39, 469, 114, 19);
		getContentPane().add(textField_IdABorrar);
		textField_IdABorrar.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(395, 101, 789, 362);
		getContentPane().add(textArea);

		btnCrearTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

	}
}

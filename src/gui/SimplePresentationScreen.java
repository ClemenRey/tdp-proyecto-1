package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

import java.util.Date;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblNewLabel;
	private JTextField txtStudentdatageti;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private Date fecha;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		fecha= new Date();
		
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 211);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		lblNewLabel = new JLabel("LU");
		lblNewLabel.setBounds(26, 11, 46, 14);
		tabInformation.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(26, 36, 46, 14);
		tabInformation.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(26, 61, 46, 14);
		tabInformation.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(26, 86, 46, 14);
		tabInformation.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GitHub URL");
		lblNewLabel_4.setBounds(26, 111, 61, 14);
		tabInformation.add(lblNewLabel_4);
		
		txtStudentdatageti = new JTextField();
		txtStudentdatageti.setText(" "+studentData.getId());
		txtStudentdatageti.setBounds(122, 8, 234, 20);
		tabInformation.add(txtStudentdatageti);
		txtStudentdatageti.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText(studentData.getLastName());
		textField_1.setBounds(122, 33, 234, 20);
		tabInformation.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText(studentData.getFirstName());
		textField_2.setBounds(122, 58, 234, 20);
		tabInformation.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText(studentData.getMail());
		textField_3.setBounds(122, 83, 234, 20);
		tabInformation.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText(studentData.getGithubURL());
		textField_4.setBounds(122, 108, 234, 20);
		tabInformation.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Esta ventana fue generada el  "+ fecha.toGMTString()) ;
		lblNewLabel_6.setBounds(10, 158, 405, 14);
		tabInformation.add(lblNewLabel_6);
		contentPane.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(599, 5, 5, 211);
		contentPane.add(tabbedPane_1);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/foto.jpg")));
		lblNewLabel_5.setBounds(445, 26, 144, 184);
		contentPane.add(lblNewLabel_5);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 527);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnInicio = new JButton("In\u00EDcio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal principal = new Principal();
				principal.setVisible(true);
				dispose();
			}
		});
		menuBar.add(btnInicio);
		
		JButton btnCadastro = new JButton("Cadastro");
		menuBar.add(btnCadastro);
		
		JButton btnVisualizar = new JButton("Visualizar");
		menuBar.add(btnVisualizar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoDeRegistro = DefaultComponentFactory.getInstance().createLabel("Tipo de Registro:");
		lblTipoDeRegistro.setBounds(10, 11, 146, 24);
		contentPane.add(lblTipoDeRegistro);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (comboBox.getSelectedItem().toString().equals("Aluno")) {
					campoNome.setEnabled(true);
			}
				else {
					campoNome.setEnabled(false);
					string nome = "ok";
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aluno", "Funcion\u00E1rio"}));
		comboBox.setBounds(10, 36, 174, 20);
		contentPane.add(comboBox);
		
		JLabel lblNome = DefaultComponentFactory.getInstance().createLabel("Nome");
		lblNome.setBounds(10, 122, 92, 14);
		contentPane.add(lblNome);
		
		campoNome = new JTextField();
		campoNome.setEnabled(false);
		campoNome.setBounds(10, 147, 297, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 178, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 203, 146, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 234, 46, 14);
		contentPane.add(lblEndereo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 259, 297, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEspecifique = DefaultComponentFactory.getInstance().createLabel("Especifique:");
		lblEspecifique.setBounds(10, 67, 92, 14);
		contentPane.add(lblEspecifique);
		
		JComboBox specify_aluno = new JComboBox();
		specify_aluno.setModel(new DefaultComboBoxModel(new String[] {"Aluno Gradua\u00E7\u00E3o", "Aluno P\u00F3s - Gradua\u00E7\u00E3o"}));
		specify_aluno.setBounds(10, 89, 174, 20);
		contentPane.add(specify_aluno);

	}
}


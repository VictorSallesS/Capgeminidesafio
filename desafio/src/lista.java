

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;

public class lista {

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JFormattedTextField textField_2;
	public JFormattedTextField textField_3;
	public JTextField textField_4;
	ArrayList<Anuncio> lista = new ArrayList();
	public JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lista window = new lista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		textField = new JTextField();
		textField.setBounds(170, 29, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 60, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JFormattedTextField();
		textField_2.setBounds(170, 91, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JFormattedTextField();
		textField_3.setBounds(170, 122, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(170, 153, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome do an\u00FAncio");
		lblNewLabel.setBounds(23, 32, 119, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente");
		lblNewLabel_1.setBounds(23, 63, 119, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de in\u00EDcio");
		lblNewLabel_2.setBounds(23, 94, 119, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data de t\u00E9rmino");
		lblNewLabel_3.setBounds(23, 125, 119, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Investimento por dia");
		lblNewLabel_4.setBounds(23, 156, 119, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			public void  mouseClicked(MouseEvent e) {
				Anuncio cliente = new Anuncio (textField, textField_1,textField_2,textField_3,textField_4);
				lista.add(cliente);
				System.out.println(cliente.investimentoPorDia);
			}
		});
		btnNewButton.setBounds(170, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		/*btnNewButton_2 = new JButton("Listar");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i = 0;i<lista.size();i++) {
					System.out.println("Anúncio "+ lista.get(i).cliente);
					System.out.println("Valor total investido: "  );
			}
			}});
		btnNewButton_2.setBounds(167, 218, 89, 23);
		frame.getContentPane().add(btnNewButton_2);*/
		}	
}


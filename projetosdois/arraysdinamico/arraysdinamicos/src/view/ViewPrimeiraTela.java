package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class ViewPrimeiraTela {

	private JFrame frame;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela window = new ViewPrimeiraTela();
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
	public ViewPrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("nome");
		lblNome.setOpaque(true);
		lblNome.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		lblNome.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNome.setIcon(new ImageIcon("D:\\Arquivos Gustavo\\Downloads\\311664890_1562427517533950_700447092507005633_n.jpg"));
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setForeground(new Color(139, 0, 139));
		lblNome.setBackground(new Color(220, 20, 60));
		lblNome.setBounds(20, 11, 370, 239);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(129, 120, 181, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnBotao = new JButton("botaoaipqp");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "ai que xerequinha" + txtNome.getText());
			}
		});
		btnBotao.setBounds(174, 174, 89, 23);
		frame.getContentPane().add(btnBotao);
	}
}

package ui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComponentesCalculadora extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panelPrincipal;
	private JPanel panelCalculadora;
	protected JTextField txtNum1;
	protected JTextField txtNum2;
	protected JTextField txtRes;
	protected JLabel calculadora;
	protected JLabel sinalMais;
	protected JButton btnIgual;

	public ComponentesCalculadora() {
		super("Calculadora de Soma");
		inicializaControles();
	}

	private void inicializaControles() {
		panelPrincipal = new JPanel(new GridLayout(2, 1, 5, 5));
		panelCalculadora = new JPanel();
		txtNum1 = new JTextField();
		txtNum2 = new JTextField();
		txtRes = new JTextField();
		sinalMais = new JLabel(" + ");
		calculadora = new JLabel("Calculadora");
		btnIgual = new JButton("=");
		
		calculadora.setHorizontalAlignment(JLabel.CENTER);
		calculadora.setFont(txtNum1.getFont().deriveFont(24F));

		// txtNum1
		txtNum1.setPreferredSize(new Dimension(100, 30));
		txtNum1.setHorizontalAlignment(JTextField.CENTER);
		txtNum1.setFont(txtNum1.getFont().deriveFont(20F));

		// txtNum2
		txtNum2.setPreferredSize(new Dimension(100, 30));
		txtNum2.setHorizontalAlignment(JTextField.CENTER);
		txtNum2.setFont(txtNum2.getFont().deriveFont(20F));

		// txtRes
		txtRes.setPreferredSize(new Dimension(100, 30));
		txtRes.setHorizontalAlignment(JTextField.CENTER);
		txtRes.setFont(txtRes.getFont().deriveFont(20F));
		txtRes.setEditable(false);

		// btnIgual
		btnIgual.setFont(btnIgual.getFont().deriveFont(20F));

		panelCalculadora.add(txtNum1);
		panelCalculadora.add(sinalMais);
		panelCalculadora.add(txtNum2);
		panelCalculadora.add(btnIgual);
		panelCalculadora.add(txtRes);
		
		panelPrincipal.add(calculadora);
		panelPrincipal.add(panelCalculadora);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(480, 300));
		this.pack();
		this.setLocationRelativeTo(null);
		this.add(panelPrincipal);
	}

	public void mostrarTela() {
		this.setVisible(true);
	}

}

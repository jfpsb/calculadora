package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaCalculadora extends ComponentesCalculadora {
	private static final long serialVersionUID = 1L;
	
	private JFrame owner = this;

	public TelaCalculadora() {
		btnIgual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String num1, num2, res;
				int numInt1, numInt2, resInt;

				num1 = txtNum1.getText();
				num2 = txtNum2.getText();

				try {
					numInt1 = Integer.parseInt(num1);
					numInt2 = Integer.parseInt(num2);
					
					resInt = numInt1 + numInt2;
					
					res = String.valueOf(resInt);
					
					txtRes.setText(res);
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(owner, "Você digitou valores inválidos.\n\n" + ex.getMessage());
				}
			}

		});
	}
}

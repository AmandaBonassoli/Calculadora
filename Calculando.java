import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

public class Calculando{

	
	public static void main (String [] args) {
		
		Calculadora();
}
	
	public static void Calculadora() {
		
		JFrame fJanela = new JFrame();
		fJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fJanela.setBounds(150, 150, 288, 380);
		fJanela.setLayout(null);
		fJanela.setResizable(false);
		fJanela.setVisible(true);

// ------------------------------------------------------------------------------------------

		JPanel pPainel = new JPanel();
		pPainel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null)); //borda
		fJanela.add(pPainel).setBounds(10,10,259,60);
		pPainel.setBackground(Color.WHITE);
		
// ------------------------------------------------------------------------------------------
		
		JButton btnApagar = new JButton(new ImageIcon("C:\\Users\\Amanda\\workspace\\Calculadora\\imagem\\L.png"));
		fJanela.add(btnApagar).setBounds(10, 125, 48, 35);
		
		JButton btnCE = new JButton("CE");
		btnCE.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btnCE).setBounds(63, 125, 48, 35);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btnC).setBounds(116, 125, 48, 35);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btnDividir).setBounds(169, 125, 48, 35);

		
// ------------------------------------------------------------------------------------------		
		
		JButton btn7 = new JButton("7");
		btn7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn7.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn7).setBounds(10, 170, 48, 35);
		
		
		JButton btn8 = new JButton("8");
		btn8.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn8.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn8).setBounds(63, 170, 48, 35);
		
		JButton btn9 = new JButton("9");
		btn9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn9.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn9).setBounds(116, 170, 48, 35);
		
		JButton btnVezes = new JButton("*");
		btnVezes.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btnVezes).setBounds(169, 170, 48, 35);
		
// ------------------------------------------------------------------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn4.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn4).setBounds(10, 215, 48, 35);
		
		JButton btn5 = new JButton("5");
		btn5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn5.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn5).setBounds(63, 215, 48, 35);
		
		JButton btn6 = new JButton("6");
		btn6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn6.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn6).setBounds(116, 215, 48, 35);
		
		JButton btnMais = new JButton("+");
		btnMais.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btnMais).setBounds(169, 215, 48, 35);
		
	
		

// ------------------------------------------------------------------------------------------
		
		JButton btn1 = new JButton("1");
		btn1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn1.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn1).setBounds(10, 260, 48, 35);
		
		JButton btn2 = new JButton("2");
		btn2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn2.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn2).setBounds(63, 260, 48, 35);
		
		JButton btn3 = new JButton("3");
		btn3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn3.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn3).setBounds(116, 260, 48, 35);
		
		JButton btnMenos = new JButton("-");
		btnMenos.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btnMenos).setBounds(169, 260, 48, 35);
		
// -----------------------------------------------------------------------------------------
		
		JButton btn0 = new JButton("0");
		btn0.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn0.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btn0).setBounds(10, 305, 100, 35);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnVirgula.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btnVirgula).setBounds(116, 305, 48, 35);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Calibri", Font.BOLD, 10));
		fJanela.add(btnIgual).setBounds(169, 305, 48, 35);
		
		
	}
}

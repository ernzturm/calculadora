
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class intento3 {

	public static void main(String[] args) {
		
tr uu=new tr();
	}

}
class tr extends JFrame{
public tr() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("calculadora");
	setBounds(200,200,450,300);
    add(new tr2());
	setVisible(true);
}
}
class tr2 extends JPanel {
	public tr2() {
		azar=true;
	setLayout(new BorderLayout());
	top =new JButton ("0");
	add(top,BorderLayout.NORTH);
	top.setEnabled(false);
	max=new JPanel();
	max.setLayout(new GridLayout(4,4));
	add(max,BorderLayout.CENTER);
	ActionListener jei=new Act();
	ActionListener jei2=new Act2();
   trix("7",jei);
   trix("8",jei);
   trix("9",jei);
   trix("/",jei2);
   trix("4",jei);
   trix("5",jei);
   trix("6",jei);
   trix("*",jei2);
   trix("1",jei);
   trix("2",jei);
   trix("3",jei);
   trix("+",jei2);
   trix("0",jei);
   trix("=",jei2);
   trix(".",jei);
   trix("-",jei2);
   jup="=";
	}
	public void trix(String bp, ActionListener oyente2) {
		JButton hip=new JButton(bp);
		max.add(hip);
		hip.addActionListener(oyente2);
	}
	class Act implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		String arma=e.getActionCommand();
		if(azar) {
			top.setText("");
			azar=false;
			
		}
		top.setText(top.getText() + arma);
		}
	}
	class Act2 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String yup=e.getActionCommand();
		calcular(Double.parseDouble(top.getText()));
		jup=yup;
		azar=true;
	}
	}
	public void calcular(Double x) {
		if(jup.equals("+")) {
			cal+=x;
		}
		else if(jup.equals("-")) {
			cal-=x;
		}
		else if(jup.equals("*")) {
			cal*=x;
		}
		else if(jup.equals("/")) {
			cal/=x;
		}
		else if(jup.equals("=")) {
			cal=x;
		}
		top.setText("" + cal);
	}
	
	private JPanel max;
	private JButton top;
	public boolean azar;
	public double cal;
	private String jup;
}


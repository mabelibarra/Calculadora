package main;
import javax.swing.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int op=0;
        double n1,n2,s,m,d,r,ra,p=1,l,f=1;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("\nCalculadora\n"+
            "************************\n"+
            
            "[1] RESTAR\n"+
            "[2] SUMAR\n"+
            "[4] DIVIDIR\n"+
            "[3] MULTIPLICAR\n"+
            "[5] RADICACION\n"+
            "[6] POTENCIA\n"+
            "[7] LOGARITMO\n"+
            "[8] FACTORIAL\n"+
            "[9] SALIR\n"+
            "Ingresa una opcion:\n\n"));

            switch(op)
            {
            	case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("digite numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("digite numero 2"));
                    s=n1+n2;
                    JOptionPane.showMessageDialog(null,"resta:"+s);
                    break;
	case 2:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("digite numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("digite numero 2"));
                    r=n1-n2;
                    JOptionPane.showMessageDialog(null,"La suma es:"+r);
                    break;


 





package calculadora;

import javax.swing.*;

public class Calculadora 
{

    public static void main(String[] args) 
    {
        int opcion=0;
        double numero1, numero2, s, r, m, d, p, raiz;
        do
        {
            opcion= Integer.parseInt(JOptionPane.showInputDialog
                    ("Calculadora \n" +
                    "1) Suma \n" +
                    "2) Resta \n" +
                    "3) MultiplicaciÃ³n \n" +
                    "4) Division \n" +
                    "5) Potencia \n" +
                    "6) Raiz \n" +
                    "7) Salir \n" +
                    "\n Ingresa una opciÃ³n: "));
            switch(opcion)
            {
                case 1:
                    numero1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el primer numero: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el segundo numero: "));
                    s= numero1+numero2;
                    JOptionPane.showMessageDialog(null, "La suma es: " +s);
                    break;

                    case 2:
                    numero1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el primer numero: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el segundo numero: "));
                    r= numero1-numero2;
                    JOptionPane.showMessageDialog(null, "La resta es: " +r);
                    break;
                    case 3:
                    numero1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el primer numero: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el segundo numero: "));
                    m= numero1*numero2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: " +m);
                    break;
                    case 4:
                    numero1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el primer numero: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el segundo numero: "));
                    d= numero1/numero2;
                    JOptionPane.showMessageDialog(null, "La division es: " +d);
                    break;
                    case 5:
                    numero1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el primer numero: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa la potencia: "));
                    p=Math.pow(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "La potencia es: " +p);
                    break;
                    case 6:
                    numero1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el primer numero: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa la raiz: "));
                    raiz=Math.pow(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "La raiz es: " +raiz);
                    break;
            }
        }
        while(opcion!=7);
    }
    
}
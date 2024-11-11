package manejostrings;
import javax.swing.JOptionPane;
//import java.util.Scanner;
/**
 *
 * @author Angel Rico
 */
public class ManejoStrings {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Escribe la Frase");
        //Scanner sc = new Scanner(System.in);
        String cadena = JOptionPane.showInputDialog("Escribe la Frase");
        //cadena.length(); //longitud de un String
        Contar ct = new Contar();
        ct.contarCaracteres(cadena);
    }
}

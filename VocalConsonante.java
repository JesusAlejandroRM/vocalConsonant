package com.mycompany.vocalconsonante;
import javax.swing.JOptionPane;

public class VocalConsonante {

    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog(null, "Ingresa tu frase: ");    
        System.out.println("Longitud de la cadena: " + str1.length());//.lenght sirve para conocer la longitud de la cadena
        Vocales v = new Vocales(str1);
        boolean esVocal = v.vocal();
        while(esVocal){
            str1 = JOptionPane.showInputDialog(null, "Ingresa tu frase: ");
            v = new Vocales(str1);
            esVocal = v.vocal();
        }
    }
}
class Vocales{
    String str1;
    public Vocales(String str1){
        this.str1=str1;
    }
    public boolean vocal(){
        boolean flag = false;
        char c;
        String v = " es vocal", nv = " es consonante";
        for(int i = 0; i < (str1.length()); i++){
            c = str1.charAt(i);
            if(c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'|| c == 'I' || c == 'O' || c == 'U' || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' || c == 'Á' || c == 'É' || c == 'Í' || c == 'Ó' || c == 'Ú'){
                System.out.println(c + v);
                flag = true;
            }
            else{
                System.out.println(c + nv);
                if(c == 'p' || c == 'P'){
                    flag = false;}
                else{
                    flag = true;
                }
            }
        }
        return flag;
    }
}

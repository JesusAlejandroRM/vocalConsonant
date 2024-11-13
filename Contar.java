package manejostrings;

public class Contar {
    public void contarCaracteres(String cadena){
        char caracter;
        Determinar dt = new Determinar();
        for(int i=0; i<cadena.length(); i++){
            caracter = cadena.charAt(i);
            dt.determinarTipo(caracter);
        }
        System.out.println("Existen: ");
        System.out.printf("%d Vocales%n", dt.getVocal());
        System.out.printf("%d Consonantes%n", dt.getConsonantes());
        System.out.printf("%d Simbolos%n", dt.getSimbolos());
    }
    
}

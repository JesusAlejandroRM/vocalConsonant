package manejostrings;


public class Determinar {
    int vocales = 0, consonantes = 0, simbolos = 0, ascii = 0;
    public void determinarTipo(char caracter){
        ascii = caracter;
        System.out.println("valor de ascii " + ascii);
        if( (ascii == 65 || ascii == 97) || (ascii == 69 || ascii == 101) || (ascii == 73 || ascii == 105) || (ascii == 79 || ascii == 111) || (ascii == 85 || ascii == 117) || (ascii == 193 || ascii == 225) || (ascii == 201 || ascii == 233) || (ascii == 205 || ascii == 237) || (ascii == 211 || ascii == 243)  || (ascii == 218 || ascii == 250)){
            vocales += 1;
            System.out.println(vocales);
        }else if((ascii > 32 && ascii <= 47) || (ascii >= 58 && ascii <= 64) || (ascii >= 91 && ascii <= 96) || (ascii >= 123 && ascii < 160) ){
            simbolos += 1;
            System.out.println(simbolos);
        }else if(!(ascii == 32)){
            consonantes += 1;
            System.out.println(consonantes);
        }
    }
    public int getVocal(){
        return vocales;
    }
    public int getConsonantes(){
        return consonantes;
    }
    public int getSimbolos(){
        return simbolos;
    }
}

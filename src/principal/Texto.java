package principal;

public class Texto {
    //Atributos de la clase
    private String texto;
    private final int TAMAÑOTEXTO;
    static final String VOCALES ="aeiou";

    //Constructor de la clase
    public Texto(int TAMAÑOTEXTO){
        this.TAMAÑOTEXTO=TAMAÑOTEXTO;
    }
    //Metodo basico para imprimir la cadena
    public void imprimir(){
        System.out.println(texto);
    }

    //Metodo para añadir caracteres al principio
    public void insertarCaracterPrincipio(char caracter){
        if (TAMAÑOTEXTO>texto.length()){
            texto=caracter+texto;
        }
    }

    //Metodo para añadir un caracter al final
    public void insertarCaracterFinal(char caracter){
        if (TAMAÑOTEXTO>texto.length()){
            texto=texto+caracter;
        }
    }

    //Metodo para añadir una cadena al principio
    public void insertarCadenaPrincipio(String cadena){
        if (TAMAÑOTEXTO>texto.length()){
            texto=texto+cadena;
        }
    }

    //Metodo para añadir una cadena al final
    public void insertarCadenaFinal(String cadena){
        if (TAMAÑOTEXTO>texto.length()){
            texto=cadena+texto;
        }
    }

   //Metodo para comprobar si es vocal
    private  boolean comprobadorVocal(char caracter){
        boolean vocal= false;
        if(VOCALES.indexOf(caracter) != -1){
            vocal=true;
        }
        return vocal;
    }

    //Metodo para obtener el numero de vocales
    public int recuentoVocales(char caracter){
        int vocales=0;
        for(int i=0; i < texto.length(); i++){
            if (comprobadorVocal(texto.charAt(i))){
                vocales++;
            }
        }
        return vocales;
    }
}

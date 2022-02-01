package principal;

public class MainEj5 {

    public static void main(String[] args) {
        Ej5 radio1 = new Ej5();
        //Variable para alternar entre metodos
        int opcion=1;

        if (opcion==1){
            /*Metodo que calcula la frecuencia total subiendola a traves de los saltos introducidos
            si se pasa de 108 (FRECUENCIAMAX) volverá a 80 (FRECUENCIAMIN)*/
            radio1.bajarFrecuencia(1);
        }
        else{
            /*Metodo que calcula la frecuencia total bajandola a traves de los saltos introducidos
            si se pasa de 80 (FRECUENCIAMIN) volverá a 108 (FRECUENCIAMAX)*/
            radio1.subirFrecuencia(1);
        }

        System.out.println(radio1.getSintonizador());
    }
}

package principal;

public class Ej3 {

    //Definimos el enum
    enum Vehiculos {
        Nulo, COCHE, CAMION, BARCO, TREN, AVION
        }

    public static void main(String[] args) {

        //Asignamos variables a cada campo del enum
        Vehiculos v1 , v2, v3, v4, v5;

        v1= Vehiculos.COCHE;
        v2= Vehiculos.CAMION;
        v3= Vehiculos.BARCO;
        v4= Vehiculos.TREN;
        v5= Vehiculos.AVION;

        System.out.println("Coche = "+v1.ordinal());
        System.out.println("Camion = "+v2.ordinal());
        System.out.println("Barco = "+v3.ordinal());
        System.out.println("Tren = "+v4.ordinal());
        System.out.println("Avion = "+v5.ordinal());

        //Creamos algunas comparaciones para revisar que funcione
        if(v1.compareTo(v5)<0) {
            System.out.println("v5 es mas rapido que v1");
        }
        if(v4.compareTo(v2)>0){
            System.out.println("v4 es mas rapido que v2");
            }
        }



    }

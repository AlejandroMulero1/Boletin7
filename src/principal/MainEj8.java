package principal;
import java.util.Scanner;
public class MainEj8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Punto punto1= new Punto();

        //Variables a usar
        int opcion, coordX, coordY;
        double resultado;
        boolean igualdad;

        //Obtención coordenadas del punto
        System.out.println("Introduzca la coordenada x del punto");
        punto1.setX(sc.nextInt());
        System.out.println("Introduzca la coordenada y del punto");
        punto1.setY(sc.nextInt());

        //Menu para elegir entre las diversas opciones propuestas por el ejercicio
        System.out.println("Que desea calcular? (Escriba el número de la opción)");
        System.out.println("1: Igualdad entre el punto 1 y otro introducido por teclado");
        System.out.println("2: Distancia del punto 1 al origen de coordenadas");
        System.out.println("3: Distancia del punto 1 a otro punto introducido por teclado");
        opcion=sc.nextInt();
        switch (opcion) {
            //Verificación de la igualdad con otro punto introducido a traves del metodo equals de java
            case 1 -> {
                Punto punto2 = new Punto();
                System.out.println("Introduzca la coordenada x del segundo punto");
                punto2.setX(sc.nextInt());
                System.out.println("Introduzca la coordenada y del segundo punto");
                punto2.setY(sc.nextInt());
                igualdad = punto1.equals(punto2);
                if (igualdad = true) {
                    System.out.println("Ambos puntos son iguales");
                } else {
                    System.out.println("Los puntos son distintos");
                }
            }

            //Calculo de distancia del punto al origen
            case 2 -> {
                resultado = punto1.distancia();
                System.out.println("La distancia del punto al origen es " + resultado + " u");
            }

            //Calculo de distancia del punto a un segundo punto
            case 3 -> {
                System.out.println("Introduzca la coordenada x del punto 2");
                coordX = sc.nextInt();
                System.out.println("Introduzca la coordenada y del punto 2");
                coordY = sc.nextInt();
                resultado = punto1.distancia(coordX, coordY);
                System.out.println("La distancia del punto 1 al punto dos es " + resultado + " u");
            }
            //Notificación de error al usuario si inserta una opción incorrecta
            default -> System.out.println("Numero de opción incorrecto");
        }


    }
}

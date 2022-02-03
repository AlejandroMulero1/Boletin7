package principal;
import java.util.Scanner;
public class Ej8Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Punto punto1= new Punto();
        int opcion, coordX, coordY;
        double resultado;
        System.out.println("Introduzca la coordenada x del punto");
        punto1.setX(sc.nextInt());
        System.out.println("Introduzca la coordenada y del punto");
        punto1.setY(sc.nextInt());

        System.out.println("Que desea calcular? (Escriba el número de la opción)");
        System.out.println("1: Igualdad entre el punto 1 y otro introducido por teclado");
        System.out.println("2: Distancia del punto 1 al origen de coordenadas");
        System.out.println("3: Distancia del punto 1 a otro punto introducido por teclado");
        opcion=sc.nextInt();
        switch (opcion){
            case 1:

                break;
            case 2:
                resultado=punto1.distancia();
                System.out.println("La distancia del punto al origen es " +resultado+ " u");
                break;
            case 3:
                System.out.println("Introduzca la coordenada x del punto 2");
                coordX= sc.nextInt();
                System.out.println("Introduzca la coordenada y del punto 2");
                coordY= sc.nextInt();
                resultado=punto1.distancia(coordX,coordY);
                System.out.println("La distancia del punto 1 al punto dos es " +resultado+ " u");
                break;
            default:
                System.out.println("Numero de opción incorrecto");
        }


    }
}

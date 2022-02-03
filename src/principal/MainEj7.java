package principal;
import java.util.Scanner;
public class MainEj7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fraccion fraccion1= new Fraccion();
        Fraccion fraccion2= new Fraccion();
        int denominador, opcion;

        System.out.println("Introduzca el numerador");
        fraccion1.setNumerador(sc.nextInt());
        System.out.println("Introduzca el denominador");
        denominador= sc.nextInt();
        while (denominador<0){
            System.out.println("Denominador incorrecto, debe ser mayor que 0");
            denominador= sc.nextInt();
        }
        fraccion1.setDenominador(denominador);


        System.out.println("Que desea hacer con la fracción? (Introduzca el numero de la opcion)");
        System.out.println("1: Multiplicarla por otra");
        System.out.println("2: Dividirla por otra");
        System.out.println("3: Invertir el signo");
        System.out.println("4: Simplificarla");
        opcion= sc.nextInt();

        if(opcion==1 || opcion==2){
            System.out.println("Introduzca el numerador de la segunda fraccion");
            fraccion2.setNumerador(sc.nextInt());
            System.out.println("Introduzca el denominador de la segunda fraccion");
            denominador= sc.nextInt();
            while (denominador<0){
                System.out.println("Denominador incorrecto, debe ser mayor que 0");
                denominador= sc.nextInt();
            }
            fraccion2.setDenominador(denominador);
        }
        switch (opcion){
            case 1:
                fraccion1.multiplicacion(fraccion2);
                System.out.println("La fracción resultante es: "+fraccion2.getNumerador()+"/"+fraccion2.getDenominador());
                break;
            case 2:
                fraccion1.division(fraccion2);
                System.out.println("La fracción resultante es: "+fraccion2.getNumerador()+"/"+fraccion2.getDenominador());
                break;
            case 3:
                fraccion1.setNumerador(fraccion1.getNumerador()*-1);
                System.out.println("La fracción resultante es: "+fraccion1.getNumerador()+"/"+fraccion1.getDenominador());
                break;
            case 4:
                break;
            default:
                System.out.println("Numero de opcion incorrecta");
        }
    }
}

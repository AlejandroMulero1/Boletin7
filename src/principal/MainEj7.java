package principal;
import java.util.Scanner;
public class MainEj7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Creamos las variables necesarias
        int numerador,denominador, opcion;

        //Creamos la primera fraccion
        System.out.println("Introduzca el numerador de la primera fraccion");
        numerador=sc.nextInt();
        System.out.println("Introduzca el denominador de la primera fraccion");
        denominador= sc.nextInt();
        while (denominador<=0){
            System.out.println("Denominador incorrecto, debe ser mayor que 0");
            denominador= sc.nextInt();
        }
        Fraccion fraccion1= new Fraccion(numerador,denominador);


        //Creamos la segunda fraccion
        System.out.println("Introduzca el numerador de la segunda fraccion");
        numerador= sc.nextInt();
        System.out.println("Introduzca el denominador de la segunda fraccion");
        denominador= sc.nextInt();
        while (denominador<=0){
            System.out.println("Denominador incorrecto, debe ser mayor que 0");
            denominador= sc.nextInt();
        }
        Fraccion fraccion2=new Fraccion(numerador, denominador);


        //Diseñamos un menu para elegir entre las opciones que proporciona el ejercicio
        System.out.println("Que desea hacer con la fracción? (Introduzca el numero de la opcion)");
        System.out.println("1: Multiplicarla por otra");
        System.out.println("2: Dividirla por otra");
        System.out.println("3: Invertir el signo");
        System.out.println("4: Simplificarla");
        opcion= sc.nextInt();
        switch (opcion){
            case 1:
                Fraccion resultadoMultiplicacion=Fraccion.multiplicacion(fraccion1,fraccion2);
                System.out.println("La fracción resultante es: "+Fraccion.simplificar(resultadoMultiplicacion));
                break;
            case 2:
                Fraccion resultadoDivision=Fraccion.division(fraccion1,fraccion2);
                System.out.println("La fracción resultante es: "+Fraccion.simplificar(resultadoDivision));
                break;
            case 3:
                System.out.println("Desea invertir la fraccion 1 o la 2? (Escriba el numero)");
                opcion= sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("La fracción resultante es: " + Fraccion.inversionSigno(fraccion1));
                        break;

                    case 2:
                        System.out.println("La fracción resultante es: " + Fraccion.inversionSigno(fraccion2));
                        break;
                }
                break;
            case 4:
                System.out.println("Desea simplificar la fraccion 1 o la 2? (Escriba el numero)");
                opcion= sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("La fracción resultante es: " + Fraccion.simplificar(fraccion1));
                        break;

                    case 2:
                        System.out.println("La fracción resultante es: " + Fraccion.simplificar(fraccion2));
                        break;
                }
                break;
            default:
                System.out.println("Numero de opcion incorrecta");
        }
    }
}

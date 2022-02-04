package principal;

import java.util.Scanner;

public class MainEj6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hora hora=new Hora();

        //Obtenemos la hora
        System.out.println("Hora:");
        hora.setHora(sc.nextInt());
        System.out.println("Minutos:");
        hora.setMinuto(sc.nextInt());
        System.out.println("Segundos:");
        hora.setSegundo(sc.nextInt());

        //Implementamos el metodo para avanzar la hora
        System.out.println("Cuantos segundos quieres avanzar?");
        int tiempoPasado = sc.nextInt();

        for(int i=1; i<=tiempoPasado; i++) {
            hora.reloj();
        }
        System.out.println("Son las: "+hora);
    }
}

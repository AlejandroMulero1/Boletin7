package principal;
import java.util.Locale;
import java.util.Scanner;

public class MainEj1y2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Vehiculo coche = new Vehiculo();
        String datoMatricula;
        System.out.println("Ingrese matricula del vehiculo: ");
        datoMatricula =sc.nextLine();
        coche.setMatricula(datoMatricula);
        System.out.println("Ingrese marca del coche (Ford,Toyota,Suzuki,Renault,Seat).");
        datoMatricula=sc.nextLine();
        datoMatricula.toLowerCase(Locale.ROOT);
        coche.setMarca(datoMatricula);
        System.out.println("La marca del coche es " + coche.getMarca() + ".\nLa matricula es: " + coche.getMatricula() + ".");
    }
}

package principal;
import java.util.Locale;
import java.util.Scanner;

public class MainEj10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int comparacionEdad, comparacionNombre;
        Ej10 gato1 = new Ej10();
        Ej10 gato2 = new Ej10();

        //Obtencion de los nombres de los gatos
        System.out.println("Inserte el nombre del primer gato");
        gato1.setNombre(sc.nextLine().toLowerCase(Locale.ROOT));
        System.out.println("Inserte el nombre del segundo gato");
        gato2.setNombre(sc.nextLine().toLowerCase(Locale.ROOT));

        //Obtencion de las edades de los gatos
        System.out.println("Inserte la edad del primer gato");
        gato1.setEdad(sc.nextInt());
        System.out.println("Inserte la edad del segundo gato");
        gato2.setEdad(sc.nextInt());

        //Uso del metodo compareTo para comparar edades
        comparacionEdad =gato1.compareTo(gato2);
        switch (comparacionEdad){
            case 1:
                System.out.println("El primer gato tiene mas años");
                break;

            case -1:
                System.out.println("El segundo gato tiene mas años");
                break;

            default:
                System.out.println("Ambos tienen la misma edad");
        }
        comparacionNombre=gato1.compareToNombre(gato2);
        switch (comparacionNombre){
            case 1:
                System.out.println("El nombre del primer gato va primero");
                break;

            case -1:
                System.out.println("El nombre del segundo gato va primero");
                break;

            default:
                System.out.println("Tienen el mismo nombre");
        }

        
        



    }
}

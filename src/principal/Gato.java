package principal;

public class Gato implements Comparable<Gato> {
    private String nombre, color, raza;
    private int edad;

    //Constructor por defecto que añadira valores por defecto a la raza y el color ya que no son relevantes
    public Gato(){
        this.color="negro";
        this.raza="común";
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos CompareTo
    public int compareTo(Gato gato2) {
        int resultado=-1;
        if(this.edad==gato2.getEdad()){
            //Los objetos son iguales
            resultado=0;
        }else if(this.edad>gato2.getEdad()){
            //El objeto 1 es mayor que la pasada por parametro
            resultado=1;
        }
        return resultado;
    }

    //Metodo compareTo para los nombres
    public int compareToNombre(Gato gato2){
        int comparacion= this.nombre.compareTo(gato2.getNombre());
        return comparacion;
    }
}


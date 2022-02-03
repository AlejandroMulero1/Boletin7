package principal;

public class Ej10 implements Comparable<Ej10> {
    private String nombre, color, raza;
    private int edad;

    //Constructor por defecto en el que no se especifican el color o la raza
    public Ej10(){
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


    public int compareTo(Ej10 gato2) {
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

    public int compareToNombre(Ej10 gato2){
        int comparacion= this.nombre.compareTo(gato2.getNombre());
        return comparacion;
    }
}


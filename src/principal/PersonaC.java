package principal;

public class PersonaC implements Cloneable {
    public static class PesoAlturaC implements Cloneable{
        int peso;
        int altura;

        public PesoAlturaC(int peso, int altura) {
            this.peso = peso;
            this.altura = altura;
        }

        //Getter y Setter de la clase PesoAlturaC

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }
    }

    //Atributos
    String nombre, DNI;
    int edad;
    PesoAlturaC pesoAltura;

    public PersonaC(String nombre, String DNI, int edad, PesoAlturaC pesoAltura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.pesoAltura = pesoAltura;
    }


    //Getter necesario de la clase PersonaC

    public PesoAlturaC getPesoAltura() {
        return pesoAltura;
    }


    //Método de clonación superficial
    public PersonaC cloneSuperficial() throws CloneNotSupportedException {
        PersonaC prueba;
        prueba = (PersonaC)super.clone();
        return prueba;
    }

    //Metodo de clonación profunda
    public PersonaC cloneProf()  {
        PersonaC obj = null;
        try{
            obj = (PersonaC)super.clone();
        }catch (CloneNotSupportedException ex){
            System.out.println("Este objeto no es clonable");
        }
        return obj;
    }

}

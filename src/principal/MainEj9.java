package principal;


public class MainEj9 {
    public static void main(String[] args) throws CloneNotSupportedException {
        PersonaC persona1 = new PersonaC("Solomeo", null, 786, new PersonaC.PesoAlturaC(834, 550));
        PersonaC persona1copia;
        persona1copia = persona1.cloneSuperficial();
        persona1.getPesoAltura().setAltura(6);
        System.out.println(persona1.getPesoAltura().getAltura());
        System.out.println(persona1copia.getPesoAltura().getAltura());
    }
}

package principal;

public class Fraccion {
    private int numerador, denominador;
    //Constructor por defecto
    public Fraccion(){

    }

    //Geters y Setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //Metodos
    public Fraccion multiplicacion (Fraccion fraccion2){
        fraccion2.setNumerador(this.numerador* fraccion2.getNumerador());
        fraccion2.setDenominador(this.denominador* fraccion2.getDenominador());
        return fraccion2;
    }

    public Fraccion division (Fraccion fraccion2){
        int numerador, denominador;
        numerador=(this.numerador* fraccion2.getDenominador());
        denominador=(this.denominador* fraccion2.getNumerador());
        fraccion2.setNumerador(numerador);
        fraccion2.setDenominador(denominador);
        return fraccion2;
    }
}

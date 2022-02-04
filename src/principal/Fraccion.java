package principal;

public class Fraccion {
    private int numerador, denominador;
    //Constructor
    public Fraccion(int x, int y) {
        numerador=x;
        denominador=y;
    }


    //Metodos
    public static Fraccion multiplicacion(Fraccion fraccion1, Fraccion fraccion2){
        new Fraccion(fraccion1.numerador*fraccion2.numerador,fraccion1.denominador*fraccion2.denominador);

        return new Fraccion(fraccion1.numerador*fraccion2.numerador,fraccion1.denominador*fraccion2.denominador);
    }

    public static Fraccion division (Fraccion fraccion1, Fraccion fraccion2){
        return new Fraccion(fraccion1.numerador*fraccion2.denominador,fraccion1.denominador*fraccion2.numerador);
    }

    public static Fraccion inversionSigno(Fraccion fraccion){
        return new Fraccion(fraccion.numerador*-1, fraccion.denominador);
    }

    public static Fraccion simplificar(Fraccion fraccion1){
        int resultado=1;
        if(fraccion1.numerador%fraccion1.denominador==0 ||fraccion1.denominador% fraccion1.numerador==0){
            resultado=Math.min(fraccion1.numerador, fraccion1.denominador);
        }
        return new Fraccion(fraccion1.numerador/resultado, fraccion1.denominador/resultado);
    }

    public String toString(){
        return numerador+" / "+denominador;
    }
}

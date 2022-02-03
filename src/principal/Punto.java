package principal;

import java.util.Objects;

public class Punto {
    private double a,b;
    Punto(){
    }

    public double getX() {
        return a;
    }

    public void setX(int a) {
        this.a = a;
    }

    public double getY() {
        return b;
    }

    public void setY(int b) {
        this.b = b;
    }

    //Metodos
    public double distancia(){
        double resultado=Math.sqrt(Math.pow(this.a, 2) - Math.pow(this.b, 2));
        return resultado;
    }

    public double distancia(int coordX, int coordY){
        double resultado=Math.sqrt(Math.pow(coordX-this.a, 2) - Math.pow(coordY-this.b, 2));
        return resultado;
    }


}

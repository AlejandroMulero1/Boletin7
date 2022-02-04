package principal;

public class Punto {
    private double a,b;

    //Constructor por defencto
    Punto(){
    }

    //Getters y Setters
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
    //Distancia entre punto1 y el origen
    public double distancia(){
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }
    //Distancia entre punto1 y otro punto introducido
    public double distancia(int coordX, int coordY){
        return Math.sqrt(Math.pow(coordX-this.a, 2) + Math.pow(coordY-this.b, 2));
    }


}

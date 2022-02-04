package principal;

public class Hora {
    //Atributos de la clase hora
    private int hora, minuto, segundo;

    //Constructor por defecto
    public Hora(){

    }

    //Getters y Setters

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora){
        if(0 <= hora || hora <=23){
            this.hora=hora;
        }
        else{
            this.hora=0;
        }
    }

    public void setMinuto(int minuto){
        if(0 <= minuto || minuto <=60){
            this.minuto=minuto;
        }
        else{
            this.minuto=0;
        }
    }

    public void setSegundo(int segundo){
        if(0 <= segundo || segundo <=23){
            this.segundo=segundo;
        }
        else{
            this.segundo=0;
        }
    }

    //Metodo que incrementa la hora de sengundo en segundo
    public void reloj(){
        this.segundo++;
        if (segundo==60){
            this.minuto++;
            this.segundo=0;
            if(minuto==60){
                this.hora++;
                this.minuto=0;
                if (hora==24){
                    this.hora=0;
                }
            }
        }
    }
    public String toString(){
        return this.hora+" horas, "+this.minuto+" minutos, "+this.segundo+" segundos";
    }


}

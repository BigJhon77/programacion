package co.edu.utp.misiontic2022.c3;

public class Torre extends Ficha {
    
    //Atributos
    private double volumen; 
    
    //Constructor
    public Torre (String color, double volumen) {
        super(color);
        this.volumen = volumen;
    }

    public String toString(){
        return "Color Torre: " + super.getColor() + " Volumen: " + volumen;
    }

    public boolean mover(){
        return true;
    }

}
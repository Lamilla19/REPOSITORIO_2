
package model;


public abstract class Servicio {
    
    protected double Precio;

    public Servicio() {
        Precio = 0.0;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getPrecio() {
        return Precio;
    }
    public abstract double CalcularTotal();
    
    @Override
    public String toString() {
        
        return  "\n\nPrecio=" + Precio ;
    }
    
    
    
}

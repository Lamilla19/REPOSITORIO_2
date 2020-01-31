
package model;


public class Comida extends Servicio {
    private String Descripcion;
    
     private int Cantidad;

    public Comida() {
        Descripcion = " " ;
        Cantidad = 0;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    @Override
    public  double CalcularTotal(){
       
       
       return Cantidad * Precio ;
    }
    @Override
    public String toString() {
        return   "Descripcion=" + Descripcion + ", Cantidad=" + Cantidad ;
    }
     
     
}


package model;


public class Peliculas extends Servicio {
    private String codigo ; 
    private String Titulo;
    private String sinopsis ; 
    private String tiempo  ; 

    public Peliculas() {
        codigo =" " ;
        Titulo =" ";
        sinopsis =" ";
        tiempo = " ";
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setCodigo(String codigo) {
        this.codigo =codigo;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getTiempo() {
        return tiempo;
    }
    /*public  String  CalcularTiempo(){
        int Tiempo=0;
       
        int horas = (Tiempo / 3600);
        
        int minutos = ((Tiempo-horas*3600)/60);
        
        int segundos = Tiempo-(horas*3600+minutos*60);
        
        return toString() + "hora : " +horas + "minuto:" + minutos+"segundos:" + segundos ;
           
     } */      
     public  double CalcularTotal(){
         
         double x ;
         
         
         return Precio;
     }
       

    @Override
    public String toString() {
        return super.toString() + "\n\ncodigo=" + codigo + "\n\nTitulo=" + Titulo + "\n\nsinopsis=" + sinopsis + "\n\ntiempo=" + tiempo;
    }

    

    
    
    }



package Control;
import model.Peliculas;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AdmPeliculas {
    ArrayList<Peliculas>lista=null;
    
    Peliculas peli = null ;
    Validacion vali  =  null ;
    
     private static AdmPeliculas admPeliculas=null;
     
      private AdmPeliculas(){
        lista = new ArrayList<Peliculas>();
       } 
      public static AdmPeliculas getAdmPeliculas(){
            if (admPeliculas==null)
                admPeliculas=new AdmPeliculas();
            return admPeliculas ;
         }
    public boolean verificar(String codigo,String titulo, String sinopsis,String tiempo ){
    boolean X=false;
    if(!codigo.isEmpty()&&!titulo.isEmpty()&&!sinopsis.isEmpty()&&!tiempo.isEmpty())
            if(!estacodigo(codigo)){
                 X=true;
       }
     
        return X;
       }
    private boolean estacodigo(String codigo){
        
        boolean y = false;
        
        int i=0;
        
        for(Peliculas  auto: lista ){
            
            if(auto.getCodigo().compareTo(codigo)==0){
                
                y=true;
            }
                  
        }   
        return y;
    }
    public String guardar(String codigo,String titulo, String sinopsis,String tiempo ){
    String X="";
    peli=new Peliculas();
    
    peli.setCodigo(codigo);
    peli.setTitulo(titulo);
    peli.setSinopsis(sinopsis);
    //peli.setPrecio(Precio);
    peli.setTiempo(tiempo);
    
    lista.add(peli);
    X=peli.toString();
    return X;
    }
    public void llenarTabla(JTable tblPeliculas,JLabel lblTotal){
        
        DefaultTableModel modelo=null;
        
        int fila=0;
        
        if(lista.size()>0){
            
            modelo=(DefaultTableModel)tblPeliculas.getModel();
            
            for(Peliculas peli:lista){  // for sin indice 
                
            }
                modelo.addRow(new Object[1]);
                
                tblPeliculas.setValueAt(peli.getCodigo(),fila,0);// filas y columnas de mi grid
                
                tblPeliculas.setValueAt(peli.getTitulo(),fila,1);
                
                tblPeliculas.setValueAt(peli.getSinopsis(),fila,2);
                
                tblPeliculas.setValueAt(peli.getTiempo(),fila,3);
                
                //tblPeliculas.setValueAt(peli.getPrecio(),fila,4);
               
                fila++;
            }
        }
}

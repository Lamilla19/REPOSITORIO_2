
package Control;

import javax.swing.JOptionPane;


public class Validacion {
    public int leerEntero(String msg){
        String res="";
        boolean flag=false;
        int x =0;res=JOptionPane.showInputDialog(null," ");
        do{
            
                res=JOptionPane.showInputDialog(null," ");
            try{
                
                x=Integer.parseInt(res);
                flag=true;
                
                }catch(NumberFormatException y){
                
                JOptionPane.showMessageDialog(null,"ERROR SE ESPERABA UN NUMERO ENTERO");
                flag=false;
            }
        }while(flag == false);
        return x;
    }
     public String leerLetras(String msj){
       String res = "";
       
       boolean flag = true;
       
       do{
           flag = true;
           res = JOptionPane.showInputDialog(null, msj).trim();
          
           for (int i = 0; i < res.length(); i++){
               if (!Character.isLetter(res.charAt(i))&&res.charAt(i)!= ' ') 
                   flag = false;
               }
           
           
       }while(!flag);
       
        return res;
    }
    
}



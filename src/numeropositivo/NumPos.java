
package numeropositivo;


public class NumPos {
    
    int v1;
    
    public  NumPos ( int valor){
        this.v1 = valor;
        
    }
   
    public  void pos (){
        
        if (v1 > 0){
            System.out.println(" El numero iingresado es postiivo ");
        } else if (v1 == 0){
            System.out.println(" El numero ingresado es cero ");            
        } else {
            System.out.println(" El numero es negativo");
        }      
        
    }
}

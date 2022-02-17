
package numeropositivo;

import java.util.Scanner;


public class NumeroPositivo {

   
    public static void main(String[] args) {
        
        int valorIngresado;
        
        Scanner entreda = new Scanner(System.in);
        
        System.out.println(" Este programa te permite conocer si el numero ingresado en POSITIVO, NEGATIVO O CERO ");
        valorIngresado = entreda.nextInt();
        
        NumPos ps = new NumPos(valorIngresado);
        ps.pos();
        
    }
    
}

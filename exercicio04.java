package generetion.exercicio.com;

import java.util.*;

public class exercicio04 {
	
	public static void main(String[] args) {

     Scanner leia  = new Scanner(System.in);
   

    int numero;
    System.out.println("digite um numero:"); 
    numero = leia.nextInt();

        
    
    
 if ( numero % 2 == 0) {
	 System.out.println("Informe um numero:"   + Math.sqrt(numero)); 
}
 else {
	    System.out.println("numero é impar e o resultado da potencia  :" + Math.pow(numero, 2));

 }
 leia.close();
}
}
package generetion.exercicio.com;
import java.util.*;

public class Exercicio01 {
      
	public static void main(String[] args) {
         
	     Scanner leia  = new Scanner(System.in);
           
	     int n1 , n2 , n3;
	     int maior;
		  System.out.println("Digite um numero : ");
		  n1 =leia.nextInt();
	      n2 =leia.nextInt();
	      n3 =leia.nextInt();
	      
	  if(n1>=n2 && n1 >=n3) {
			  
			  System.out.println("O numero maior é :" + n1);

	  }
      
	  else if (n2>=n1 && n2 >=n3){
		  System.out.println("O numero maior é :" + n2);

	  }
	  else {
		  System.out.println("O numero maior é :" + n3);

	  }
	  leia.close();
	}
}
		 
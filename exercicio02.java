package generetion.exercicio.com;
import java.util.*;

public class exercicio02 {
  
	
	public static void main(String[] args) {
		

		 Scanner leia = new Scanner(System.in);
	        
		  int n1,  n2  , n3;
		    
		  System.out.println("Digite 3 numeros : ");
	       n1 =leia.nextInt();
	       n2 =leia.nextInt();
	       n3 =leia.nextInt();

		  if(n1<=n2 && n2 <=n3) {
			  
			  System.out.println("A ordem crescente é:" + n1 + n2 + n3 );

			  
		  }
		  else if (n1 <= n3 && n3 <= n2) {
			  System.out.println("A ordem crescente é:" + n1 + n3 + n2 );

			  
		  }
		  else if (n2 <= n1 && n1 <= n3) {
			  System.out.println("A ordem crescente é:" + n2 + n1 + n3 );


		}
		  else if (n2 <= n3 && n3 <= n1) {
			  System.out.println("A ordem crescente é:" + n2 + n3 + n1 );
		  }
	}
}


	  




	

	
	

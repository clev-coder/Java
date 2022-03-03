package generetion.exercicio.com;
import java.util.*;

public class exercicio03 {
	
	public static void main(String[] args) {

		 Scanner leia = new Scanner(System.in);
                   
		  int idade;
		  
		  System.out.println("Digite sua idade ");
		  idade = leia.nextInt();
		  
		  if(idade >=10 && idade <14 ) {
		   System.out.println("Voce esta na caterogia infantil");
		  }
		   else if( idade >14 && idade <=17 ) {
			    System.out.println("Voce esta na caterogia juvenil");

		    }
			    else if( idade >17 && idade <=25 ) {
				    System.out.println("Voce esta na caterogia Adulto");

			    }

			    else {
				    System.out.println("Voce digitou a idade incorreta ");

			    }
		  leia.close();
		    }

 

     
     
}

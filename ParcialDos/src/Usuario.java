import java.util.Scanner;

public class Usuario {
public static void main(String[] args) {
	
        
         Scanner scanner = new Scanner(System.in);
         System.out.print("digite una frase : ");
         String frase = scanner.nextLine();
         char[] caracteristicas = frase.toCharArray();
         System.out.print("Los caracteres de la frase son: ");
         for (char cart : caracteristicas) {
           System.out.print(cart + " ");
           
   
         }
       }
     

     
}


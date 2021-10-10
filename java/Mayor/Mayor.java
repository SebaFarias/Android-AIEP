package Mayor;
import java.util.Scanner;

public class Mayor {

  public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int aux, n, max= Integer.MIN_VALUE;

    System.out.println("Indique la cantidad de números que desea ingresar");
    n = leer.nextInt();
    for(int i=0;i<n;i++){
      System.out.println("Ingrese el " + (i+1) +"° número:");
      aux = leer.nextInt();
      if(aux>max){
        max=aux;
      }
    }
    leer.close();
    System.out.println("De los " + n + " números ingresados, el mayor es " + max);
  }
  
}

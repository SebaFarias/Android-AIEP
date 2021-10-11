package Mayor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mayor {

  public static int getMaxValue(List<Integer> numeros){
    int max = Integer.MIN_VALUE;
    for (int valor : numeros ) { max = valor > max ? valor : max;}
    return max;
  }
  public static void main(String[] args){

    int n, i=0;
    List<Integer> valores = new ArrayList<Integer>();
    Scanner leer = new Scanner(System.in);

    System.out.println("Indique la cantidad de números que desea ingresar");
    n = leer.nextInt();
    do{
      System.out.println("Ingrese el " + (i+1) +"° número:");
      valores.add(leer.nextInt());
      i++;
    }while(i < n );
    System.out.println("De los " + n + " números ingresados, el mayor es " 
    + getMaxValue(valores));
    leer.close();
  }  
}

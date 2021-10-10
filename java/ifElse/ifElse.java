package ifElse;

import java.util.Scanner;

public class ifElse {
  public static void main(String[] args){
    int valor;
    boolean isPar, isPositive;
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Por favor ingrese un número");
    valor = leer.nextInt();
    leer.close();
  
    isPar = valor % 2 == 0;
    isPositive = valor >= 0;
    if(isPar){
      System.out.println("El número ingresado es par");
    }else{
      System.out.println("El número ingresado es impar");
    }
    if(isPositive){
      System.out.println("Además, el número ingresado es positivo.");
    }else{
      System.out.println("Además, el número ingresado es negativo.");
    }
  }
}

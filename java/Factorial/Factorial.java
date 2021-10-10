package Factorial;
import java.util.Scanner;

public class Factorial {
  public static long factorial(int num) {
    long acc = 1;
    for (int i = 1; i <= num; i++) {
        acc *= i;
    }
    return acc;
  }
  public static void main(String[] args){
    char operation;
    int n;
    boolean continuar = true;
    Scanner leer = new Scanner(System.in);
    do{
      System.out.println("|------------------------------------|");
      System.out.println("|                                    |");
      System.out.println("|     Calculador de Factoriales      |");
      System.out.println("|                                    |");
      System.out.println("|------------------------------------|");
      System.out.println("|                                    |");
      System.out.println("|   Ingrese un número para evaluar   |");
      System.out.println("|                                    |");
      System.out.println("|------------------------------------|");
      n = leer.nextInt();
      System.out.println("|------------------------------------|");
      System.out.println("|                                    |");
      System.out.println("|       " + n +"! = "+factorial(n));
      System.out.println("|------------------------------------|");
      System.out.println("|      Continuar? (S)i  / (N)o       |");
      operation = leer.next().charAt(0);
      if(operation == 'n' || operation == 'N'){
        leer.close();
        continuar = false;
        System.out.println("|             Saliendo...             |");
        System.out.println("|-------------------------------------|");
      }
    }while(continuar);
  }
}

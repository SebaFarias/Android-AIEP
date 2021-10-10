package FizzBuzz;
import java.util.Scanner;

public class FizzBuzz {
  public static String fizzBuzz(int number) {
      if (number % 3 == 0) {
        if(number % 5 == 0){
          return "FizzBuzz";
        }else{
          return "Fizz";
        }  
      }else if( number % 5 == 0){
        return "Buzz";
      }else{
          return "" + number;
      }
  } 
  public static void main(String[] args){
    char operation;
    int n;
    boolean continuar = true;
    Scanner leer = new Scanner(System.in);
    do{
      System.out.println("|------------------------------------|");
      System.out.println("|                                    |");
      System.out.println("|         FizzBuzz de Sebas          |");
      System.out.println("|                                    |");
      System.out.println("|------------------------------------|");
      System.out.println("|                                    |");
      System.out.println("|   Ingrese un número para evaluar   |");
      System.out.println("|                                    |");
      System.out.println("|------------------------------------|");
      n = leer.nextInt();
      System.out.println("|                                    |");
      System.out.println("|       El resultado es " + fizzBuzz(n) + "         |");
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


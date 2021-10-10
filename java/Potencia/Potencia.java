package Potencia;
import java.util.Scanner;

public class Potencia {
  public static long elevar(int base, int exponente) {
    if(exponente == 0){
      return 1;
    }
    long res = base;
    for( int i = 1; i<exponente;i++){
      res *= base;
    }
    return res;
  }
  public static void main(String[] args){
    char operation;
    int n, x;
    boolean continuar = true;
    Scanner leer = new Scanner(System.in);
    do{
      System.out.println("|------------------------------------|");
      System.out.println("|                                    |");
      System.out.println("|      Calculador de Potencias       |");
      System.out.println("|                                    |");
      System.out.println("|------------------------------------|");
      System.out.println("|                                    |");
      System.out.println("|    Ingrese un número para elevar   |");
      System.out.println("|                                    |");
      System.out.println("|------------------------------------|");
      n = leer.nextInt();
      System.out.println("|                                    |");
      System.out.println("|         Indique el exponente       |");
      System.out.println("|                                    |");
      System.out.println("|------------------------------------|");
      x = leer.nextInt();
      System.out.println("|------------------------------------|");
      System.out.println("|                                    |");
      System.out.println("|       " + n +" ^  "+ x + " = "+ elevar(n,x));
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


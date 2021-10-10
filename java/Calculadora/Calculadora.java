package Calculadora;
import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    boolean continuar = true;
    float op1, op2, res=0;
    char operation='+';
    do{
        System.out.println("|------------------------------------|");
        System.out.println("|                                    |");
        System.out.println("|       Calculadora de Sebas         |");
        System.out.println("|                                    |");
        System.out.println("|------------------------------------|");
        System.out.println("|  Ingrese primer operando           |");
        op1 = leer.nextFloat();
        System.out.println("|  Ingrese segundo operando          |");
        op2 = leer.nextFloat();
        System.out.println("|  Escoja una operación:             |");
        System.out.println("|       ( + ) Suma                   |" );
        System.out.println("|       ( - ) Resta                  |");
        System.out.println("|       ( * ) Multiplicación         |");
        System.out.println("|       ( / ) División               |");
        operation = leer.next().charAt(0);
        switch(operation){
            case '+': res = op1 + op2 ;
            break;
            case '-': res = op1 - op2 ;
            break;
            case '*': res = op1 * op2 ;
            break;
            case '/': res = op1 / op2 ;
            break;
        }
        System.out.println("|       El resultado es " + res + "         |");
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

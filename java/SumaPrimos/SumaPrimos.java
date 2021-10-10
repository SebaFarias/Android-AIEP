package SumaPrimos;
import java.util.Scanner;

public class SumaPrimos {
  public static boolean esPrimo(int numero){
    if(numero < 2){
      return false;
    }
    for(int i = 2;i<numero/2;i++){
      if(numero%i==0){
        return false;
      }
    }
    return true;
  } 
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int n, suma=0;
    
    System.out.println("Ingrese un número y calcularé la suma"+
    " de los primos menores que él");
    n = leer.nextInt();
    leer.close();

    for(int i = 2; i < n; i++ ){
      if(esPrimo(i)){
        suma += i;
      }
    }
    System.out.println("La suma de los números primos menores a "
    +n+" es : " + suma);
}
}

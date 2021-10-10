package intercambioValores;
import java.util.Scanner;

public class intercambioValores {
  public static void main(String[] args) {
    
    int valor1, valor2, aux;
    Scanner leer = new Scanner(System.in);   

    System.out.println("Bienvenido al intercambiador de valores");
    System.out.println("Para comenzar, ingrese un primer valor");
    valor1 = leer.nextInt();
    System.out.println("Ahora, ingrese un segundo valor");
    valor2 = leer.nextInt();
    leer.close();    
    System.out.println("Muy bien, entonces estos son los valores:");
    System.out.println("Valor 1: " + valor1);
    System.out.println("Valor 2: " + valor2);
    System.out.println("Abra Kadabra");
    aux = valor1;
    valor1 = valor2;
    valor2 = aux;
    System.out.println("Ahora, estos son los valores:");
    System.out.println("Valor 1: " + valor1);
    System.out.println("Valor 2: " + valor2);        
    System.out.println("Sí, el mago enmascarado lo hizo de nuevo");
  }  
}

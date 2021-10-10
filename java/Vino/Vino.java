package Vino;
import java.util.Scanner;

public class Vino {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    char tipo = ' ';
    int ajuste, kilos, precio, size= 0;
    System.out.println("Ingrese precio por kilo");
    precio = leer.nextInt();
    System.out.println("Ingrese kilos de uvas");
    kilos = leer.nextInt();
    while(tipo != 'A' && tipo != 'a' && tipo != 'B' && tipo != 'b'){
      System.out.println("Ingrese tipo (A o B)");
      tipo = leer.next().charAt(0);
    }
    while(size != 1 && size != 2){
      System.out.println("Ingrese tamaño (1 o 2)");
      size = leer.nextInt();
    }
    leer.close();
    if( tipo == 'a' || tipo == 'A'){
      if( size == 1){
        ajuste = 20;
      }else{
        ajuste = 30;
      }
  }else{
      if( size == 1){
        ajuste = -30;
      }else{
        ajuste = -50;
      }
    }
    System.out.println("El Precio por kilo se debe ajustar en $"+ajuste);
    System.out.println("Precio total por "+kilos+"Kg de uva: $"+kilos*(precio+ajuste));
  }    
}

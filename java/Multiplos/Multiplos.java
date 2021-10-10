package Multiplos;

import java.util.Scanner;

public class Multiplos {
  
  public static void main(String[] args) {
    int n, divisor, suma = 0;
    Scanner leer = new Scanner(System.in);

    System.out.println("Indique de qué número desea buscar múltiplos");
    divisor = leer.nextInt();
    System.out.println("Indique hasta qué número desea buscar");
    n = leer.nextInt();
    leer.close();
    
for(int i = 1; i<=n;i++){
  if(i%divisor == 0){
    suma += i;
  }
}
  System.out.println("La suma de los múltiplos de "+divisor+" menores a "
    +n+" es "+ suma);
  }    
}

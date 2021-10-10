package ParesImpares;
import java.util.Scanner;

public class ParesImpares {
  public static void main(String[] args){
    int pares=0, impares=0, i=0, n, numeroActual, sumaPares=0, sumaImpares=0;
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Indique cuántos números desea ingresar.");
    n = leer.nextInt();
    while(i<n){
      System.out.println("Ingrese el número n° " + (i+1));
      numeroActual = leer.nextInt();
      if(numeroActual%2 == 0){
        pares++;
        sumaPares += numeroActual;
      }else{
        impares++;
        sumaImpares += numeroActual;
      }
      i++;
    }
    leer.close();
    if(pares > impares){
      System.out.println("Ingresó más números pares que impares");
    }else{
      if(impares > pares){
        System.out.println("Ingresó más números impares que pares");
      }else{
        System.out.println("Ingresó tantos números pares como impares");
      }
    }
    System.out.println("La suma de los números pares es: "+ sumaPares);
    System.out.println("La suma de los números impares es: "+ sumaImpares);
  }
}

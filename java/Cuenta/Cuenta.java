package Cuenta;
import java.util.Scanner;

public class Cuenta {
  public static void main(String[] args){
    int n;
    Scanner leer = new Scanner(System.in);

    System.out.println("Bienvenido al contador, "
    +"ingrese el número hasta el que quiere contar:");
    n = leer.nextInt();
    leer.close();
    
    for(int i=0; i<n; i++){
      System.out.println(i+1);
    }
    if(n>10){
      System.out.println("Vaya, eso fue más largo de lo que pareció:");
    }else{
      System.out.println("Hey! ¿Por qué me haces trabajar a mí?, "+ 
      "cualquiera puede contar hasta " + n);
    }
  }  
}

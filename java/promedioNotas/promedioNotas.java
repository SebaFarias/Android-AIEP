package promedioNotas;
import java.util.Scanner;

public class promedioNotas {
  public static void main(String[] args) {
    
    int cantNotas;
    float nuevaNota;
    float sumaNotas = 0.0f;
    Scanner leer = new Scanner(System.in);   

    System.out.println("Bienvenido al calculador de promedios.¿Cuántas notas desea promediar?");
    cantNotas = leer.nextInt();
    
    for (int i = 0; i < cantNotas; i++) {
      System.out.println("Ingrese la " + (i+1) +"° nota.");
      nuevaNota = leer.nextFloat();      
      sumaNotas += nuevaNota ;
    }
    leer.close();    
    System.out.println("Promedio de "+ cantNotas +" notas: "+ sumaNotas/cantNotas);
  }  
}
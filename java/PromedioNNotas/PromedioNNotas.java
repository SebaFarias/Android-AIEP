package PromedioNNotas;
import java.util.Scanner;

public class PromedioNNotas {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    float nuevaNota, sumaNotas = 0.0f;
    int cantNotas, i=0;

    System.out.println("Bienvenido al calculador de promedios."+
    "¿Cuántas notas desea promediar?");
    cantNotas = Math.max(leer.nextInt(),1);

    do{
      System.out.println("Ingrese la "+(i+1)+"° nota");
      nuevaNota = leer.nextFloat();
      sumaNotas += nuevaNota ; 
      i++;
    }while(i < cantNotas);
    leer.close();
    System.out.println("Promedio de "+ cantNotas +" notas: "
    + sumaNotas/cantNotas);
}   
}

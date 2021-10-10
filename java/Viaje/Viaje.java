package Viaje;
import java.util.Scanner;

public class Viaje {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int cantidad, total=400000;
    System.out.println("Ingrese cantidad de asistentes");
    cantidad = leer.nextInt();
    leer.close();
    
    if( cantidad > 29){
      if(cantidad > 49){
        if(cantidad > 99){
            total = cantidad * 6500;
        }else{
            total = cantidad * 7000;
        }
      }else{
        total = cantidad * 9500;                    
      }
    }
    System.out.println("Pago a la compañìa: $"+total);
    System.out.println("Coste por alumno: $"+total/cantidad);
  }
}
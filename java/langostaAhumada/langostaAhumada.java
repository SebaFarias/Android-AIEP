package langostaAhumada;
import java.util.Scanner;
        
public class langostaAhumada {
  public static void main(String[] args) {        
    Scanner leer = new Scanner(System.in);
    int cantidad, platillo = 9500;
    
    System.out.println("Ingrese cantidad de asistentes");
    cantidad = leer.nextInt();
    leer.close();
    
    if( cantidad > 200){
      if(cantidad > 300){
        platillo = 7500;
      }else{
        platillo = 8500;
      }    
    }
    System.out.println("Precio por platillo: $" + platillo);
    System.out.println("Costo total: $" + cantidad * platillo);
  }    
}

package SumaArreglos;
import java.util.Scanner;


public class SumaArreglos {
  
  public static void main(String[] args){
    
    int[] arreglo1, arreglo2;
    int x, y;
    boolean continuar;
    Scanner leer;
    
    continuar = true;

    leer = new Scanner(System.in);
    
    do{
      System.out.println("Hoy sumaremos valores de 2 arreglos distintos");
      arreglo1 = llenarArreglo(leer);
      System.out.println("Vamos por el segundo...");
      arreglo2 = llenarArreglo(leer);
      x = pedirInt("Ahora, lo entretenido, escoja un elemento del primer arreglo...(indique posicion)", leer);
      y = pedirInt("indique la posicion del elemento del 2do conjunto que desea sumar",leer);
      mostrarResultado(arreglo1,arreglo2,x,y);
      preguntaContinuar(leer);
    }while(continuar);
    leer.close();
  }
    public static int[] llenarArreglo(Scanner leer){
      int tamaño = pedirInt("Ingrese el tamaño del siguiente arreglo:", leer);
      int[] arreglo = new int[tamaño];
      for( int i = 0; i < tamaño ; i++ ){
        arreglo[i]=pedirInt("Ingrese el valor del elemento n°"+(i+1)+":("+(tamaño-(i+1))+")restantes", leer);
      }
      return arreglo;
    }
    public static int pedirInt(String mensaje, Scanner leer){
      System.out.println(mensaje);
      return leer.nextInt();
    }
    public static boolean preguntaContinuar(Scanner leer){
      System.out.println("Continuar?     ---->      (S)i  / (N)o  ");
      char eleccion = leer.next().charAt(0);
      return(eleccion != 'n' || eleccion != 'N');
    }
    public static void mostrarResultado( int[] arr1, int[] arr2, int x, int y ){
      System.out.println(arr1[x]+" + "+arr2[y]+" = "+(arr1[x]+arr2[y]));
    }
}

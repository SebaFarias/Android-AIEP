package Arreglos;
import java.util.Scanner;

public class Arreglos {

  final static int ENTEROS = 1;
  final static int REALES = 2;
  final static int LETRAS = 3;
  final static int FRASES = 4;
  final static int SALIR = 5;
  
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    boolean continuar = true;
    int enteros[];
    double reales[];
    char letras[];
    String frases[];
    int seleccion, tamaño;

    do{
      seleccion = pedirTipo( leer );
      if(seleccion==SALIR){
        continuar = false;
      }
      if(continuar){
        tamaño = pedirTamaño( leer );
        switch( seleccion ){
          case ENTEROS: enteros = crearArrayInt( leer, tamaño );mostrarEnteros(enteros);break;
          case REALES: reales = crearArrayDouble(leer, tamaño);mostrarReales(reales);break;
          case LETRAS: letras = crearArrayChar(leer, tamaño);mostrarLetras(letras);break;
          case FRASES: frases = crearArrayString(leer, tamaño);mostrarFrases(frases);break;
        }
      }
    }while(continuar);
  }    
  public static int pedirTipo(Scanner leer){
      int seleccion;
      System.out.println("|-----------------------------------------|");
      System.out.println("|                                         |");
      System.out.println("|               Arreglines                |");
      System.out.println("|                                         |");
      System.out.println("|                                         |");
      System.out.println("|       Ok, juguemos con los arreglos     |");
      System.out.println("|                                         |");
      System.out.println("|-----------------------------------------|");
      System.out.println("|                                         |");
      System.out.println("|                  Crear                  |");
      System.out.println("|                                         |");
      System.out.println("|          ¿De qué tipo prefieres?        |");
      System.out.println("|                                         |");
      System.out.println("|(1)Números enteros      Números reales(2)|");
      System.out.println("|                                         |");
      System.out.println("|(3)Letras                       Frases(4)|");
      System.out.println("|                                         |");
      System.out.println("|(5)Salir                                 |");
      System.out.println("|                                         |");
      System.out.println("|                                         |");
      System.out.println("|-----------------------------------------|");
      System.out.println("|                                         |");
      do{
          System.out.println("|-------------Indique su opción-----------|");
              seleccion = leer.nextInt();
          }while( seleccion < 1 && seleccion > 5);
      return seleccion;
  }
  public static int pedirTamaño( Scanner leer ){
      int tamaño, seleccion;
      System.out.println("|-----------------------------------------|");
      System.out.println("|                                         |");
      System.out.println("|                 Tamaño                  |");
      System.out.println("|                                         |");
      System.out.println("|     ¿Cúantos datos quieres ingresar?    |");
      System.out.println("|                                         |");
      System.out.println("|(1)5                                10(2)|");
      System.out.println("|                                         |");
      System.out.println("|(3)15                               20(4)|");
      System.out.println("|                                         |");
      System.out.println("|(5)Otro                                  |");
      System.out.println("|                                         |");
      System.out.println("|                                         |");
      System.out.println("|-----------------------------------------|");
      System.out.println("|                                         |");
      do{
          System.out.println("|-------------Indique su opción-----------|");
          seleccion = leer.nextInt();
          switch(seleccion){
                  case 1: tamaño = 5;
                  break;
                  case 2: tamaño = 10;
                  break;
                  case 3: tamaño = 15;
                  break;
                  case 4: tamaño = 20;
                  break;
                  case 5: 
                  System.out.println("|              Indique valor              |");
                  tamaño = leer.nextInt();
                  break;
                  default: tamaño = 0;
                }
              }while( seleccion < 1 && seleccion > 5);
              return tamaño;
            }
  private static int[] crearArrayInt( Scanner leer, int tamaño ){
    int arreglo[] = new int[tamaño];
    for(int i = 0 ; i<tamaño ; i++){
      System.out.println("|-------------Agregar valor n°"+i+1+"-----------|");
      arreglo[i] = pedirInt(leer);
    }
    return arreglo;
  }
  private static double[] crearArrayDouble( Scanner leer, int tamaño ){
    double arreglo[] = new double[tamaño];
    for(int i = 0 ; i<tamaño ; i++){
      System.out.println("|-------------Agregar valor n°"+(i+1)+"-----------|");
      arreglo[i] = pedirDouble(leer);
    }
    return arreglo;
  }
  private static char[] crearArrayChar( Scanner leer, int tamaño ){
    char arreglo[] = new char[tamaño];
    for(int i = 0 ; i<tamaño ; i++){
      System.out.println("|-------------Agregar valor n°"+(i+1)+"-----------|");
      arreglo[i] = pedirChar(leer);
    }
    return arreglo;
  }
  private static String[] crearArrayString( Scanner leer, int tamaño ){
    String arreglo[] = new String[tamaño];
    for(int i = 0 ; i<tamaño ; i++){
      System.out.println("|-------------Agregar valor n°"+(i+1)+"-----------|");
      arreglo[i] = pedirString(leer);
    }
    return arreglo;
  }
  public static int pedirInt( Scanner leer){
      System.out.println("|         Ingrese un valor entero         |");
      return leer.nextInt();
  }
  public static double pedirDouble( Scanner leer){
    System.out.println("|         Ingrese un valor Real         |");
    return leer.nextDouble();
  }
  public static char pedirChar( Scanner leer){
      System.out.println("|           Ingrese una letra           |");
      return leer.next().charAt(0);
  }
  public static String pedirString( Scanner leer){
    System.out.println("|          Ingrese una palabra          |");
    return leer.next();
  }
  public static void mostrarEnteros (int[] enteros){
    for(int i = 0; i< enteros.length;i++){
      System.out.println("| "+(i+1)+"-> " + enteros[i]);
    }
  }
  public static void mostrarReales (double[] reales){
    for(int i = 0; i< reales.length;i++){
      System.out.println("| "+(i+1)+"-> " + reales[i]);
    }
  }
  public static void mostrarLetras (char[] letras){
    for(int i = 0; i< letras.length;i++){
      System.out.println("| "+(i+1)+"-> " + letras[i]);
    }
  }
  public static void mostrarFrases (String[] frases){
    for(int i = 0; i< frases.length;i++){
      System.out.println("| "+(i+1)+"-> " + frases[i]);
    }
  }
}

package contador;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Contador cont1 = new Contador();
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int seleccion; 
        
        do{
            seleccion = menuPrincipal( leer );
            switch( seleccion ){
                case 1: mostrarContador( cont1 );
                break;
                case 2: incrementarContador(cont1); 
                break;
                case 3: decrementarContador(cont1);
                break;
                case 4: salir();
                continuar = false;
                break;
            }
        }while(continuar);
    }
    public static int menuPrincipal( Scanner leer ){
        int seleccion;
        System.out.println("|---------------------------------------------|");
        System.out.println("|                                             |");
        System.out.println("|                   Contador                  |");
        System.out.println("|                                             |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|               ¿Qué desea Hacer?             |");
        System.out.println("|                                             |");
        System.out.println("|(1)Consultar Contador    Aumentar Contador(2)|");
        System.out.println("|                                             |");
        System.out.println("|(3)Reducir Contador                  Salir(4)|");
        System.out.println("|                                             |");
        do{
            System.out.println("|----------------Indique su opción------------|");
            seleccion = leer.nextInt();
        }while( seleccion < 1 || seleccion > 4);
        return seleccion;
    }
    static void mostrarContador( Contador cont ){
        System.out.println("|---------------------------------------------|");
        System.out.println("|             Consulta de Contador            |");
        System.out.println("|                                             |");
        System.out.println("|Cuenta actual: "+cont.getCont());
        System.out.println("|                                             |");
        System.out.println("|---------------------------------------------|");
    }
    static void incrementarContador( Contador cont ){
        cont.incrementar();
        mostrarContador( cont);
    }
    static void decrementarContador( Contador cont ){
        cont.decrementar();
        mostrarContador(cont);
    }
    static void salir(){
        System.out.println("|---------------------------------------------|");
        System.out.println("|                                             |");
        System.out.println("|      Adios, gracias por preferirnos         |");
        System.out.println("|                                             |");
        System.out.println("|---------------------------------------------|");
    }
}

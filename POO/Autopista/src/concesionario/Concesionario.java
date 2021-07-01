package concesionario;
import java.util.Scanner;

public class Concesionario {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int seleccion;
        Vehiculo premio = new Vehiculo();
        
        seleccion = menuInicial(leer);
        if(seleccion == 2 ){
            continuar = salir();
        }
        while(continuar){
            mostrar(premio);
            seleccion = menuPrincipal(leer);
            switch(seleccion){
                case 1: 
                    conservarAuto(premio);
                    break;
                case 2: 
                    premio = nuevaTirada(premio);
                    break;
                case 3:
                    alAgua(premio);
                    break;
                case 4:
                    continuar = salir();
                    break;
                default:
                    seleccionInvalida();
            }
        }
    }
    public static int menuInicial( Scanner leer){
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|         Concesionario Principal         |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|            ¿Qué desea Hacer?            |");
        System.out.println("|                                         |");
        System.out.println("|(1)Participar                    Salir(2)|");
        System.out.println("|                                         |");
        System.out.println("|            Escoja una opción            |");
        return leer.nextInt();
    }
    public static int menuPrincipal( Scanner leer ){
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|             Ruleta Ganadora             |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|            ¿Qué desea Hacer?            |");
        System.out.println("|                                         |");
        System.out.println("|(1)Conservar              Nueva tirada(2)|");
        System.out.println("|                                         |");
        System.out.println("|(3)Auto al agua                  Salir(4)|");
        System.out.println("|                                         |");
        System.out.println("|            Escoja una opción            |");
        return leer.nextInt();
    }
    public static void conservarAuto(Vehiculo premio){
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|             Felicitaciones!             |");
        System.out.println("|                                         |");
        System.out.println("|   Ud. es el flamante dueño de un:       |");
        System.out.println("|                                         |");
        System.out.println(premio.getDatos());
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
    }
    public static Vehiculo nuevaTirada(Vehiculo premio){
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|              Nueva Tirada               |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|            Nos olvidamos de:            |");
        System.out.println("|                                         |");
        System.out.println(premio.getDatos());
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        return new Vehiculo();        
    }
    public static void mostrar(Vehiculo premio){
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|            Resultado Ruleta             |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|             Ha caído en un:             |");
        System.out.println("|                                         |");
        System.out.println(premio.getDatos());
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
    }
    public static void alAgua(Vehiculo premio){
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|                Al Agua                  |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|             Guardamos el:               |");
        System.out.println("|                                         |");
        System.out.println(premio.getDatos());
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|          Y al augua se va el:           |");
        System.out.println("|                                         |");
        System.out.println("|                                         |");
        System.out.println("|                                         |");
        System.out.println(new Vehiculo().getDatos());
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        
    }
    public static boolean salir(){
        System.out.println("|          Adiós, vuelva pronto!          |");
        return false;
    } 
    public static void seleccionInvalida(){
        System.out.println("|        Ingrese una opción Válida        |");        
    }
}

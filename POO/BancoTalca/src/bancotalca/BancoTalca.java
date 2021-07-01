package bancotalca;
import java.util.Scanner;
import java.util.ArrayList;

public class BancoTalca {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Cuenta> cuentas = new ArrayList();
        int seleccion, cuentaSeleccionada, origen, destino;
        boolean continuar = true;
        do{
            seleccion = menuPrincipal( leer );
            switch( seleccion ){
                case 1: mostrarCuentas(cuentas);
                break;
                case 2: crearCuenta(cuentas, leer); 
                break;
                case 3: cuentaSeleccionada = seleccionarCuenta();
                break;
                case 4: eliminarCuenta();
                break;
                case 5: salir();
                continuar = false;
            }
        }while(continuar);
        
    }
    static void mostrarCuentas(ArrayList<Cuenta> cuentas){
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|             Banco de Talca              |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|                 Cuentas ("+cuentas.size()+")                |");
        System.out.println("|                                         |");
        
        cuentas.forEach( cuenta -> {
        System.out.println("|                                         |");
            System.out.println("| "+cuenta.getNumeroCuenta()+
                    "   "+cuenta.getNombre()+"   $"+cuenta.getSaldo());
        System.out.println("|                                         |");
        });
    }
    static void crearCuenta(ArrayList<Cuenta> cuenta, Scanner leer){
        Cuenta newCuenta;
        String newNombre, newNumeroCuenta;
        double newSaldo;
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|             Banco de Talca              |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|               Crear Cuenta              |");   
        System.out.println("|                                         |");
        System.out.println("|--------------Indique nombre-------------|");
        newNombre = leer.nextLine();
        System.out.println("|                                         |");
        System.out.println("|---------Indique número de Cuenta--------|");
        newNumeroCuenta = leer.nextLine();
        System.out.println("|                                         |");
        System.out.println("|--------------Indique saldo--------------|");
        newSaldo = leer.nextDouble();
        newCuenta = new Cuenta( newNombre , newNumeroCuenta , newSaldo );
    }
    static int menuPrincipal(Scanner leer){
        int seleccion;
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|             Banco de Talca              |");
        System.out.println("|                                         |");
        System.out.println("|               User: Tatan               |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|            ¿Qué desea Hacer?            |");
        System.out.println("|                                         |");
        System.out.println("|(1)Ver cuentas            Crear Cuenta(2)|");
        System.out.println("|                                         |");
        System.out.println("|(3)Seleccionar Cuenta  Eliminar Cuenta(4)|");
        System.out.println("|                                         |");
        System.out.println("|(5)Salir                                 |");
        System.out.println("|                                         |");
        do{
        System.out.println("|-------------Indique su opción-----------|");
            seleccion = leer.nextInt();
        }while( seleccion < 1 && seleccion > 4);
        return seleccion;
    }
    static int menuCuenta( Scanner leer ){
        int seleccion;
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|             Banco de Talca              |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|            ¿Qué desea Hacer?            |");
        System.out.println("|                                         |");
        System.out.println("|(1)Consulta de Saldo    Realizar Abono(2)|");
        System.out.println("|                                         |");
        System.out.println("|(3)Realizar Giro            Transferir(4)|");
        System.out.println("|                                         |");
        System.out.println("|(5)Salir                                 |");
        System.out.println("|                                         |");
        do{
        System.out.println("|-------------Indique su opción-----------|");
            seleccion = leer.nextInt();
        }while( seleccion < 1 && seleccion > 4);
        return seleccion;
    }
    
}

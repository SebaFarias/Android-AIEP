package Banco;
import java.util.Scanner;
//19-05-2021
public class Banco {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int seleccion; 
        float saldo = 0F;
        
        do{
            seleccion = menuPrincipal( leer );
            switch( seleccion ){
                case 1: mostrarSaldo( saldo );
                break;
                case 2: saldo = depositar( leer, saldo ); 
                break;
                case 3: saldo = girar( leer, saldo );
                break;
                case 4: salir();
                continuar = false;
                break;
            }
        }while(continuar);
    }    
    static int menuPrincipal( Scanner leer ){
        int seleccion;
            //imprimirEspacio();
            System.out.println("|-----------------------------------------|");
            System.out.println("|                                         |");
            System.out.println("|             Banco de Talca              |");
            System.out.println("|                                         |");
            System.out.println("|-----------------------------------------|");
            System.out.println("|            ¿Qué desea Hacer?            |");
            System.out.println("|                                         |");
            System.out.println("|(1)Consulta de Saldo    Realizar Abono(2)|");
            System.out.println("|                                         |");
            System.out.println("|(3)Realizar Giro                 Salir(4)|");
            System.out.println("|                                         |");
            do{
            System.out.println("|-------------Indique su opción-----------|");
                seleccion = leer.nextInt();
            }while( seleccion < 1 && seleccion > 4);
        return seleccion;
    }
    static void mostrarSaldo( float saldo ){
        //imprimirEspacio();
        System.out.println("|-----------------------------------------|");
        System.out.println("|            Consulta de Saldo            |");
        System.out.println("|Saldo actual: $"+saldo);
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
    }
    static float depositar( Scanner leer, float saldo){
        boolean valido = false;
        float nuevoSaldo, deposito = 0F;
        do{
          //imprimirEspacio();
            System.out.println("|-----------------------------------------|");
            System.out.println("|                                         |");
            System.out.println("|            Realizar Depósito            |");
            System.out.println("|                                         |");
            System.out.println("| Indique monto a depositar:              |");
            deposito = leer.nextFloat();
            if(deposito > 0){
                valido = true;
            }else{
              //imprimirEspacio();
                System.out.println("|-----------------------------------------|");
                System.out.println("|                                         |");
                System.out.println("|            Realizar Depósito            |");
                System.out.println("|                                         |");
                System.out.println("|              Valor Inválido             |");
                System.out.println("|                                         |");
                System.out.println("|-----------------------------------------|");  
            }        
        }while(!valido);
        nuevoSaldo = saldo + deposito;
        //imprimirEspacio();
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|      Depósito Realizado con éxito       |");
        System.out.println("|                                         |");
        System.out.println("|Saldo actual: $"+nuevoSaldo);
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        return nuevoSaldo;        
    }
    static float girar( Scanner leer, float saldo){
        if(saldo <=0){
            System.out.println("|-----------------------------------------|");
            System.out.println("|                                         |");
            System.out.println("|              Realizar Giro              |");
            System.out.println("|                                         |");
            System.out.println("|            Saldo insuficiente           |");
            System.out.println("|                                         |");
            System.out.println("|-----------------------------------------|");
            return saldo;
        }
        boolean valido = false;
        float nuevoSaldo, giro = 0F;
        do{
          //imprimirEspacio();
          System.out.println("|-----------------------------------------|");
            System.out.println("|                                         |");
            System.out.println("|              Realizar Giro              |");
            System.out.println("|                                         |");
            System.out.println("| Indique monto a girar:                  |");
            giro = leer.nextFloat();
            if(giro > 0 && giro <= saldo){
                valido = true;
            }else{
              if(giro > saldo){
                System.out.println("|-----------------------------------------|");
                System.out.println("|                                         |");
                System.out.println("|              Realizar Giro              |");
                System.out.println("|                                         |");
                System.out.println("|            Saldo insuficiente           |");
                System.out.println("|                                         |");
                System.out.println("|-----------------------------------------|");
                }else{
                System.out.println("|-----------------------------------------|");
                System.out.println("|                                         |");
                System.out.println("|              Realizar Giro              |");
                System.out.println("|                                         |");
                System.out.println("|              Valor Inválido             |");
                System.out.println("|                                         |");
                System.out.println("|-----------------------------------------|");   
                }
            }        
        }while(!valido);
        nuevoSaldo = saldo - giro;
        //imprimirEspacio();
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|        Giro Realizado con éxito         |");
        System.out.println("|                                         |");
        System.out.println("|Saldo actual: $"+nuevoSaldo);
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        return nuevoSaldo;  
    }
    static void salir(){
        //imprimirEspacio();
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|        Gracias por preferir el          |");
        System.out.println("|             Banco de Talca              |");
        System.out.println("|                  Adios!                 |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
    }
    public static void imprimirEspacio(){
      for( int i = 0; i< 10; i++){
        System.out.println("");
      }
    }
}
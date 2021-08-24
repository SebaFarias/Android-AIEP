import java.util.Scanner;

public class NumerosPerfectos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        char seleccion;
        long numero, suma;
        
        System.out.println("Hoy calcularemos si un número es perfecto o no");
        do{
            //Pedir número
            System.out.println("Por favor, ingrese un número positivo");
            numero = leer.nextLong();
            suma = 0;
            
            //Operar número
            for( long i = 1 ; i <= numero/2 ; i++ ){
                if(numero % i == 0){
                    suma += i;
                }
            }
            //Mostrar resultado
            if(suma == numero){
                System.out.println("El número "+numero+" es perfecto!");
            }else{
                System.out.println("El número "+numero+" no es perfecto");
            }
            
            //Preguntar si se vuelve a ejecutar
            System.out.println("Quiere evaluar otro número? (S)í / (N)o");
            seleccion = leer.next().charAt(0);
            if(seleccion == 's' || seleccion =='S'){
                System.out.println("Ok, aquí vamos de nuevo");
            }else{
                System.out.println("Esta bien, hasta pronto!");
                continuar = false;
                leer.close();
            }
        }while(continuar);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracontinua;
import java.util.Scanner;

/**
 *
 * @author SebaFarias
 */
public class CalculadoraContinua {
    
     public static void main(String[] args) {
        double op1 = 0, op2 = 0, res = 0;
        double[] valores;
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        char operation='+';

        do{
            mostrarTitulo();
            valores = pedir2valores(leer);
            op1= valores[0];
            op2= valores[1];
            operation = pedirOperacion(leer);
            res = getResult(operation,op1,op2);
            mostrarResultado(res);
            continuar = pedirContinuar(leer);
        }while(continuar);
        salir(leer);
    } 
    public static double getResult(char operation, double num1, double num2){
        switch(operation){
            case '+': return num1 + num2 ;
            case '-': return num1 - num2 ;
            case '*': return num1 * num2 ;
            case '/': return num1 / num2 ;
            default: return 0;
        }
    }
     public static void mostrarTitulo(){
        System.out.println("|------------------------------------|");
        System.out.println("|                                    |");
        System.out.println("|       Calculadora de Sebas         |");
        System.out.println("|                                    |");
        System.out.println("|------------------------------------|");
     }
     public static double[] pedir2valores(Scanner leer){
        double[] operandos = new double[2]; 
        System.out.println("|  Ingrese primer operando           |");
        operandos[0] = leer.nextFloat();
        System.out.println("|  Ingrese segundo operando          |");
        operandos[1] = leer.nextFloat();
        return operandos;
     }
     public static char pedirOperacion(Scanner leer){
         char op=' ';
         do{
              System.out.println("|  Escoja una operación:             |");
        System.out.println("|       ( + ) Suma                   |" );
        System.out.println("|       ( - ) Resta                  |");
        System.out.println("|       ( * ) Multiplicación         |");
        System.out.println("|       ( / ) División               |");
        op = leer.next().charAt(0);
         }while('+' != op && '-' != op && '*' != op && '/' != op);
         return op;
     }
     public static void mostrarResultado(double res){
        System.out.println("|       El resultado es " + res + "         |");
     }
    
     public static boolean pedirContinuar(Scanner leer){
         char respuesta;
        System.out.println("|------------------------------------|");
        System.out.println("|      Continuar? (S)i  / (N)o       |");
        respuesta = leer.next().toUpperCase().charAt(0);
        if(respuesta == 'S' || respuesta == 'N'){
            return respuesta == 'S';
        }        
        System.out.println("|           Responda S o N           |");
        return pedirContinuar(leer);
     }
     public static void salir(Scanner leer){
        leer.close();
        System.out.println("|             Saliendo...             |");
        System.out.println("|-------------------------------------|"); 
     }     
}
package Hora;
import java.util.Scanner;

public class Hora {
  static boolean pedirHora( Scanner in , String pregunta){
    System.out.println(pregunta);
    int hora = in.nextInt();
    boolean valida = hora < 25 && hora >= 0;
    System.out.println("Claro, son las "+hora+" horas.");
    return valida;
  }
  static boolean pedirMinutos( Scanner in , String pregunta){
    System.out.println(pregunta);
    int minutos = in.nextInt();
    boolean valida = minutos < 60 && minutos >= 0;
    System.out.println("Con "+minutos+" minutos.");
    return valida;
  }
  static boolean pedirSegundos( Scanner in , String pregunta){
    System.out.println(pregunta);
    int segundos = in.nextInt();
    boolean valida = segundos < 60 && segundos >= 0;
    System.out.println("Y "+segundos+" segundos.");
    return valida;
  }
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    boolean horaValida, minutoValido, segundoValido;
    
    horaValida = pedirHora(leer,"Oiga, me da la hora?");
    if(horaValida){
      minutoValido = pedirMinutos(leer,"Ah, y con cuántos minutos?");                
    }else{
      minutoValido = pedirMinutos(leer,"Seguro, qué locura! y con cuántos minutos dices?");                
    }
    if(horaValida && minutoValido){
      segundoValido = pedirSegundos( leer, "Maravilloso, y con cuántos segundos, si no es mucha la molestia?");
    }else{
      segundoValido = pedirSegundos( leer, "jaja, que disparate! y con cuántos segundos?");
    }
    if(horaValida && minutoValido && segundoValido){
      System.out.println("Pues eso suena bastante real, gracias");
    }else{
      System.out.println("Vaya, alguien se tragó un payaso.");
    }
  }  
}

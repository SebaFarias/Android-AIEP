package Chismefon;
import java.util.Scanner;

public class Chismefon {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    double minutos, minTramo1,minTramo2, minTramo3, minTramo4, precio;
    char tipoDia, horario;
    minTramo1 = 0;
    minTramo2 = 0;
    minTramo3 = 0;
    minTramo4 = 0;
    do{
      System.out.println("¿Ingrese el día de la llamada => (día (h)ábil / (d)omingo / (o)tro): ");
      tipoDia = leer.next().charAt(0);
    }while(tipoDia != 'H' && tipoDia != 'h' && tipoDia != 'D' && tipoDia != 'd' 
      && tipoDia != 'O' && tipoDia != 'o');
    do{
      System.out.println("¿El horario es diurno o vespertino? (D/V)");
      horario = leer.next().charAt(0);
    }while(horario != 'D' && horario != 'd' && horario != 'v' && horario != 'v');        
    System.out.println("Indique la duración de la lamada (en minutos):");
    minutos = leer.nextFloat();
    leer.close();
    //Minutos x tramo
    if(minutos > 5){
      minTramo1 = 5;
      if(minutos > 8){
        minTramo2 = 3;
        if(minutos > 10){
          minTramo3 = 2;
          minTramo4 = minutos - 10;
        }else{
          minTramo3 = minutos - 8;
        }
      }else{
        minTramo2 = minutos - 5;
      }
    }else{
      minTramo1 = minutos;
    }

    precio = (minTramo1 * 100) + (minTramo2 * 80) + (minTramo3 * 70) + (minTramo4 * 50);

    //Impuestos
    if(tipoDia == 'H' || tipoDia == 'h'){
      if(horario == 'd' || horario == 'D'){
        precio = precio * 1.15;
      }else{
        precio = precio * 1.10;
      }
    }else{
      if(tipoDia == 'D' || tipoDia == 'd'){
        precio = precio * 1.03;
      }
    }
    
    System.out.println("Costo de la llamada: $" + precio);

  }
}
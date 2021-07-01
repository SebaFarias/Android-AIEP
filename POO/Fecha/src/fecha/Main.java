package fecha;

public class Main {
  public static void main( String[] args){
    Fecha fecha1 = new Fecha(22,1,2000);
    for(int i = 0; i < 500 ; i++){
      System.out.println("Fecha: "+fecha1.getDia()+"/"+fecha1.getMes()+"/"+fecha1.getAño());
      fecha1.diaSiguiente();
    }
  }
}

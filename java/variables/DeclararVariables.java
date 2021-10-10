package variables;
public class DeclararVariables {
  public static void main(String[] args){
    String palabra;
    int num1, num2;
    char letra1 , letra2;
    
    num1 = (int) Math.round(Math.random()*1000);
    num2 = (int) Math.round(Math.random()*1000);

    System.out.println("Valores generados al azar");
    System.out.println("Numero 1: " + num1);
    System.out.println("Numero 2: " + num2);
    System.out.println("El mayor de ellos es " + Math.max(num1,num2));
    palabra = "Murcielago";
    System.out.println("Ahora, escogeremos 2 letras al azar de la palabra \"" + palabra + "\"." );
    letra1 = palabra.toUpperCase().charAt( (int) Math.floor(Math.random()*palabra.length())); 
    letra2 = palabra.toUpperCase().charAt( (int) Math.floor(Math.random()*palabra.length())); 
    System.out.println("Y las letras escogidas son " + letra1 + ('i' == letra2 ? " e ": " y " )+ letra2 );
  }
}

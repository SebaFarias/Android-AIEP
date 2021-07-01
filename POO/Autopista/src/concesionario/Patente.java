package concesionario;

public class Patente{
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public String patente;
    public Patente(){
        this.patente = nuevaPatente();
    }
    public Patente(String patente){
        this.patente = patente;
    }
    private static String nuevaPatente(){
        return ""+getLetter()+getLetter()+"-"+getLetter()+getLetter()+"-"+getNumber()+getNumber();
    }
    private static char getNumber(){
        int index = 26 + (int)(Math.random()*9);
        return CHARS.charAt(index);
    }
    private static char getLetter(){
        int index = (int)(Math.random()*25);
        return CHARS.charAt(index);
    }
}

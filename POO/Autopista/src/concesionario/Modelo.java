package concesionario;

public class Modelo {
    private static final String[] TIPOS = {"Sedán", "Hatchback", "Coupé", "SUV", "Todoterreno", "Descapotable", "Furgón"};
    private static final String[] MARCAS = {"Audi","BMW","Chevrolet","Citroen","Fiat","Ford"};
    public String tipo, marca;
    public Modelo(){
        this.tipo = getTipo();
        this.marca = getMarca();
    }
    public Modelo( String tipo, String marca){
        this.tipo = tipo;
        this.marca = marca;
    }
    
    private static String getTipo(){
        int index = (int) (Math.random()*7);
        return TIPOS[index];
    }
    private static String getMarca(){
        int index = (int) (Math.random()*6);
        return MARCAS[index];
    }
}

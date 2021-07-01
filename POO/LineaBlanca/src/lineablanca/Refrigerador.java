package lineablanca;

public class Refrigerador extends Electrodomestico{
    
    private double tempFreezer, tempMain;
    
    public Refrigerador(){
        super();
        this.tempFreezer = 21.0;
        this.tempMain = 21.0;
    }
    public Refrigerador(
        double peso,
        double precio,
        int voltage,
        boolean enchufado,
        double tempFreezer,
        double tempMain
    ){
        
    }
    
}

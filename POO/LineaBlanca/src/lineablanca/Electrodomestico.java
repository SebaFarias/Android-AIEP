package lineablanca;

public class Electrodomestico {
    
    private double peso, precio;
    private int voltage;
    boolean enchufado;
    String marca;
    
    public Electrodomestico(){
        this.voltage = 220; 
        this.precio = 0.0;
        this.peso = 0;
        this.enchufado = false;
        this.marca = "";
    }
    public Electrodomestico(double peso, double precio, int voltage, boolean enchufado, String marca){
        this.peso = peso;
        this.precio = precio;        
        this.voltage = voltage;
        this.enchufado = enchufado;
        this.marca = marca;
    }
    public double getPeso(){
        return this.peso;
    } 
    public double getPrecio(){
        return this.precio;
    }
    public int getVoltage(){
        return this.voltage;
    }
    public boolean getEnchufado(){
        return this.enchufado;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setPeso( double newPeso ){
        this.peso = newPeso;
    }
    public void setPrecio( double newPrecio ){
        this.precio = newPrecio;
    }
    public void setVoltage( int newVoltage ){
        this.voltage = newVoltage;
    }
    public void setEnchufado( boolean newEnchufado ){
        this.enchufado = newEnchufado;
    }
    public void setMarca( String newMarca ){
        this.marca = newMarca;
    }
    public String enchufar(){
        if(this.enchufado){
            return "Ya estaba recibiendo "+voltage+"V";
        }else{
            this.enchufado = true;
            return "Enchufando a la red de "+voltage+"V";
        }
    }    
    public String desenchufar(){
        if(this.enchufado){
            this.enchufado = false;
            return "Desenchufando, adios";
        }else{
            return "Ya estaba desenchufado";
        }
    }
}

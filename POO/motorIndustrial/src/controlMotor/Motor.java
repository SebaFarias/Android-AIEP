package controlMotor;

public class Motor {
    
    private int rpm, targetRpm;
    private boolean encendido;
    private double temp, voltage, combustible, aceite;
    
    public Motor(){
        this.rpm = 0;
        this.encendido = false;
        this.temp = 15 + Math.random()* 10;
        this.voltage = 9 + Math.random() * 4;
        this.combustible = Math.random() * 100;
        this.aceite = Math.random() * 100;
    }    
    
    public int getRpm(){
        return this.rpm;
    }
    public boolean getEncendido(){
        return this.encendido;
    }
    public double getTemp(){
        return this.temp;
    }
    public double getVoltage(){
        return this.voltage;
    }
    public double getCombustible(){
        return this.combustible;
    }
    public double getAceite(){
        return this.aceite;
    }
    public boolean encender(){
        if(this.encendido){
            return true;
        }
        System.out.println("PRUM!!! PRUM!!! PRUM!!!");
        if(Math.random() * this.combustible > 5){
            this.encendido = true;
        }
        return this.encendido;
    }
    public void apagar(){
        if(this.encendido){
            System.out.println("");
            this.encendido = false;
        }
    }
    public void acelerar( int rpm){
        this. targetRpm = rpm ;        
    }
    public void aceitar (double newLevel){
        if(newLevel <= 100 && newLevel > this.aceite){
            System.out.println("Glup! Glup! Glup!");
            this.aceite = newLevel;
        }else{
            System.out.println("No se puede hacer eso! No seas Animal!!!");
        }
    }
    public void repostar (double newLevel){
        if(newLevel <= 100 && newLevel > this.combustible){
            System.out.println("Glup! Glup! Glup!");
            this.combustible = newLevel;
        }else{
            System.out.println("No se puede hacer eso! No seas Animal!!!");
        }
    }    
}

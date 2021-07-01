package concesionario;

public class Vehiculo {
    Patente patente;
    Modelo modelo;
    public Vehiculo(){
        this.patente = new Patente();
        this.modelo = new Modelo();
    } 
    public Vehiculo( Modelo modelo ){
        this.patente = new Patente();
        this.modelo = modelo;
        
    }
    public Vehiculo( Patente patente ){
        this.patente = patente;
        this.modelo = new Modelo();
        
    }
    public Vehiculo( Patente patente, Modelo modelo ){
        this.patente = patente;
        this.modelo = modelo;
        
    }
    
    public String getDatos(){
        return "vehículo de tipo "+ modelo.tipo +", marca "+ modelo.marca+" y patente "+patente.patente;
    }
}

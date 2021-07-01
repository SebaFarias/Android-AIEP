package pagosoficina;

public class Persona {
    String nombre, rut;
    
    public Persona(){
        this.nombre = "";
        this.rut = "";
    } 
    public void setNombre( String newNombre ){
        this.nombre = newNombre;
    } 
    public void setRut( String newRut ){
        this.nombre = newRut;
    } 
    public String getNombre(){
        return this.nombre;
    }
    public String getRut(){
        return this.rut;
    }
    
}

package bancotalca;

public class Cuenta {
    String nombre, numeroCuenta;
    double saldo;
    
    public Cuenta(){
        
    }
    public Cuenta(String nombre, String numeroCuenta, double saldo){
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public double getSaldo(){
        return this.getSaldo();
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public boolean deposito(double monto){
        if(monto < 0){
            return false;
        }else{
            this.saldo += monto;
            return true;
        }
    }
    public boolean giro(double monto){
        if(monto < 0 || monto > this.saldo){
            return false;
        }else{
            this.saldo -= monto; 
            return true;
        }
    }
    public boolean transferencia(Cuenta origen, Cuenta destino, double monto){
        if(monto < 0 || monto > origen.saldo){
            return false;
        }else{
            origen.giro(monto);
            destino.deposito(monto);
            return true;
        }
    }
}

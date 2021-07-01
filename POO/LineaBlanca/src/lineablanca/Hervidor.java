package lineablanca;

public class Hervidor extends Electrodomestico{
    
    final static double UNA_TAZA = 0.25;
    final private double capacidad;
    private double contenido, temperatura;
    
    public Hervidor(){
        super();
        this.capacidad = 1.7;
        this.contenido = 0.0;
        this.temperatura = 21.0;
    }
    public Hervidor(
        double peso,
        double precio,
        int voltage,
        boolean enchufado,
        String marca,
        double capacidad
    ){
        super( peso, precio, voltage, enchufado, marca);
        this.capacidad = capacidad;
    }
    public Hervidor( 
        double peso,
        double precio,
        int voltage,
        boolean enchufado,
        String marca,
        double capacidad,
        double contenido,
        double temperatura
    ){
        super( peso, precio, voltage, enchufado, marca);
        this.capacidad = capacidad;
        this.contenido = contenido;
        this.temperatura = temperatura;
    }
    public double getCapacidad(){
        return this.capacidad;
    }
    public double getContenido(){
        return this.contenido;
    }
    public double getTemperatura(){
        return this.temperatura;
    }
    public void setContenido( double newContenido){
        this.contenido = newContenido;
    }
    public void setTemperatura( double newTemperatura ){
       this.temperatura = newTemperatura;
   } 
   public String servirUnaTaza(){
       if( this.contenido < UNA_TAZA ){
           double fraccion = 100*this.contenido/UNA_TAZA;
           this.contenido = 0.0;
           return "Solo serviste "+fraccion+"% de una taza a "+this.temperatura+"°celsius";
       }else{
           this.contenido -= UNA_TAZA;
           return "Serviste una taza a "+this.temperatura+"°celsius";
       }
   }
   public String llenarHervidor(){
       this.contenido = this.capacidad;
       return "Hervidor lleno con "+this.contenido+"L";
   }
   public String hervirAgua(){
       if(this.enchufado){
           this.temperatura = 100.0;
           return this.contenido+"L de agua a "+this.temperatura+"°Celsius";
       }else{
           return "Esperaste 10 mins, pero el hervidor estaba desenchufado";
       }
   }    
   public void esperar(){
       this.temperatura = 21.0;
   }
}

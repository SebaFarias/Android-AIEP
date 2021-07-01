package controlMotor;

public class ControlMotor {

    public static void main(String[] args) {
        Motor motor1 = new Motor();
        mostrarDatos(motor1);
        System.out.println(motor1.encender());
    }
    public static void mostrarDatos(Motor maquina){
        System.out.println("Lecturas:");
        System.out.println("Temperatura: "+maquina.getTemp());
        System.out.println("Nivel Aceite: "+maquina.getAceite()+"%");
        System.out.println("Nivel Combustible: "+maquina.getCombustible()+"%");
        System.out.println("Estado Batería: "+maquina.getVoltage()+"V");
        System.out.println("Revoluciones por Minuto: " + maquina.getRpm());
        if(maquina.getEncendido()){
            System.out.println("Estado: Encendido");
        }else{
            System.out.println("Estado: Apagado");
        }
        
    }
}

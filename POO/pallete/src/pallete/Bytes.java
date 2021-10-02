/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallete;

/**
 *
 * @author SebaFarias
 */
public class Bytes {
    
    private Bit bits[];  
    
    public Bytes(){
        this.bits = new Bit[8];
        for (int i = 0 ;i<this.bits.length ;i++){
            bits[i] = new Bit();
        }
    }    
    public Bytes(Bit newBits[]){
        this.bits = newBits;
    }
    private String getString(){
        String binarioCadena = "";
        for (int i = 0 ;i<this.bits.length ;i++) {
            binarioCadena += this.bits[i].getValue() ? "1" : "0";
        }
        return binarioCadena;
    }
    public int getValue(){
        return Integer.parseInt(this.getString(),2);
    }
}

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
public class Bit {
    private boolean value;
    public Bit(){
        this.value = Math.random()<=0.5;
    }    
    public Bit(boolean initialValue){
        this.value = initialValue;
    }
    public boolean getValue(){
        return this.value;
    }
    public void setValue(boolean newValue){
        this.value = newValue;
    }
    public boolean invert(){
        boolean newValue = !value;
        this.value = newValue;
        return newValue;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palette;

/**
 *
 * @author SebaFarias
 */
public class RGBColor {
    
    private Bytes red;
    private Bytes green;
    private Bytes blue;
    
    public RGBColor(){
        this.red = new Bytes();
        this.green = new Bytes();
        this.blue = new Bytes();
    }
    public String getRGBColor(){
        return "rgb("+red.getValue()+" , "+green.getValue()+" , "+blue.getValue()+")";
    }
}

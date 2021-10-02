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
public class Pallete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RGBColor color1 = new RGBColor();        
        RGBColor color2 = new RGBColor();        
        RGBColor color3 = new RGBColor();        
        
        System.out.println("Colores de la Paleta:");
        System.out.println("Color 1: "+color1.getRGBColor());
        System.out.println("Color 2: "+color2.getRGBColor());
        System.out.println("Color 3: "+color3.getRGBColor());
    }
    
}

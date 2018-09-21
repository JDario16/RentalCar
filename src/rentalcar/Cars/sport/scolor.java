/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.sport;
import rentalcar.Cars.color;
/**
 *
 * @author James
 */
public class scolor implements color {
    
    private String color;
    
    public scolor(String color){
        this.color=color;
    }
    
    public String getColor(){
        return color;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.familiar;
import rentalcar.Cars.color;
/**
 *
 * @author James
 */
public class fcolor implements color {
    
    private String color;
    
    public fcolor(String color){
        this.color=color;
    }
    
    public String getColor(){
        return color;
    }
}

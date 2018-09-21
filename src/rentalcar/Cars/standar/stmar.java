/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.standar;

import rentalcar.Cars.marca;

/**
 *
 * @author James
 */
public class stmar implements marca{
    
    private String mar;
    
    public stmar(String mar){
        this.mar=mar;
    }
    
    public String getMarca(){
        return mar;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.familiar;

import rentalcar.Cars.marca;

/**
 *
 * @author James
 */
public class fmar implements marca{
    
    private String mar;
    
    public fmar(String mar){
        this.mar=mar;
    }
    
    public String getMarca(){
        return mar;
    }
    
}

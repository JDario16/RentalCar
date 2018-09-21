/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.standar;

import rentalcar.Cars.placa;

/**
 *
 * @author James
 */
public class stplaca implements placa{
    
    private String placa;
    
    public stplaca(String placa){
        this.placa=placa;
    }
    
    public String getPlaca(){
        return placa;
    }
}

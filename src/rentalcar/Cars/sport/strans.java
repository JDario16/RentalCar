/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.sport;

import rentalcar.Cars.transmision;

/**
 *
 * @author James
 */
public class strans implements transmision{
    
    private String trans;
    
    public strans(String trans){
        this.trans=trans;
    }
    
    public String getTrans(){
        return trans;
    }
    
}

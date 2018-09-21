/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.familiar;
import rentalcar.Cars.cilindraje;
/**
 *
 * @author James
 */
public class fcil implements cilindraje{
    
    private String cil;
    
    public fcil(String cil){
        this.cil=cil;
    }
    
    public String getCil(){
        return cil;
    }
    
}

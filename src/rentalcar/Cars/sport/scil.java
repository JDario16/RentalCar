/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.sport;
import rentalcar.Cars.cilindraje;
/**
 *
 * @author James
 */
public class scil implements cilindraje{
    
    private String cil;
    
    public scil(String cil){
        this.cil=cil;
    }
    
    public String getCil(){
        return cil;
    }
    
}

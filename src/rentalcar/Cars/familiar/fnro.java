/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.familiar;

import rentalcar.Cars.nrPuestos;

/**
 *
 * @author James
 */
public class fnro implements nrPuestos{
    
    private String nro;
    
    public fnro(String nro){
        this.nro=nro;
    }
    
    public String getNro(){
        return nro;
    }
    
}

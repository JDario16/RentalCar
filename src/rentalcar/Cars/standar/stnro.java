/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Cars.standar;

import rentalcar.Cars.nrPuestos;

/**
 *
 * @author James
 */
public class stnro implements nrPuestos{
    
    private String nro;
    
    public stnro(String nro){
        this.nro=nro;
    }
    
    public String getNro(){
        return nro;
    }
    
}

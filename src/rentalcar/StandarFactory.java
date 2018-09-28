/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar;

import rentalcar.Cars.standar.*;
import rentalcar.Cars.*;
/**
 *
 * @author James
 */

public class StandarFactory implements CarFactory {

    private color color;
    private marca marca;
    private placa placa;
    private transmision trans;
    private cilindraje cil;
    private nrPuestos puesto;
    
    private String tipo = "Estandar";
    

    public StandarFactory(String color,String marca,String placa, String cil, String trans, String puesto){
        this.color = createColor(color);
        this.marca = createMarca(marca);
        this.placa = createPlaca(placa);
        this.trans = createTransmision(trans);
        this.cil   = createCilindraje(cil);
        this.puesto = createNrPuesto(puesto);
        
       
    }

    public color createColor(String color) {
        return new stcolor(color);
    }

    public marca createMarca(String marca) {
        return new stmar(marca);
     }

     
    public placa createPlaca(String placa) {
        return new stplaca(placa);
     }
    
    public cilindraje createCilindraje(String cil) {
        return new stcil(cil);
    }

    public transmision createTransmision(String trans) {
        return new sttrans(trans);
    }

    public nrPuestos createNrPuesto(String puesto) {
        return new stnro(puesto);
    }

    public String getColor() {
        return color.getColor();
    }

    public String getMarca() {
        return marca.getMarca();
    }
    
    public String getPlaca() {
        return placa.getPlaca();
    }
    
    public String getCilindraje() {
        return cil.getCil();
    }
    
    public String getTrans() {
        return trans.getTrans();
    }
    
    public String getNrPuesto() {
        return puesto.getNro();
    }

    public String getTipo() {
        return tipo;
    }

    
}



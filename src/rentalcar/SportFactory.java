/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar;

import rentalcar.Cars.sport.*;
import rentalcar.Cars.*;
/**
 *
 * @author James
 */

public class SportFactory implements CarFactory {

    private color color;
    private marca marca;
    private placa placa;
    private transmision trans;
    private cilindraje cil;
    private nrPuestos puesto;
    
    private String tipo = "Deportivo";
    

    public SportFactory(String color,String marca,String placa, String trans, String cil, String puesto){
        this.color = createColor(color);
        this.marca = createMarca(marca);
        this.placa = createPlaca(placa);
        this.trans = createTransmision(trans);
        this.cil   = createCilindraje(cil);
        this.puesto = createNrPuesto(puesto);
        
       
    }

    public color createColor(String color) {
        return new scolor(color);
    }

    public marca createMarca(String marca) {
        return new smar(marca);
     }

     
    public placa createPlaca(String placa) {
        return new splaca(placa);
     }
    
    public cilindraje createCilindraje(String cil) {
        return new scil(cil);
    }

    public transmision createTransmision(String trans) {
        return new strans(trans);
    }

    public nrPuestos createNrPuesto(String puesto) {
        return new snro(puesto);
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



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar;

import rentalcar.Cars.*;

public interface CarFactory {
    color createColor(String color);
    marca createMarca(String marca);
    placa createPlaca(String placa);
    cilindraje createCilindraje(String cilindro);
    transmision createTransmision(String transmi);
    nrPuestos createNrPuesto(String nPuesto);
    String getColor();
    String getMarca();
    String getPlaca();
    String getTipo();
}
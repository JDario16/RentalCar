/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar;
import rentalcar.Cars.familiar.*;
import rentalcar.Cars.sport.*;
import rentalcar.Cars.standar.*;
/**
 *
 * @author James
 */    
    public class BigFactory {       
        /*
         * Metodo para crear objetos de la fabrica de carros
         */
        public static CarFactory makeFactory(String color, String marca, String placa, String cil, String trans, String puesto, int type) {
            
          switch (type) {
            case 0:
              return new FamiliarFactory(color, marca, placa, cil, trans, puesto);
            case 1:
              return new SportFactory(color, marca, placa, cil, trans, puesto);
            case 2:
              return new StandarFactory(color, marca, placa, cil, trans, puesto);
            default:
              throw new IllegalArgumentException("No existe esta categoria de carro");
          }
        }
      }

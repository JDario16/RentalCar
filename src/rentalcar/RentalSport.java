/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar;
import rentalcar.Cars.SportCar;
/**
 *
 * @author James
 */
public class RentalSport implements SportCar{
    @Override
    public void RentarSport(){
        System.out.println("Rentaste un carro deportivo");
    }
}

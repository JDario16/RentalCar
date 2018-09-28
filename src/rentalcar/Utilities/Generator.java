/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Utilities;
import java.util.*;
import rentalcar.BigFactory;
import rentalcar.CarFactory;
/**
 *
 * @author James
 */
public class Generator {
    public static Stack<CarFactory>[] generadorCar(int tiposCarros, int cantidad){
        Random rand = new Random();
        int randType, randColor, randMarca, randPlaca;
        //Stack objects
        Stack<CarFactory> [] stockCar = new Stack[tiposCarros]; 
        for (int i=0; i<tiposCarros; ++i){
            stockCar[i] = new Stack<CarFactory>();
        }
        HashMap<Integer, String> colors = Data.color();
        HashMap<Integer, String> marcas = Data.marca();
        for (int i = 0; i < cantidad; i++) {
            randType = rand.nextInt(tiposCarros);
            randColor = rand.nextInt(colors.size());
            randMarca = rand.nextInt(marcas.size());
            randPlaca = rand.nextInt(900) + 100;
            CarFactory temp = BigFactory.makeFactory(colors.get(randColor), marcas.get(randMarca), ""+randPlaca, randType);
            stockCar[randType].push(temp);
        }
        return stockCar;
    }

    public static Customer[] generadorCustomer(int cantidad){
        Random rand = new Random();
        Customer[] customers = new Customer[cantidad];
        Customer customer;
        int randName, randId;  
        HashMap<Integer, String> nombres = Tools.nombres();
        for(int i=0; i < cantidad;i++){
            randName = rand.nextInt(nombres.size());
            randId = rand.nextInt(900) + 100;
            customer = new Customer(randId, nombres.get(randName));
            customers[i] = customer;
        }
        return customers; 
    }
}

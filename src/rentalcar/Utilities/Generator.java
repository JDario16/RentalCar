/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Utilities;
import java.util.*;
import javafx.util.Pair;
import rentalcar.Customer;
import rentalcar.BigFactory;
import rentalcar.CarFactory;
/**
 *
 * @author James
 */
public class Generator {
    public static Stack<CarFactory>[] generadorCar(int tiposCarros, int cantidad){
        Random rand = new Random();
        int randType, randColor, randMarca, randPlaca, randCil, randTrans, randPuesto;
        //Stack objects
        Stack<CarFactory> [] stockCar = new Stack[tiposCarros]; 
        for (int i=0; i<tiposCarros; ++i){
            stockCar[i] = new Stack<CarFactory>();
        }
        HashMap<Integer, String> colors = Data.color();
        HashMap<Integer, String> marcas = Data.marca();
        HashMap<Integer, String> cilindrajes = Data.cilindraje();
        HashMap<Integer, String> transm = Data.transmision();
        HashMap<Integer, String> puestos = Data.puesto();
        
        for (int i = 0; i < cantidad; i++) {
            randType = rand.nextInt(tiposCarros);
            randColor = rand.nextInt(colors.size());
            randMarca = rand.nextInt(marcas.size());
            randPlaca = rand.nextInt(900) + 100;
            randCil = rand.nextInt(cilindrajes.size());
            randTrans = rand.nextInt(transm.size());
            randPuesto = rand.nextInt(puestos.size());
            CarFactory temp = BigFactory.makeFactory(colors.get(randColor), marcas.get(randMarca), ""+randPlaca, cilindrajes.get(randCil), transm.get(randTrans), puestos.get(randPuesto), randType);
            stockCar[randType].push(temp);
        }
        return stockCar;
    }

    public static Customer[] generadorCustomer(int cantidad){
        Random rand = new Random();
        Customer[] customers = new Customer[cantidad];
        Customer customer;
        int randName, randId, randGen,randType;  
        System.out.println("Before map");
        HashMap<Integer, Pair<String, Pair<String, String>>> mapa = Data.nombres();
        System.out.println("After map");
        for(int i=0; i < cantidad;i++){
            randName = rand.nextInt(mapa.size());
            randId = rand.nextInt(900) + 100;
            Pair<String, Pair<String, String>> pairName = mapa.get(randName);
            Pair<String, String> pairGen = pairName.getValue();
            customer = new Customer(randId, pairName.getKey(), pairGen.getKey(), pairGen.getValue());
            customers[i] = customer;
        }
        return customers; 
    }
}

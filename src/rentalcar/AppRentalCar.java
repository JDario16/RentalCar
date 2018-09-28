/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar;

import java.util.*;
import java.time.LocalDateTime;
import rentalcar.Utilities.Generator;

/**
 *
 * @author James
 */

public class AppRentalCar {

    private static AppRentalCar instance = null;
    private int idRenta;

    //Cantidad de clientes, de carros, y tipos de carro
    private AppRentalCar(int cCustomer, int cCar, int tCar) {
        this.idRenta = 1;
        rentalTransation(cCustomer, cCar, tCar);
    }

    public static AppRentalCar getInstance(int cCustomer, int cCar, int tCar) {
        if (instance == null) {
            instance = new AppRentalCar(cCustomer, cCar, tCar);
        }
        return instance;
    }

    private void rentalTransation(int cCustomer, int cCar, int tCar) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int cantidadAutos = cCar;
        Stack<CarFactory>[] carros = Generator.generadorCar(tCar, cantidadAutos);
        Customer[] customer = Generator.generadorCustomer(cCustomer);
        int n, m = 0;
        RentalTransaction r;
        while (cantidadAutos != 0) {
            System.out.print("Ingrese Id de Customer: ");
            n = sc.nextInt();
            while (n < 1 || n > customer.length) {
                System.out.print("Id de Customer invalido, intente de nuevo: ");
                n = sc.nextInt();
            }

            System.out.print("Ingrese tipo de Carro: ");
            m = sc.nextInt();
            while (m < 1 || m > carros.length) {
                System.out.print("Tipo de auto invalido, intente de nuevo: ");
                m = sc.nextInt();

            }

            if (m > 0 && m <= carros.length) {
                while (carros[m - 1].empty()) {
                    System.out.print("Tipo de auto no disponible, intente de nuevo: ");
                    m = sc.nextInt();
                    while (m < 1 || m > carros.length) {
                        System.out.print("Tipo de auto invalido, intente de nuevo: ");
                        m = sc.nextInt();
                    }
                }
            }
            r = new RentalTransaction(idRenta, "" + java.time.LocalDate.now(), (rand.nextInt(10-1)+1) + "0000", customer[n - 1], carros[m - 1].pop());
            cantidadAutos--;
            idRenta++;
        }
    }

}

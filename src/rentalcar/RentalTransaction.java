/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar;

/**
 *
 * @author James
 */
public class RentalTransaction {
    private int id;
    private String fecha; // pickupDate, returnDate, valorHora, valorTotal;
    private Customer customer;
    private CarFactory car;

    public RentalTransaction(int id, String fecha, Customer customer, CarFactory car){
        this.id = id;
        this.fecha = fecha;
        this.customer = customer;
        this.car = car;
        print();
    }

    private void print(){
        System.out.println("");
        System.out.println("Numero de orden "+id);
        System.out.println("Fecha "+fecha);
        System.out.println("Cliente "+customer.getNombre());
        System.out.println("ID de cliente "+customer.getId());
        System.out.println("Tipo de carro rentado "+car.getTipo());
        System.out.println("Marca de carro rentado "+car.getMarca());
        System.out.println("Color de carro rentado "+car.getColor());
        System.out.println("Placa de carro rentado "+car.getPlaca());
        System.out.println("");
    }
}

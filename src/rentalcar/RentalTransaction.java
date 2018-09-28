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
    private String fecha, valorHora; 
    private Customer customer;
    private CarFactory car;

    public RentalTransaction(int id, String fecha, String valorHora, Customer customer, CarFactory car){
        this.id = id;
        this.fecha = fecha;
        this.valorHora = valorHora;
        this.customer = customer;
        this.car = car;
        print();
    }

    private void print(){
        System.out.println("");
        System.out.println("Numero de orden: "+id);
        System.out.println("Fecha: "+fecha);
        System.out.println("Valor por hora: "+valorHora);
        System.out.println("Cliente: "+customer.getNombre());
        System.out.println("ID de cliente: "+customer.getId());
        System.out.println("Tipo: "+car.getTipo());
        System.out.println("Marca: "+car.getMarca());
        System.out.println("Color: "+car.getColor());
        System.out.println("Placa: "+car.getPlaca());
        System.out.println("Numero de puestos: "+car.getNrPuesto());
        System.out.println("Tipo de transmision: "+car.getTrans());
        System.out.println("Tipo de cilindraje: 4 Cilindros de "+car.getCilindraje()+" cm3");
        System.out.println("");
    }
}

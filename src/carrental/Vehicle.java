package carrental;

public class Vehicle {

    String red = "red";

    public void getColor() {
        System.out.println("The vehicle is " + red);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.getColor();

        Car car = new Car();
        car.hasWinterTires();

        CarRental carrental = new CarRental();
        carrental.addContract();
        carrental.displayContracts();

        Customer customer = new Customer();
        customer.name();
        customer.address();

        Garage garage = new Garage();
        garage.setVehicle();

        Truck truck = new Truck();
        truck.hasTrailer();
        
        
    }

}

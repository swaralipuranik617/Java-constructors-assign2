public class VehicleInsurance {

    // Parent Class
    class Vehicle {

        String vehicleNumber = "MH12AB1234";
        String vehicleType = "Car";

        Vehicle() {
            System.out.println("Vehicle constructor called");
        }

        void displayVehicleInfo() {
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Vehicle Type: " + vehicleType);
        }
    }

    // Child Class 1
    class CarInsurance extends Vehicle {

        String insuranceType = "Comprehensive";

        CarInsurance() {
            super();
        }

        void displayInsurance() {
            System.out.println("\n--- Car Insurance ---");
            System.out.println("Insurance Type: " + insuranceType);

            System.out.println("Vehicle Information using super:");
            System.out.println("Vehicle Number: " + super.vehicleNumber);
            System.out.println("Vehicle Type: " + super.vehicleType);

            super.displayVehicleInfo();
        }
    }

    // Child Class 2
    class BikeInsurance extends Vehicle {

        String insuranceType = "Third Party";

        BikeInsurance() {
            super();
        }

        void displayInsurance() {
            System.out.println("\n--- Bike Insurance ---");
            System.out.println("Insurance Type: " + insuranceType);

            System.out.println("Vehicle Information using super:");
            System.out.println("Vehicle Number: " + super.vehicleNumber);
            System.out.println("Vehicle Type: " + super.vehicleType);
        }
    }

    public static void main(String[] args) {

        VehicleInsurance obj = new VehicleInsurance();

        CarInsurance car = obj.new CarInsurance();
        car.displayInsurance();

        BikeInsurance bike = obj.new BikeInsurance();
        bike.displayInsurance();
    }
}
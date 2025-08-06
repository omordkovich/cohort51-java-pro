package consultation_01;

public class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "black", 2025);
        Car myCar1 = new Car("VW", "red", 1985);

        myCar.startEngine();
        myCar1.startEngine();

        myCar = myCar1;
        myCar.setBrand("Ford");
        myCar.startEngine();
        myCar1.startEngine();

        ElectricCar electricCar = new ElectricCar("Tesla","yellow",2020,100);
      electricCar.startEngine();
        System.out.println("electricCar.getYear()" + electricCar.getYear());
      electricCar.chargeBattery();

     Car tesla = new ElectricCar("Tesla", "white", 2026, 300);

        tesla.startEngine();
        testCar(tesla);
    Car[] cars = new Car[2];
    }
    public static void testCar(Car car){
        car.startEngine();
    }

}

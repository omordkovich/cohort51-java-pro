package consultation_01;

//is-A -является. Dog is Animal
//has-A...-часть-целое(является частью). Содержит.
    //Процессор является частью компьютера
    //Компьютер содержит
public class ElectricCar extends Car{

    public ElectricCar(String brand, String color, int year, int batteryCapacity) {
        //super(); //вызов конструктора родителя
        super(brand, color, year);
        this.batteryCapacity = batteryCapacity;
    }

    int batteryCapacity;
public ElectricCar(int batteryCapacity){

    this.batteryCapacity= batteryCapacity;
}
void chargeBattery(){
    System.out.println(batteryCapacity+ " -> Charging battery...");
}
    //super - обращение к родительскому классу
public void startEngine(){
    super.startEngine();
}
}


/**
 * Класс легковых машин, наследуется от класса машин
 * @see Car
 * @author Kubarev Danil "danilkubarev@mail.ru"
 *  * @version 1.0
 * */
public class PassengerCar extends Car{
    /**Дополнительные сиденья*/
    int additionalSeats;

    /**
     * Конструктор класса без параметров
     * */
    public PassengerCar(){
        maxSpeed = 150;
        numberOfSeats = 5;
        weight = 2;
        tankCapacity = 60;
        color = "black";
        brand = null;
        stateNumber = null;
    }

    /**
     * Конструктор класса с параметрами
     * вызывает такойже конструктор из Класса Car
     * @see Car#Car(int, int, double, double, String, String, String)
     * */
    public PassengerCar(int maxSpeed, int numberOfSeats, double weight, double tankCapacity, String color, String brand, String stateNumber) {
        super(maxSpeed, numberOfSeats, weight, tankCapacity, color, brand, stateNumber);
    }




}

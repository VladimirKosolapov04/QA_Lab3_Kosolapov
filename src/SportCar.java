

/**
 * Класс спортивных легковых машин, наследуется от класса легковых машин
 * @see PassengerCar
 * @author Kubarev Danil "danilkubarev@mail.ru"
 *  * @version 1.0
 * */
public class SportCar extends PassengerCar {

    /**
     * Конструктор класса без параметров
     * Вызывает конструктор без параметров из класса родителя
     * @see PassengerCar#PassengerCar() 
     * После увеличивет количество скоростей до 7 и максимальную скорость до 250
     * */
    public SportCar(){
        super();
        maximumGear = 7;
        maxSpeed = 250;
    }

    /**
     * Конструктор класса c параметрами
     * Вызывает конструктор без параметров из класса родителя
     * @see PassengerCar#PassengerCar(int, int, double, double, String, String, String) 
     * */
    public SportCar(int maxSpeed, int numberOfSeats, double weight, double tankCapacity, String color, String brand, String stateNumber) {
        super(maxSpeed, numberOfSeats, weight, tankCapacity, color, brand, stateNumber);
    }
}

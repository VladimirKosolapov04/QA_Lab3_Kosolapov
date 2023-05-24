
/**
 * Базовый класс автомобиля, от него наследуются все остальыне типы авто
 * @author Kubarev Danil "danilkubarev@mail.ru"
 * @version 1.0
 *
 * Для примера работы с Doxygen выведу ниже формулу и кртинку.
 * Формула:
 * \f[
 * 	a^2 + b^2 = c^2
 * \f]
 * Картинка:
 * \image{inline} html 1.png "cosmonaut" width=492,5 height=428
 * */
public class Car {


    /**
     *  int
     *      maxSpeed - максимальная скорость
     *      numberOfSeats - количество сидячих мест
     *      maximumGear - Количество передач скоростей
     *      gear - скорость коробки передач
     *      speed - скорость автомобиля
     *
     *
     *  double
     *      weight - масса авто в тоннах
     *      tankCapacity - объём топливного бакоа в литрах
     *
     *  String
     *      color - цвет
     *      brand - марка
     *      stateNumber - госномер
     *
     *  boolean
     *      started - заведена ли машина
     *      headlights - включен ли фары
     * */
    int maxSpeed, numberOfSeats, maximumGear, gear, speed;
    double weight, tankCapacity;
    String color, brand, stateNumber;
    boolean started, headlights;



    /**
     * Конструктор класса без параметров
     * */
    public Car() {
        maxSpeed = 100;
        numberOfSeats = 5;
        maximumGear = 5;
        weight = 2;
        tankCapacity = 60;
        color = "black";
        brand = null;
        stateNumber = null;
        started = false;
        gear = 0;
        speed = 0;
        headlights = false;
    }


    /**
     * Конструктор класса с параметрами
     * @param maxSpeed максимальная скорость
     * @param numberOfSeats количество сидений
     * @param weight масса авто в тоннах
     * @param tankCapacity объём бака в литрах
     * @param color цвет
     * @param brand марка
     * @param stateNumber госномер
     * */
    public Car(int maxSpeed, int numberOfSeats, double weight, double tankCapacity, String color, String brand, String stateNumber) {
        this.maxSpeed = maxSpeed;
        this.numberOfSeats = numberOfSeats;
        this.weight = weight;
        this.tankCapacity = tankCapacity;
        this.color = color;
        this.brand = brand;
        this.stateNumber = stateNumber;
        started = false;
        gear = 0;
        speed = 0;
    }


    /**
     * Метод для запуска двигателя машины
     * @return заведена ли машина
     * */
    public boolean Start() {
        started = true;
        TurningOnTheHeadlights();
        return started;
    }

    /**
     * Метод для глушения двигателя машины
     * @return заведена ли машина
     * */
    public boolean Stop() {
        started = false;
        TurningOffTheHeadlights();
        return started;
    }


    /**
     * Метод для увеличения передачи
     * @return номер включённой передачи
     * */
    public int UpgradeGear() {

        if (gear < maximumGear) gear += 1;
        return gear;
    }


    /**
     * Метод для понижения передачи
     * @return номер включённой передачи
     * */
    public int DowngradeGear() {

        if (gear < maximumGear) gear -= 1;
        return gear;
    }

    /**
     * Метод для увеличения скорости
     * @return скорость машины
     * */
    public int Boost() {

        if (speed < maxSpeed) speed += 1;
        return speed;
    }

    /**
     * Метод для ументшения скорости
     * @return скорость машины
     * */
    public int Braking() {

        if (speed > 0) speed -= 1;
        return speed;
    }

    /**
     * Метод для включения фар
     * @return включены/выключены фары
     * */
    public boolean TurningOnTheHeadlights() {
        headlights = true;
        return headlights;
    }


    /**
     * Метод для выключения фар
     * @return включены/выключены фары
     * */
    public boolean TurningOffTheHeadlights() {
        headlights = false;
        return headlights;
    }
}

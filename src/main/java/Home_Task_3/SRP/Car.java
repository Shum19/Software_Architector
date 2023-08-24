package Home_Task_3.SRP;
/** Спроектировать абстрактный класс «Car» у которого должны быть свойства:
    марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
    методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
 **/

import Home_Task_3.OCP.SweeperCars;

import java.awt.*;

public abstract class Car {
    private String brand;
    private String type;
    private Color color;
    private String frame;
    private int numberOfWheels;
    private String typeOfFuel;
    private String transmission;
    private int engineVolume;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void Move(){}
    public void Maintenance(){}
    public int GearShift(int num){
        int position = num;
        return position;
    }
    public void lightSwitcher(){}
    public void wiperSwitcher(){}


}

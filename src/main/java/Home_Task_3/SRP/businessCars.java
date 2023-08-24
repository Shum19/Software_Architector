package Home_Task_3.SRP;

import Home_Task_3.OCP.IAntifogLights;

/** Создать конкретный автомобиль путём наследования класса «Car»
 **/
public class businessCars extends Car implements IAntifogLights {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void AntifogSwitcher() {
        System.out.println("Additionally I have option ANTIFOG LIGHTS. Enjoy driving");
    }
}

package Home_Task_3.OCP;
import Home_Task_3.SRP.Car;

/**  Расширить абстрактный класс «Car», добавить метод: подметать улицу. Создать конкретный автомобиль
    путём наследования класса «Car». Провести проверку принципа SRP.**/
public class SweeperCars extends Car implements ISweeping, ICargoTransportation{


    @Override
    public void Sweep() {
        System.out.println("I am sweeping");
    }

    @Override
    public void CargoTransporting() {
        System.out.println("I have cargo compartment to store rubbish  and transport it to dump");
    }
}

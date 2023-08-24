package Home_Task_3;

import Home_Task_3.LSP.TreeCycle;
import Home_Task_3.OCP.SweeperCars;
import Home_Task_3.SRP.businessCars;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        businessCars businessCars = new businessCars();
        businessCars.setColor(Color.RED);
        businessCars.AntifogSwitcher();

        SweeperCars sweeperCars = new SweeperCars();
        sweeperCars.Sweep();
        sweeperCars.CargoTransporting();

        TreeCycle treeCycle = new TreeCycle();
        System.out.println(treeCycle.getNumberOfWheels());
        treeCycle.setNumberOfWheels(5);
        System.out.println(treeCycle.getNumberOfWheels());

    }
}

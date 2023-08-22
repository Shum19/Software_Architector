package Home_Task_2;

import Home_Task_2.Generators.GemGenerator;
import Home_Task_2.Generators.GoldGenerator;

public class Main {
    public static void main(String[] args) {
        ItemFabric generator = new GoldGenerator();
        generator.OpenReward();
        generator = new GemGenerator();
        generator.OpenReward();
    }
}

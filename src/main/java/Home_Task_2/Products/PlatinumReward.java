package Home_Task_2.Products;

import Home_Task_2.IGameItem;

public class PlatinumReward implements IGameItem {
    @Override
    public void Open() {
        System.out.println("PLATINUM");
    }
}

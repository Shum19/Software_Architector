package Home_Task_2.Generators;

import Home_Task_2.IGameItem;
import Home_Task_2.ItemFabric;
import Home_Task_2.Products.GoldReward;

public class GoldGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}

package Home_Task_2;

public abstract class ItemFabric {
    public abstract IGameItem createItem();

    public void OpenReward(){
        IGameItem gameItem = createItem();
        gameItem.Open();
    }
}

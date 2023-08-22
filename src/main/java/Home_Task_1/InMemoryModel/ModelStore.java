package Home_Task_1.InMemoryModel;

import Home_Task_1.ModelElements.Flash;
import Home_Task_1.ModelElements.PoligonalModel;
import Home_Task_1.ModelElements.Camera;
import java.util.List;
import Home_Task_1.ModelElements.Scene;


public class ModelStore implements IModelChangeObserver, IModelChanger{
    public List <PoligonalModel> models;
    public List <Scene> scenes;
    public List <Flash> flashes;
    public List <Camera> cameras;


    @Override
    public void IModelChangeObserver(){}
    public Scene GetScene (int num){
        return (Scene) this.scenes;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}

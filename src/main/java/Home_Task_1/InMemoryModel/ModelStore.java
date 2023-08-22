package Home_Task_1.InMemoryModel;

import Home_Task_1.ModelElements.Flash;
import Home_Task_1.ModelElements.PoligonalModel;
import Home_Task_1.ModelElements.Camera;

import java.util.ArrayList;
import java.util.List;
import Home_Task_1.ModelElements.Scene;


public class ModelStore implements IModelChanger{
    public List <PoligonalModel> models;
    public List <Scene> scenes;
    public List <Flash> flashes;
    public List <Camera> cameras;

    private List <IModelChangeObserver> changeObservers;

    public ModelStore(List<IModelChangeObserver> changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        this.models.add(new PoligonalModel(null));
        this.cameras.add(new Camera());
        this.flashes.add(new Flash());
        this.scenes.add(new Scene(0, this.models, this.flashes, this.cameras));
    }

    public Scene GetScene (int id){
        for (int i = 0; i < this.scenes.size() ; i++) {
            if (this.scenes.get(i).id == id)
                return this.scenes.get(i);
        }
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}

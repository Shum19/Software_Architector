package Home_Task_1.ModelElements;
import java.util.List;
public class Scene {
    public int id;
    public List <PoligonalModel> models;
    public List <Flash> flashes;
    public List <Camera> cameras;
    public <T> T Method1(T  flash){
        return flash;
    }
    public <T, E> T Method2(T flash, E camera){
        return flash;
    }

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        if (models.size() > 0){
            this.models = models;
        }else {
            throw new  Exception("There must be one model at least");
        }
        this.id = id;
        this.flashes = flashes;
        if (cameras.size() > 0){
            this.cameras = cameras;
        }else {
            throw new  Exception("There must be one camera at least");
        }
    }
}

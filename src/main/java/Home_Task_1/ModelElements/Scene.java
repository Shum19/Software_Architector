package Home_Task_1.ModelElements;
import java.util.List;
public class Scene {
    public int id;
    public List <PoligonalModel> models;
    public List <Flash> flashes;
    public <T> T Method1(T  t){
        return t;
    }
    public <T> T Method2(T t, T t2){
        return t;
    }
    public Scene(PoligonalModel models, Flash flashes){
        this.models = (List<PoligonalModel>) models;
        this.flashes = (List<Flash>) flashes;
    }
}

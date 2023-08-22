package Home_Task_1.ModelElements;

import javafx.geometry.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Flash {
    public List <Point3D> Location = new ArrayList<>();
    public List <Color> color = new ArrayList<>();
    public List <Float> power = new ArrayList<>();
    public List <Angle3D> angle = new ArrayList<>();
    public void Rotate(Angle3D angle){}
    public void Move(Point3D point){}
}

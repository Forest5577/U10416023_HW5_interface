//U10416023 Forest

//import API we need
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class BeanGame extends Application{
  @Override
  public void start(Stage primaryStage){
    Pane panel = new Pane();
    Polyline edge = new Polyline();
    edge.getPoints().addAll(210.0,50.0,210.0,90.0,110.0,300.0,110.0,360.0,350.0,360.0,350.0,300.0,250.0,90.0,250.0,50.0);
    edge.setFill(Color.WHITE);
    panel.getChildren().add(edge);
    Line[] line = new Line[7];
    for(int i = 0;i <= 6;i++){
      line[i] = new Line(140.0+i*30.0,300.0,140.0+i*30,360.0);
      panel.getChildren().add(line[i]);
    }
    Circle[] circle = new Circle[28];
    for(int x = 0;x <= 27;x++){
    	if (x<=6)
    	  circle[x] = new Circle(140.0+30.0*x,290.0,5);
      else if(x >= 7 && x <= 12)
        circle[x] = new Circle(155.0+30.0*(x-7),260.0,5);
      else if(x >= 13 && x <= 17)
        circle[x] = new Circle(170.0+30.0*(x-13),230.0,5);
      else if(x >= 18 && x <= 21)
        circle[x] = new Circle(185.0+30.0*(x-18),200.0,5);
      else if(x >= 22 && x <= 24)
        circle[x] = new Circle(200.0+30.0*(x-22),170.0,5);
      else if(x >= 25 && x <= 26)
        circle[x] = new Circle(215.0+30.0*(x-25),140.0,5);
      else
        circle[x] = new Circle(230.0,110.0,5);
      panel.getChildren().add(circle[x]);
    }
    Scene scene = new Scene(panel, 460 , 380 , Color.BLACK);

    primaryStage.setTitle("U10416023_BeanGame");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch();
  }
}

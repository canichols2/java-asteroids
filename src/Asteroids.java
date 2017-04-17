import java.util.ArrayList;
import java.util.Vector;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Asteroids extends Application {
	public static Image IMG_Asteroids;
	public static Image IMG_Ship;
	public static Image IMG_Laser;
	private static final double windowHeight = 500.0;
	private static final double windowWidth = 500.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	private static void createRocks(ArrayList<FlyingObject> object) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			double y = Math.random() * windowHeight + 1;
			double x = Math.random() * windowWidth + 1;
			object.add(new Rock(
					x, 
					y,
					Math.random()*2-1,
					Math.random()*2-1
				));
		}

	}

	private void gameLoop(ArrayList<FlyingObject> object){
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<FlyingObject> object = new ArrayList<FlyingObject>();
		Ship player = new Ship(0,0);
		object.add(player);
		createRocks(object);

		stage.setTitle("Asteroids -A Nichols Production");
		stage.setWidth(windowWidth);
		stage.setHeight(windowHeight);
		GridPane root = new GridPane();
		Scene scene = new Scene(root,windowWidth,windowHeight,Color.BLACK);
		stage.setScene(scene);
		stage.show();
		
		Vector<FlyingObject> objs = new Vector<FlyingObject>(16);
		IMG_Asteroids = new Image("asteroids.png");
		IMG_Ship = new Image("ship.png");
		IMG_Laser = new Image("beams.png");
		ImageView shipImg = new ImageView();
		shipImg.setImage(IMG_Ship);
		
		Button btn = new Button();
		btn.setText("GoFuckYourself");
		root.getChildren().add(btn);
		root.getChildren().addAll(shipImg);
	}
}

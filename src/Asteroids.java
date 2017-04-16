import java.util.ArrayList;
public class Asteroids {
	private static final double windowHeight = 500.0;
	private static final double windowWidth = 500.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FlyingObject> object = new ArrayList<FlyingObject>();
		Ship player = new Ship(0,0);
		object.add(player);
		createRocks(object);
	}

	private static void createRocks(ArrayList<FlyingObject> object) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			double y = Math.random() * windowHeight + 1;
			double x = Math.random() * windowWidth + 1;
			object.add(new Rock(x, y,
					Math.random()*2-1,
					Math.random()*2-1
					));
		}

	}

	private void gameLoop(ArrayList<FlyingObject> object){

	}
}

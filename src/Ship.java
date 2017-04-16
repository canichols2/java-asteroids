import java.util.ArrayList;

public class Ship extends FlyingObject{
	Ship(){
		super();
	}
	Ship(double x, double y){
		super(x,y);
	}
	Ship(double x, double y,double dx, double dy){
		super(x,y,dx,dy);
	}
	
	public void fire(ArrayList<FlyingObject> object){
		double thrust = 5.0;
		object.add(new Bullet(
				this.getx(),
				this.gety(),
				this.getdx(),
				this.getdy(),
				this.getrotation(),
				thrust
				));
	}
}
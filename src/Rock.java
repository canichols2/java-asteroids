
public class Rock extends FlyingObject {

	public Rock() {
		// TODO Auto-generated constructor stub
	}

	public Rock(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Rock(double x, double y, double dx, double dy) {
		super(x, y, dx, dy);
		// TODO Auto-generated constructor stub
	}

	public Rock(double x, double y, double dx, double dy, double rotation) {
		super(x, y, dx, dy, rotation);
		// TODO Auto-generated constructor stub
	}

	public Rock(double x, double y, double dx, double dy, double rotation, double thrust) {
		super(x, y, dx, dy, rotation, thrust);
		// TODO Auto-generated constructor stub
	}

	public void update(){
		super.update();
//		Continue to spin
		this.addRotation(5.0);
	}
}


// Testing commit things.

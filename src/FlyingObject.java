
public class FlyingObject extends Point{
	private double dx,dy,rotation;
	private boolean alive;
//	Constructors
	public FlyingObject() {
		// TODO Auto-generated constructor stub
		super();
		this.dx=0.0;
		this.dy=0.0;
		this.rotation=0;
		this.alive=true;
	}
	public FlyingObject(double x, double y) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.dx=0.0;
		this.dy=0.0;
		this.rotation=0;
		this.alive=true;
	}
	public FlyingObject(double x, double y,double dx, double dy) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.dx=dx;
		this.dy=dy;
		this.rotation=0;
		this.alive=true;
	}
	public FlyingObject(double x, double y,double dx, double dy,double rotation) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.dx=dx;
		this.dy=dy;
		this.rotation=Math.toRadians(rotation);
		this.alive=true;
	}
	public FlyingObject(double x, double y,double dx, double dy,double rotation,double thrust) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.dx=dx;
		this.dy=dy;
		this.rotation=Math.toRadians(rotation);
		addThrust(thrust);
		this.alive=true;
	}
//	get/set
	public double getdx()		{	return this.dx;			}
	public double getdy()		{	return this.dy;			}
	public boolean isAlive()	{	return this.alive;		}
	
	
//	Rotation Get/Set
	/**
	 * All Rotation access is degrees                           
	 * <p>
	 * Internal Calculations done using radians
	 * @return Returned in Degrees.
	 */
	public double getrotation()	{	return Math.toDegrees(this.rotation);	}
	/**
	 * All Rotation access is degrees                           
	 * <p>
	 * Internal Calculations done using radians.
	 * @rotation Paramter is in Degrees.
	 */
	public void	addRotation(double rotation) 	{
		this.rotation += Math.toRadians(rotation);	
	}
	/**
	 * All Rotation access is degrees                           
	 * <p>
	 * Internal Calculations done using radians.
	 * @rotation Paramter is in Degrees.
	 */
	public void setRotation(double rotation){
		this.rotation = Math.toRadians(rotation);
	}
//	Methods
	public void update(){
		this.setx(this.getx() + this.dx);
		this.sety(this.gety() + this.dy);
	}
	public void addThrust(double thrust){
//		sin(ang)=o/h and cos(ang)=a/h
		this.dx += Math.cos(this.rotation)/thrust;
		this.dy += Math.sin(this.rotation)/thrust;
	}
}

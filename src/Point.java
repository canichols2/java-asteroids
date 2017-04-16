
public class Point {
	private double x,y;
//	Constructors
	public Point(){
		this.x=0.0;
		this.y=0.0;
	}
	public Point(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
//	Get/Set
	public double getx()		{	return this.x;	}
	public double gety()		{	return this.y;	}
	public void setx(double x)	{	this.x = x;		}
	public void sety(double y)	{	this.y = y;		}
}

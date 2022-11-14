package ie.itcarlow.lab5;

public class Circle extends Point {
	
	private int r;

	public Circle(int x, int y, int r) 
	{
		super(x, y);
		setR(r);
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + "]";
	}
	

}

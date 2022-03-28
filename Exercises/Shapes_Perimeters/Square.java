public class Square implements Shape{

	public String color;
	public double length;
	
	public Square(double length, String color){
		this.length = length;
		this.color = color;
	}

	public double getArea(){
		return this.length * this.length;
	}
	public double getPerimeter(){
		return this.length * 4;
	}

}
package Chapter13;


public class Circle {
	
	//instance variable
	private double radius;
	private String color;
	
	//constructor
	public Circle(){
		radius = 1;	
	}
	
	//constructor with parameters
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	//constructor with parameters
	public Circle(double radius){
		this.radius = radius;
	}
	
	//getter
	public double getRadius() {
		return radius;
	}
	
	//setter
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	//getter
	public String getColor() {
		return color;
	}
	
	//setter
	public void setColor(String color) {
		this.color = color;
	}
	
	public double area(double radius){
		return radius * radius * Math.PI;
	}
	
	public static void CircumferenceFormula(){
		System.out.println("Circle Formula is C = 2 * PI * Radius");
		
	}
	
	public boolean equals(Object c){
		Circle testObj = (Circle)c;
		if(testObj.getRadius() == radius){
			return true;
		} else {
			return false;
		}
	}
	
	public String toString(){
		String information = "The Circle has a radius of: " + radius;
		return information;
	}
	
	

}


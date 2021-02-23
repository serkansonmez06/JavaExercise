package mod3Week1HW3;

public class Cuboid extends Rectangle{

	public double height;

	Cuboid(double width, double length, double height) {
		super(width, length);
		 if(height<0) {
    		 this.height=0; 
    	 }else {
    		 this.height=height;
    	 }
			 }
	public double getHeight() {
		return this.height;
		
	}
	public double getVolume() {
		return this.getArea()*this.height;
	}
		
	}



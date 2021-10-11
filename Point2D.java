package basics;
import javafx.geometry.Point2D;

public class Point2D {
	public static void main(String args[]) {

		Point2D obj= new Point2D(20.0, 30.0);
		double x,y;

		x=obj.getX();
		y=obj.getY();
	
	System.out.println("x co-ordinate=:"+x+",y co-ordinate=" + y);
	}	
	

}
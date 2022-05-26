package firstReview;

import java.awt.Point;

public class SaturdayReview {

	public static void main(String[] args) {
	
	 Point pointA= new Point(1,1);
	 Point pointB= pointA;
	 pointA.y = 2;
	 System.out.println("pointA="+pointA+",PointB="+pointB);
	
	}


	
}

package com.ccccc;

public class TestMyPoint {

	public static void main(String[] args) {
			MyPoint start = new MyPoint();
			MyPoint end = new MyPoint();
		       start.x=10;
		       start.y=10;
		       end.x=20;
		       end.y=30;
		    System.out.println("Start point is"+start); 
		    MyPoint stray = new MyPoint();
				stray=(MyPoint)end;
			System.out.println("Stray point is"+stray); 
			System.out.println("end point is"+end); 
			stray.x=55;
			stray.y=65;
			System.out.println("Start point is"+start); 
			System.out.println("Stray point is"+stray);
			System.out.println("end point is"+end);

		}
	}
	
	  class MyPoint {
		  public int x;
		  public int y;
		  

		  public String toString() {
		    return ("[" + x + "," + y + "]");
		  }
		}


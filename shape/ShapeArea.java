package com.oops.shape;

public class ShapeArea {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
        System.out.println("Rectangle - Area: " + r.area());
        
        Square s = new Square(12);
        System.out.println("Square Area : "+s.area());
        
        Triangle t = new Triangle(8, 6);
        System.out.println("Triangle Area is "+t.area());
	}

}

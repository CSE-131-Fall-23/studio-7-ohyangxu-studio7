package studio7;

public class Rectangle {
	public static int Length = 0;
	public static int Width = 0;
	
	public Rectangle(int a, int b) {
		// TODO Auto-generated method stub
		Length = a;
		Width = b ;
	}
	public static int Area() {
		int area = Length*Width;
		return area;
	}

	public static int perimeter() {
		int peri = Length*2+Width*2;
		return peri;
	}
	
	public static boolean compare(Rectangle B) {
		int areaA = Length*Width;
		int areaB = B.Area();
		if(areaA < areaB) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean square() {
		if ( Length == Width) {
			return true;
		}
		return false;
	}
}

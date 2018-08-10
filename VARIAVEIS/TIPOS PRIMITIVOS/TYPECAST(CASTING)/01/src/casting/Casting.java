package casting;
public class Casting {
	public static void main(String[] args) {
		double d3 = 3.14;
		int i = (int)d3;
		System.out.println(i);
		
		long x = 10000;
		int i1 =(int) x;
		System.out.println(i1);
		
		float x1 = 0.0f;
		System.out.println(x1);
		
		double d = 5;
		float f = 3;
		float x2 = f + (float) d;
		System.out.println(x2);
	}
}


package advance.dev;

public class Triangle extends Shape {
	  private double a, b, c;

	    public Triangle(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }
	    public double chuVi() {
	        return a + b + c;
	    }

	    @Override
	    public double dienTich() {
	        double p = chuVi() / 2;
	        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	    }
}

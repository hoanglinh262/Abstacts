package advance.dev;

public class Rectangle extends Shape  {
	 private double a, b;

	    public Rectangle(double a, double b) {
	        this.a = a;
	        this.b = b;
	    }

	    @Override
	    public double chuVi() {
	        return 2 * (a + b);
	    }

	    @Override
	    public double dienTich() {
	        return a * b;
	    }

}

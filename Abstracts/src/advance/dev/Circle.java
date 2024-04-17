package advance.dev;

public class Circle extends Shape {
	  private double r;

	    public Circle(double r) {
	        this.r = r;
	    }

	    @Override
	    public double chuVi() {
	        return 2 * Math.PI * r;
	    }

	    @Override
	    public double dienTich() {
	        return Math.PI * r * r;
	    }

}

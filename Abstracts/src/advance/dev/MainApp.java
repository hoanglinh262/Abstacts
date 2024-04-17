package advance.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape[] shapes = new Shape[10];

	        input(shapes);
	        print(shapes);

	        Shape maxAreaShape = findShapeWithMaxArea(shapes);
	        System.out.println("Hình có diện tích lớn nhất:");
	        System.out.println("Diện tích: " + maxAreaShape.dienTich());

	        System.out.println("Diện tích lớn nhất của mỗi hình:");
	        printMaxAreaForEachShapeType(shapes);
	    }

	    public static void input(Shape[] shapes) {
	        // Nhập thông tin cho 3 hình tròn, 3 hình chữ nhật, 4 hình tam giác
	        // Trong một ứng dụng thực tế, bạn có thể thực hiện nhập thông tin từ bàn phím hoặc từ các nguồn dữ liệu khác
	        for (int i = 0; i < 10; i++) {
	            if (i < 3) {
	                shapes[i] = new Circle(3); // Ví dụ: Hình tròn có bán kính 3
	            } else if (i >= 3 && i < 6) {
	                shapes[i] = new Rectangle(4, 5); // Ví dụ: Hình chữ nhật có chiều dài 4 và chiều rộng 5
	            } else {
	                shapes[i] = new Triangle(3, 4, 5); // Ví dụ: Tam giác có các cạnh 3, 4, 5
	            }
	        }
	    }

	    public static void print(Shape[] shapes) {
	        for (int i = 0; i < shapes.length; i++) {
	            System.out.println("Hình thứ " + (i + 1) + ":");
	            System.out.println("Chu vi: " + shapes[i].chuVi());
	            System.out.println("Diện tích: " + shapes[i].dienTich());
	        }
	    }

	    public static Shape findShapeWithMaxArea(Shape[] shapes) {
	        Shape maxAreaShape = shapes[0];
	        double maxArea = shapes[0].dienTich();
	        for (int i = 1; i < shapes.length; i++) {
	            if (shapes[i].dienTich() > maxArea) {
	                maxArea = shapes[i].dienTich();
	                maxAreaShape = shapes[i];
	            }
	        }
	        return maxAreaShape;
	    }

	    public static void printMaxAreaForEachShapeType(Shape[] shapes) {
	        double maxCircleArea = Double.MIN_VALUE;
	        double maxRectangleArea = Double.MIN_VALUE;
	        double maxTriangleArea = Double.MIN_VALUE;

	        for (Shape shape : shapes) {
	            if (shape instanceof Circle) {
	                double area = shape.dienTich();
	                if (area > maxCircleArea) {
	                    maxCircleArea = area;
	                }
	            } else if (shape instanceof Rectangle) {
	                double area = shape.dienTich();
	                if (area > maxRectangleArea) {
	                    maxRectangleArea = area;
	                }
	            } else if (shape instanceof Triangle) {
	                double area = shape.dienTich();
	                if (area > maxTriangleArea) {
	                    maxTriangleArea = area;
	                }
	            }
	        }

	        System.out.println("Hình tròn có diện tích lớn nhất: " + maxCircleArea);
	        System.out.println("Hình chữ nhật có diện tích lớn nhất: " + maxRectangleArea);
	        System.out.println("Hình tam giác có diện tích lớn nhất: " + maxTriangleArea);
	    }
	}



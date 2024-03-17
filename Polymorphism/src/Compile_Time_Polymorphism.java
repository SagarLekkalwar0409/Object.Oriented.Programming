//Same method name but different parameters
class Shape {
    static int area = 0;

    public void Area(int l, int b) {
        area = l * b;
        System.out.println("Area of Triangle is : " + area);
    }

    public void Area(int side) {
        area = side * side;
        System.out.println("Area of Square is : " + area);
    }

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.Area(10, 20);
        shape.Area(10);
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Test constructor mặc định (không tham số)
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " color=" + c1.getColor()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        // 2. Test constructor 1 tham số (radius), height mặc định = 1.0
        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Cylinder 2:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " color=" + c2.getColor()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        // 3. Test constructor 2 tham số (radius, height)
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder 3:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " color=" + c3.getColor()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());

        // 4. Test constructor 3 tham số (radius, height, color)
        Cylinder c4 = new Cylinder(3.0, 4.0, "blue");
        System.out.println("Cylinder 4:"
                + " radius=" + c4.getRadius()
                + " height=" + c4.getHeight()
                + " color=" + c4.getColor()
                + " base area=" + c4.getArea()
                + " volume=" + c4.getVolume());
    }
}
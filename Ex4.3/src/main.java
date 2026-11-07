public class main {
    public static void main(String[] args) {

        p2d p2a = new p2d();
        System.out.println("Point2D mặc định: " + p2a);

        p2d p2b = new p2d(1.5f, 2.5f);
        System.out.println("Point2D tham số: " + p2b);

        p2a.setXY(3.0f, 4.0f);
        System.out.println("Point2D sau setXY: " + p2a);


        p3d p3a = new p3d();
        System.out.println("Point3D mặc định: " + p3a);

        p3d p3b = new p3d(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D tham số: " + p3b);

        p3b.setXYZ(5.5f, 6.5f, 7.5f);
        System.out.println("Point3D sau setXYZ: " + p3b);


        float[] coords = p3b.getXYZ();
        System.out.println("Tọa độ XYZ từ getXYZ(): [" + coords[0] + ", " + coords[1] + ", " + coords[2] + "]");
    }
}
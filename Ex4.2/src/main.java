public class main {
    public static void main(String[] args) {
        person p1 = new person("Nguyen Van A", "123 Le Loi, Da Nang");
        System.out.println(p1);
        p1.setAddress("456 Nguyen Hue, Da Nang");
        System.out.println("Cap nhat dia chi Person: " + p1.getAddress());
        System.out.println(p1);
        System.out.println();

        student s1 = new student("Tran Thi B", "789 Tran Phu, Da Nang", "Computer Science", 2024, 1500.50);
        System.out.println(s1);
        System.out.println("Name: " + s1.getName());
        System.out.println("Address: " + s1.getAddress());
        System.out.println("Program: " + s1.getProgram());
        System.out.println("Year: " + s1.getYear());
        System.out.println("Fee: " + s1.getFee());

        s1.setProgram("Data Science");
        s1.setYear(2025);
        s1.setFee(1800.00);
        System.out.println("Sau khi cap nhat Student:");
        System.out.println(s1);
        System.out.println();

        staff st1 = new staff("Le Van C", "101 Vo Van Kiet, Da Nang", "NTU School of CSE", 2500.00);
        System.out.println(st1);
        System.out.println("Name: " + st1.getName());
        System.out.println("Address: " + st1.getAddress());
        System.out.println("School: " + st1.getSchool());
        System.out.println("Pay: " + st1.getPay());

        st1.setSchool("NTU School of EEE");
        st1.setPay(3000.00);
        System.out.println("Sau khi cap nhat Staff:");
        System.out.println(st1);
    }
}
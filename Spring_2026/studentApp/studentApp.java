package studentApp;
import java.util.Scanner;

public class studentApp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the course you want to enroll: ");
        String course1 = input.next();
        System.out.println("Enter your name: ");
        String name = input.next();

        student st = new student();
        st.name = name;
        course crs1 = new course();
        crs1.courseName = course1;
        st.c1 = crs1;

        System.out.println("The Student information: ");
        System.out.println(st.name);
        System.out.println(st.c1.courseName);

    }
}

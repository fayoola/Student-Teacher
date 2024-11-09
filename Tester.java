package Project;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Pilih 1. teacher atau 2. student");
        int pilihan = in.nextInt();
        in.nextLine();
        
        if (pilihan == 1) {
            System.out.println("name:");
            String name = in.nextLine();
            
            System.out.println("Subject:");
            String subject = in.nextLine();
            
            System.out.println("age:");
            int age = in.nextInt();
            in.nextLine();
            
            System.out.println("Part Time (1 for Yes, 0 for No):");
            boolean partTime = in.nextInt() == 1;
            in.nextLine();
            
            Teacher teacher1 = new Teacher(name, age, subject, partTime);
            teacher1.print();
            
        } else if (pilihan == 2) {
            System.out.println("name:");
            String name = in.nextLine();
            
            System.out.println("Major:");
            String major = in.nextLine();
            
            System.out.println("age:");
            int age = in.nextInt();
            in.nextLine();
            
            System.out.println("Student Number:");
            int studentNumber = in.nextInt();
            in.nextLine();
            
            System.out.println("score:");
            int score = in.nextInt();
            in.nextLine();
            
            Student student1 = new Student(name, age, studentNumber, score, major);
            student1.print();
            
        } else {
            System.out.println("Input salah");
        }
        
        in.close();
    }
}

package Project;

public class Teacher {
    private String name;
    private int age;
    private String subject;
    private boolean partTime;

    public Teacher(String name, int age, String subject, boolean partTime) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.partTime = partTime;
    }

    public void print() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Part Time: " + (partTime ? "Yes" : "No"));
    }
}

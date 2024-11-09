package Project;

public class Student extends Person {
    protected int Studentnumber;
    protected int score;
    protected String major;

    public int getStudentnumber() {
        return this.Studentnumber;
    }

    public void setStudentnumber(int Studentnumber) {
        this.Studentnumber = Studentnumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student() {
        super();
        Studentnumber = 0;
        score = 0;
        major = "";
    }

    public Student(String name,int age,int Studentnumber, int score, String major) {
        super(name, age);
        this.Studentnumber = Studentnumber;
        this.score = score;
        this.major = major;
    }

    public void print() {
        System.out.println("Student Number:" + Studentnumber);
        System.out.println("Score:" + score);
        System.out.println("Major:" + major);
    }
}
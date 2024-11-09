package Project;

public class FullTime extends Teacher {
    protected int annualSalary;
    protected String unit;

    public int getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public FullTime() {
        super("", 0, "", false); 
        this.unit = "";
    }

    // Parameterized constructor
    public FullTime(String name, int age, String subject, int annualSalary, String unit) {
        super(name, age, subject, false); 
        this.unit = unit;
    }
    public void print() {
        super.print(); // Call the superclass print method
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Unit: " + unit);
    }
}


package inheritance.employee;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, String jobTitle, double salary, String programmingLanguage) {
        super(name, jobTitle, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void programeApp() {
        System.out.println("Programming an app using" + programmingLanguage);
    }

    public double getBonus() {
        return super.getSalary() * 0.05;
    }
}

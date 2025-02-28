package inheritance.employee;

public class Manager extends Employee{
    private int noOfSlaves;

    public Manager(String name, String jobTitle, double salary,int noOfSlaves) {
        super(name, jobTitle, salary);
        this.noOfSlaves = noOfSlaves;
    }

    public int getNoOfSlaves() {
        return noOfSlaves;
    }

    public void setNoOfSlaves(int noOfSlaves) {
        this.noOfSlaves = noOfSlaves;
    }

    public void printReport() {
        System.out.println("You have " + noOfSlaves + " employees under you!");
    }

    @Override
    public double getBonus() {
        return getSalary()*0.10;
    }
}

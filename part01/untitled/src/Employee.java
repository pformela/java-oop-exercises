public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public int getAnnualSalary() {
        return 12 * this.salary;
    }

    public int raiseSalary(int percent) {
        int newSalary = this.salary + Math.round(this.salary * percent / 100.0f);
        this.salary = newSalary;

        return newSalary;
    }

    public String toString() {
        return "Employee[id=" + this.id + ",name=" + this.getName() + ",salary=" + this.salary + "]";
    }

}

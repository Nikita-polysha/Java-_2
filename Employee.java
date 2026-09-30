public class Employee {
    private String name;
    private String position;
    private double salary;

    private static int employeeCount = 0;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
        employeeCount++;
    }

    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setPosition(String position) { this.position = position; }

    public void setSalary(double salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public String toString() {
        return name + " — " + position + ", оклад " + salary;
    }
}
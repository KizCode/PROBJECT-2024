public class Employee {
    private static final double BASE_SALARY = 15000.00;
    private String name;
    private double salary;
    private int age;

    public Employee (String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.age = 0;
    }

    public Employee (String name, int age) {
        this.name = name;
        this.salary = BASE_SALARY;
        this.age = age;
    }

    public Employee (String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee pegawai = new Employee("Adi", 1000000);
    }
}
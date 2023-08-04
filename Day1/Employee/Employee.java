package Day1.Employee;

public class Employee {
    String name;
    int age;
    int salary;
    int yearsOfExp;
    String dept;
    boolean pro;

    public Employee(String name, int age, int salary, int yearsOfExp, String dept, int rating, boolean pro) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.yearsOfExp = yearsOfExp;
        this.dept = dept;
        this.rating = rating;
        this.pro = pro;

    }

    int rating;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", yearsOfExp=" + yearsOfExp +
                ", dept='" + dept + '\'' +
                ", pro=" + pro +
                ", rating=" + rating +
                '}';
    }

    public void add(String string, int i, int j, int k, String string2, int l) {
    }
}

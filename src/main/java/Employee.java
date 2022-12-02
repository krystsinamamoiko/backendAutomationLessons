public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String firstName, String lastName, String position, String phoneNumber, double salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printEmployeeInfo() {
        System.out.println("Employee{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", position='" + position + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", salary=" + salary +
            ", age=" + age +
            '}');
    }
}

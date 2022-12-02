import java.util.ArrayList;
import java.util.List;

public class DemoEmployee {

    public static void main(String[] args) {
        /*Employee empl1 = new Employee("Алла", "Иванова", "HR", "+375(29)589-67-89", 1500, 37);
        Employee empl2 = new Employee("Игорь", "Петров", "QA", "+375(29)589-67-89", 7500, 47);
        Employee empl3 = new Employee("Вася", "Пупкин", "Developer", "+375(29)589-67-89", 9500, 23);
        Employee empl4 = new Employee("Оля", "Сидорова", "Manager", "+375(29)589-67-89", 1000, 25);
        Employee empl5 = new Employee("Глеб", "Козлов", "CEO", "+375(29)589-67-89", 1900, 57);

        if(empl1.getAge() >= 40) {
            empl1.printEmployeeInfo();
        }
        if(empl2.getAge() >= 40) {
            empl2.printEmployeeInfo();
        }
        if(empl3.getAge() >= 40) {
            empl3.printEmployeeInfo();
        }
        if(empl4.getAge() >= 40) {
            empl4.printEmployeeInfo();
        }
        if(empl5.getAge() >= 40) {
            empl5.printEmployeeInfo();
        }*/

        Employee[] employeeArray = {
            new Employee("Алла", "Иванова", "HR", "+375(29)589-67-89", 1600, 37),
            new Employee("Игорь", "Петров", "QA", "+375(29)589-67-89", 7500, 47),
            new Employee("Вася", "Пупкин", "Developer", "+375(29)589-67-89", 9500, 23),
            new Employee("Оля", "Сидорова", "Manager", "+375(29)589-67-89", 1000, 25),
            new Employee("Глеб", "Козлов", "CEO", "+375(29)589-67-89", 1900, 57)
        };

        /*for (int i = 0; i < 5; i++) {
            if(employeeArray[i].getAge() >= 40) {
                employeeArray[i].printEmployeeInfo();
            }
        }

        for (int i = 0; i < employeeArray.length; i++) {
            if(employeeArray[i].getAge() >= 40) {
                employeeArray[i].printEmployeeInfo();
            }
        }*/

        for (Employee employee : employeeArray) {
            if(employee.getAge() >= 40) {
                employee.printEmployeeInfo();
            }
        }

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Алла", "Иванова", "HR", "+375(29)589-67-89", 1600, 37));
        employeeList.add(new Employee("Оля", "Сидорова", "Manager", "+375(29)589-67-89", 1000, 25));
        employeeList.add(new Employee("Глеб", "Козлов", "CEO", "+375(29)589-67-89", 1900, 57));
        employeeList.add(new Employee("Игорь", "Петров", "QA", "+375(29)589-67-89", 7500, 47));

        for (Employee employee : employeeList) {
            if(employee.getAge() >= 40) {
                employee.printEmployeeInfo();
            }
        }
    }
}

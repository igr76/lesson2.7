import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmoloyeeBook {

    private static final Map<String, Employee> employees = new HashMap<>();


    public void addEmployee(Employee employee) {
        employees.put(employee.getName(), employee);
    }

    public void addEmployee(String name, double salary, int department) {
        addEmployee(new Employee(name, department, salary));
    }

    public void changeSalary(Employee employee, int newSalary) {
        String key = employee.getName();
        if (employees.containsKey(key)) {
            employees.get(key).setSalary(newSalary);
        }
    }

    public void changeDepartment(Employee employee, int newDepartment) {
        String key = employee.getName();
        if (employees.containsKey(key)) {
            employees.get(key).setSalary(newDepartment);
        }
    }

    public static void allEmployee() {
        System.out.println(employees.toString());

    }

    public static double salaryAll() {
        double summ = 0;
        for (Employee employee : employees.values()) {
            summ = summ + (employees.get(employee.getName()).getSalary());
        }
        return summ;
    }

    public static void minimum() {
        double min = 100000000;
        for (Employee employee : employees.values()) {
            if (min > (employees.get(employee.getName())).getSalary()) {
                min = (employees.get(employee.getName())).getSalary();
            }
        }
        System.out.println("Минимальная зарплата в месяце : " + min);
    }

    public void maximum() {
        double max = 0;
        for (Employee employee : employees.values()) {
            if (max < (employees.get(employee.getName())).getSalary()) {
                max = (employees.get(employee.getName())).getSalary();
            }
        }
        System.out.println("Максимальная зарплата в месяце : " + max);
    }

    public void averageSalary() {
        int count = employees.values().size();
        if (count != 0) {
            System.out.println("Средняя зарплата в месяце : " + salaryAll() / count);
        }
    }

    public void allStaff() {
        Set<String> setKey = employees.keySet();
        System.out.println("Список всех сотрудников : ");
        for (String key : setKey) {
            System.out.println(key);
        }
    }
    // Повышенная сложность

    public void indexing(int x) {
        double salary1 = 0;
        for (Employee employee : employees.values()) {
            salary1 = (employees.get(employee.getName())).getSalary() * x / 100;
            (employees.get(employee.getName())).setSalary(salary1);
        }
    }

    public void departmentMin(int x) {
        double min = Double.MAX_VALUE;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getDepartment() == x && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        if (min != Double.MAX_VALUE) {
            System.out.println("В отделе : " + x + "Минимальная " +
                    "зарплата в месяце : " + min);
        } else System.out.println("нет данных");
    }

    public static void departmentMax(int x) {
        double max = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getDepartment() == x && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        if (max != 0) {
            System.out.println("В отделе : " + x + "Максимальная " +
                    "зарплата в месяце : " + max);
        } else System.out.println("нет данных");
    }
    public  void departmentSumm(int x) {
        double summ = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (x == employee.getDepartment()) {
                summ = summ + employee.getSalary();

            }
        }  System.out.println("В отделе : " + x +  "Сумма зарплат в месяце : " +  summ);

    }
    public  void departmentAverage(int x) {
        double summ = 0, a = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (x == employee.getDepartment()) {
                summ = summ + employee.getSalary();
                a = a++;

            }
        }  System.out.println("В отделе : " + x +  "Средняя зарплата в месяце : " +  summ/a);

    }
    public  void departmentIndexing(int x,int protsent) {
        double summ = 0 , salary1 =0;
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == x) {
               salary1 = employee.getSalary() + employee.getSalary() * protsent/100;
                employee.setSalary(salary1);
                summ = summ + salary1;

            }
        }  System.out.println("В отделе : " + x +  "Сумма зарплат в месяце : " +  summ);

    }
    public  void departmentAll(int x) {
        System.out.println(" В отделе " + x + " : ");
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (x == employee.getDepartment()) {
                System.out.println("Сотрудник : " + entry.getKey() + " Зарплата : " + employee.getSalary());

            }
        }

    }
    public  void less(int x) {
        System.out.println("Сотрудник с зарплатой меньше, чем "+ x + " :");
        for (Employee employee : employees.values()) {
            if (employee.getSalary() < x) {
                System.out.println(employee.toString());
                    }
        }
    }
    public  void more(int x) {
        System.out.println("Сотрудник с зарплатой больше, чем "+ x + " :");
        for (Employee employee : employees.values()) {
            if (employee.getSalary() < x) {
                System.out.println(employee.toString());
            }
        }
    }
    // присвоение значение id
    public  static void  id(int b) {
        int a = 0;
        for (Employee employee : employees.values()) {
            if (a < employee.getId()) {
                a = employee.getId();
            }

        }
        int id  = a + 1;
    }

}

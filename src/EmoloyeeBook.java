import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmoloyeeBook {

    private static final Map<String, Employee> employees = new HashMap<>();


    public void addEmployee(Employee employee) {
        employees.put(employee.getName(), employee);
    }
    public void addEmployee(String name,  double salary, int department) {
        addEmployee(new  Employee(name,  department,salary));
    }
    public void  changeSalary(Employee employee, int newSalary) {
        String key = employee.getName();
        if (employees.containsKey(key)) {
            employees.get(key).setSalary(newSalary);
        }
    }
   public void  changeDepartment(Employee employee, int newDepartment) {
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
         for (Employee employee:  employees.values()) {
             summ = summ + (employees.get(employee.getName()).getSalary());
         }

       System.out.println("Сумма всех зарплат в месяц : " +  summ);
        return summ;
    }

     public static void minimum() {
        double  min = 100000000;
         for (Employee employee:  employees.values()) {
            if (min >  (employees.get(employee.getName())).getSalary()) {
                min =  (employees.get(employee.getName())).getSalary();
            }
        } System.out.println("Минимальная зарплата в месяце : " +  min);
    }
     public void maximum() {
        double  max = 0;
         for (Employee employee:  employees.values()) {
            if (max < (employees.get(employee.getName())).getSalary()) {
                max =  (employees.get(employee.getName())).getSalary();
            }
        } System.out.println("Максимальная зарплата в месяце : " +  max);
    }
    public  void averageSalary() {
        int count = employees.values().size();
        if (count != 0) {
            System.out.println("Средняя зарплата в месяце : " + salaryAll()/count);
        }
    }
    public  void allStaff() {
        Set<String> setKey = employees.keySet();
        System.out.println("Список всех сотрудников : ");
        for (String key : setKey) {
            System.out.println(key );
        }
    }
    // Повышенная сложность

    public  void indexing(int x) {
        double salary1 =0;
        for (Employee employee:  employees.values()) {
            salary1 =(employees.get(employee.getName())).getSalary()*x/100;
            (employees.get(employee.getName())).setSalary(salary1);
        }
    }
    public  void departmentMin(int x) {
        double min = Double.MAX_VALUE;
        String key = null;
        for (Map.Entry<String , Employee> entry: employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        if (key != null) {
            System.out.println("В отделе : " + x +  "Минимальная " +
                    "зарплата в месяце : " +  employees.get(key));
        } else System.out.println("нет данных");
    }
    public static void departmentMax(int x) {
        double max = Integer.MIN_VALUE;
        String key = null;
        for (Map.Entry<String , Employee> entry: employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        if (key != null) {
            System.out.println("В отделе : " + x +  "Максимальная " +
                    "зарплата в месяце : " +  employees.get(key));
        } else System.out.println("нет данных");
    }/*
    public  void departmentSumm(int x) {
        int summ = 0;
        for (int i = 0; i < department.length; i++) {
            if (x == department[i]) {
                summ = summ + salary[i];

            }
        }  System.out.println("В отделе : " + x +  "Сумма зарплат в месяце : " +  summ);

    }
    public  void departmentAverage(int x) {
        int summ = 0, a = 0;
        for (int i = 0; i < department.length; i++) {
            if (x == department[i]) {
                summ = summ + salary[i];
                a = a++;

            }
        }  System.out.println("В отделе : " + x +  "Средняя зарплата в месяце : " +  summ/a);

    }
    public  void departmentIndexing(int x,int protsent) {
        int summ = 0;
        for (int i = 0; i < department.length; i++) {
            if (x == department[i]) {
               salary[i] = salary[i] + salary[i]* protsent/100;

            }
        }  System.out.println("В отделе : " + x +  "Сумма зарплат в месяце : " +  summ);

    }
    public  void departmentAll(int x) {
        System.out.println(" В отделе " + x + " : ");
        for (int i = 0; i < department.length; i++) {
            if (x == department[i]) {
                System.out.println("Сотрудник : " + name[i] + " Зарплата : " + salary[i]);

            }
        }

    }
    public  void less(int x) {
        for (int i = 0; i < salary.length; i++) {
            if (x > salary[i]) {
                System.out.println("Сотрудник :  " + name[i] + "id : " + id[i] + " зарплата : " + salary[i]);
            }
        }
    }
    public  void more(int x) {
        for (int i = 0; i < salary.length; i++) {
            if (x <= salary[i]) {
                System.out.println("Сотрудник :  " + name[i] + "id : " + id[i] + " зарплата : " + salary[i]);
            }
        }
    }
    // присвоение значение id
    public  static void  id(int b) {
        int a = 0;
        for (int i = 0; i < id.length; i++) {
            if (a < id[i]) {
                a = id[i];
            }
            id[b] = a + 1;

        }
    }
    // Добавить нового сотрудника
    public  static void newStaff(String name, int department1, int salary1) {
        for (int i = 0; i < department.length; i++) {
            if (department[i] == 0) {
                Employee z = new Employee(name,department1,salary1);
                id(i);
            }
        }

    }
    //удалить сотрудника
    public static void deleteStaff(int number) {
        for (int i = 0; i < department.length; i++) {
            if (id[i] == number) {
                number = i;
               Employee z = new Employee("",0,0);

            }
        }

    }*/


}

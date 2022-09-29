public class EmoloyeeBook {
    //private static Employee[] employee = new Employee[10];
    /*
    public static void allEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
     public static int salaryAll() {
        int summ = 0;
        for (int i = 0; i < employee.length; i++) {
            summ = summ + Employee.getSalary();
        }
       System.out.println("Сумма всех зарплат в месяц : " +  summ);
        return summ;
    }

     public static void minimum() {
        int  min = 100000000;
        for (int i = 0; i < employee.length; i++) {
            if (min > employee[i].getSalary()) {
                min = employee[i];
            }
        } System.out.println("Минимальная зарплата в месяце : " +  min);
    }
     public void maximum() {
        Employee  max = null;
        for (int i = 0; i < employee.length; i++) {
            if (max < employee[i].getSalary()) {
                max = employee[i];
            }
        } System.out.println("Максимальная зарплата в месяце : " +  max);
    }
    public  void averageSalary() {
        int average = 0;
        average = salaryAll() / Employee.salary.length;
        System.out.println("Средняя зарплата в месяце : " +  average);
    }
    public  void allStaff() {
        System.out.println("Список всех сотрудников : ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println((i+1) +" :  " + employee[i].getNames() );
        }
    }
    // Повышенная сложность

    public  void indexing(int x) {
        for (int i = 0; i < Employee.salary.length; i++) {
            salary[i] = salary[i] + salary[i]*x/100;
        }
    }
    public  void departmentMin(int x) {
        double min =double.MAX_VALUE;
        for (int i = 0; i < department.length; i++) {
            if (x == department[i]) {
                if (min > salary[i]) {
                    min = salary[i];
                }
            }
        }  System.out.println("В отделе : " + x +  "Минимальная зарплата в месяце : " +  min);
    }
    public static void departmentMax(int x) {
        double max = integer.MIN_VALUE;
        for (int i = 0; i < department.length; i++) {
            if (x == department[i]) {
                if (max < salary[i]) {
                    max = salary[i];
                }
            }
        }  System.out.println("В отделе : " + x +  "Максмальная зарплата в месяце : " +  max);
    }
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

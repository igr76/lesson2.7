public class Main {


    public static void main(String[] args) {
        EmoloyeeBook emoloyeeBook = new EmoloyeeBook();
        Employee ira = new Employee("iRA", 2, 23456);
        Employee natali = new Employee("Наталья", 4, 47865);
        emoloyeeBook.changeSalary(ira,34567);
        emoloyeeBook.allStaff();
        System.out.println("Сумма всех зарплат в месяц : " + emoloyeeBook.salaryAll());


    }
}
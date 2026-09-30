public class Main {
    public static void main(String[] args) {

        System.out.println("--- Часть Г: Список сотрудников ---");

        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Иванов И.И.", "Разработчик", 90000);
        staff[1] = new Employee("Петров П.П.", "Тестировщик", 70000);
        staff[2] = new Manager("Сидоров С.С.", "Менеджер", 120000, 5);
        staff[3] = new Manager("Козлов К.К.", "Старший менеджер", 150000, 10);

        for (Employee emp : staff) {
            System.out.println(emp.toString());
            System.out.println("   Бонус: " + emp.calculateBonus());
        }

        System.out.println("\n--- Часть Д: Подсчет менеджеров ---");
        int managerCount = 0;
        for (Employee emp : staff) {
            if (emp instanceof Manager) {
                managerCount++;
            }
        }
        System.out.println("Всего менеджеров: " + managerCount);

        System.out.println("\n--- Часть Е: Общий бюджет на премии ---");
        double totalBudget = totalBonusBudget(staff);
        System.out.println("Суммарная премия всех сотрудников: " + totalBudget);

        System.out.println("\n--- Часть Б: Всего создано сотрудников ---");
        System.out.println("Счетчик сотрудников: " + Employee.getEmployeeCount());


    }

    public static double totalBonusBudget(Employee[] staff) {
        double total = 0;
        for (Employee emp : staff) {
            total += emp.calculateBonus();
        }
        return total;
    }
}
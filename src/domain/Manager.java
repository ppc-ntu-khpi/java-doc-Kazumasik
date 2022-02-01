package domain;

/**
 * Класс для опису менеджерів
 * @author Maxim Kumpan
 */
public class Manager extends Employee {

    /**
     * Найфункціональніший конструктор класу
     * @param employees робітники
     * @param name імя
     * @param jobTitle посада
     * @param level розряд
     * @param dept відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Форматує інформацію про робітників
     * @return форматована інформація про робітників
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор для задання робітників менеджера
     * @param employees робітники
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * Конструктор класу
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }
    /**
     * Масив який містить робітників менеджера
     */
    private Employee[] employees;

    /**
     * Метод який повертає  робітників менеджера
     * @return сформатовані робітники менеджера
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Метод для встановлення роібтників менеджера
     * @param employees робітники
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Метод який повертає масив робітників менеджера
     * @return масив робітників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}

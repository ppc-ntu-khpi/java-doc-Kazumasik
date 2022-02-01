package domain;

/**
 * Базовий клас який описує робітників
 * @author Maxim Kumpan
 */
public class Employee {

    /**
     * Форматує інформацію про робітників
     * @return форматована інформація про робітників
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Імя робітника
     */
    private String name;
    /**
     * Посада
     */
    private String jobTitle;
    /**
     * Ідентифікатор
     */
    private int ID;
    /**
     * Розряд
     */
    private int level;
    /**
     * Відділ
     */
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Найфункціональніший конструктор класу
     * @param name Імя співробітника
     * @param jobTitle Посада
     * @param level Розряд
     * @param dept Відділ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Стандартний конструктор класу
     * @deprecated
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Метод встановлення посади
     * @param job Посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Метод який повертає посаду робітника
     * @return посаду робітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Метод який повертає імя робітника
     * @return імя робітника
     */
    public String getName() {
        return name;
    }
    /**
     * Метод для встановлення розряду робітника
     * @param level розряд робітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * Метод який повертає розряд робітника
     * @return розряд робітника
     */
    public int getLevel() {
        return level;
    }
    /**
     * Метод який повертає відділ робітника
     * @return відділ робітника
     */
    public String getDept() {
        return dept;
    }

    /**
     * Метод для встановлення відділу робітника
     * @param dept відділ робітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Метод для встановлення імя робітника
     * @param name імя робітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}

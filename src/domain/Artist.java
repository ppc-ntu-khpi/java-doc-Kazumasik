package domain;

/**
 * Класс для опису художника
 * @author Maxim Kumpan
 */
public class Artist extends Employee {

    /**
     * Найфункціональніший конструктор класу
     * @param skiils навички художника
     * @param name імя художника
     * @param jobTitle посада художника
     * @param level розряд художника
     * @param dept відділ художника
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор для запису навичків художника
     * @param skiils навичка художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор класу
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Форматує навички художника
     * @return форматована інформації про навички художника
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /**
     * Масив який містить навички художника
     */
    private String[] skiils;

    /**
     * Метод який повертає навички художника
     * @return сформатовані навички художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Метод для встановлення навичок художника
     * @param skills навичка художника
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Метод який повертає навички художника
     * @return масив навичок художника
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}

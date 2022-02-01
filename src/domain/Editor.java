package domain;

/**
 * Класс для опису редакторів
 * @author Maxim Kumpan
 */
public class Editor extends Artist {

    /**
     * Найфункціональніший конструктор класу
     * @param electronicEditing true - якщо редактор надає перевагу роботі з паперами
     * @param skiils навички редактора
     * @param name імя редактор
     * @param jobTitle посада редактора
     * @param level розряд редактора
     * @param dept віддал редактора
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для визначення чи надає перевагу роботі з паперами редактор
     * @param electronicEditing true - якщо редактор надає перевагу роботі з паперами
     * @param skiils навички
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор для визначення чи надає перевагу роботі з паперами редактор
     * @param electronicEditing true - якщо редактор надає перевагу роботі з паперами
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор для визначення чи надає перевагу роботі з паперами редактор
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Форматує навички водобання редактора
     * @return форматована інформація про вподобання редактора
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)

            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /**
     *true - якщо редактор надає перевагу роботі з паперами
     */
    private boolean electronicEditing;

    /**
     *Метод для отримання вподобань редактора
     * @return true - якщо редактор надає перевагу роботі з паперами
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     *Метод для встановлення вподобань редактора
     * @return true - якщо редактор надає перевагу роботі з паперами
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}

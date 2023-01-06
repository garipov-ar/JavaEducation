package lab7.task4;

public class superClass {
    char ch;

    superClass(char ch) {
        setCh(ch);
    }

    public superClass() {
    }

    void setCh(char ch) {
        this.ch = ch;
    }

    char getCh() {
        return ch;
    }

    @Override
    public String toString() {
        String NameField;
        NameField =
                "Класс: " + this.getClass().getSimpleName()
                        + "\n" + "Символ: " + this.getCh();
        return NameField;
    }
}

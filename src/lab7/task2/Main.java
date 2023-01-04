package lab7.task2;

public class Main {
    private String str;

    Main() {
        setString();
    }

    Main(String str) {
        setString(str);
    }

    public void setString() {
        this.str = "Нет данных";
    }

    public void setString(String str) {
        this.str = str;
    }

    public String getString() {
        return str;
    }

    public int strLength() {
        return str.length();
    }

    public String toString() {
        String superClassNameAndFieldValue = "superClassTest { " + "str1 = \"" + getString() + '\"' + " string.length = " + "\"" + strLength() + "\" }\n";
        System.out.println(superClassNameAndFieldValue);
        return superClassNameAndFieldValue;
    }
}

package lab7.task2;

public class task2Sub extends Main {
    private int num;
    private String str;

    task2Sub() {
        setString();
    }
    task2Sub(String str) {
        setString(str);
    }
    task2Sub(int num) {
        setInt(num);
    }
    task2Sub(String str, int num) {
        setString(str);
        setInt(num);
    }

    public void setInt(int num) {
        this.num = num;
    }
    public int getInt() {
        return num;
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
    public void Show() {
        System.out.println(num);
        System.out.println(str);
    }

    public String toString() {
        String ClassNameAndFieldValue = "task2Sub { " + "str2 = \"" + getString() + '\"' + " string.length = " + "\"" + strLength() + "\"}"
                + "\n \n task2Sub { " + "int1 = \"" + getInt() + "\"}";
        System.out.println(ClassNameAndFieldValue);
        return ClassNameAndFieldValue;
    }
}

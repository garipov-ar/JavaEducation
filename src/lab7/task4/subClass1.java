package lab7.task4;

public class subClass1 extends superClass {
    public String str;

    public void setChar1Str1(char ch, String str) {
        super.ch = ch;
        this.str = str;
    }

    subClass1(char ch, String str) {
        super(ch);
        this.setChar1Str1(ch, str);
    }

    subClass1(subClass1 copy) {
        super(copy.ch);
        this.setChar1Str1(copy.ch, copy.str);
    }

    String getStr() {
        return str;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "\n" +  "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                        "Строка = " + this.getStr();
        return super.toString() + ClassNameAndFieldValue;
    }
}

package lab7.task3;

public class SubClass1  extends superClass {
    public char ch;
    SubClass1 (char ch, int num) {
        setValue(ch,num);
    }

    SubClass1() {
    }

    void setValue (char ch, int num) {
        this.ch = ch;
        super.setValue(num);
    }
    char getCh () {
        return ch;
    }

    public String toString() {
        String Field =
                "\n" + this.getCh();
        return super.toString()+Field;
    }
}

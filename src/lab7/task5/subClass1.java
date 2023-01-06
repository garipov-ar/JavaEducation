package lab7.task5;

public class subClass1 extends superClass {
    final int num;
    public subClass1(String str, int num) {
        super(str);
        this.num = num;
    }

    int getInt(){
        return num;
    }

    public String toString() {
        String Field;
        Field = this.getClass().getSimpleName() +
                "\n" + getStr() + "\n" + getInt();
        System.out.println(Field);
        return super.toString() + Field;
    }
}

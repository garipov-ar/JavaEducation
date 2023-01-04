package lab7.task4;

public class subClass2 extends subClass1 {

    int num;

    public void setCharStrInt (char ch, String str, int num){
        super.ch = ch;
        super.str = str;
        this.num = num;
    }
    subClass2 (char ch, String str, int num){
        super(ch,str);
        this.setCharStrInt(super.ch,super.str, num);
    }

    public int getInt() {
        return num;
    }

    public String toString() {
        String ThirdFieldValue =
                "\n" +
                        "Число = " + this.getInt();
        return super.toString()+ThirdFieldValue;
    }
}

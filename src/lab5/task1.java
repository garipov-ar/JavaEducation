package lab5;

public class task1 {

    private char ch1;
    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public int getCodeSymbol(){
        return ch1;
    }

    public void showCodeAndValue() {
        System.out.println(ch1);
        System.out.println((int) ch1);
    }
}

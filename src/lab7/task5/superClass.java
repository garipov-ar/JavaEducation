package lab7.task5;

public class superClass {
    final String str;

    public superClass(String str){
        this.str = str;
    }

    String getStr (){
        return str;
    }

    public String toString() {
        String Field;
        Field =  this.getClass().getSimpleName() + "\n" + this.getStr();
        System.out.println(Field);
        return super.toString() + Field;
    }
}

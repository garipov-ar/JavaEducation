package lab7.task3;

public class superClass {
        int num;

        superClass(int num) {
            setValue(num);
        }

        public superClass() {
        }

        void setValue(int num) {
            this.num = num;
        }

        int getInt() {
            return num;
        }

        @Override
        public String toString() {
            String NameFieldValue;
            NameFieldValue =
                    "Класс: " + this.getClass().getSimpleName()
                            + "\n" + this.getInt();
            return NameFieldValue;
        }
}

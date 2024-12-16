public class Jvm {
        
    int age;
    public void setAge(int age) {
                 if (age < 0) {
                throw new IllegalArgumentException
                    ("年齢正の数を記入してください");
            }
            this.age = age;
        }
}
 
class Yobidashi {

        public static void main(String[] args) {
            
            Jvm jvm = new Jvm();
            jvm.setAge(-120);

        }
    }

import java.util.Scanner;
public class InnerClass {
    // simple nested class in java
    class Outer {
        public void Show(){
            System.out.println("Hello I'm Jonh Wick");
        }
    }

    public static void main(String[] args) {
        InnerClass in = new InnerClass();
        InnerClass.Outer outer = in.new Outer();
        outer.Show();
    }
}


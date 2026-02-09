import java.lang.reflect.Method;

public class MethodOverloading {
    public int add (int a , int b){
        return a+b;

    }
    public int add(int a , int b, int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a+b;
    }
    public static void main(String[]args){
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.add(45, 52));
        System.out.println(m.add(45, 52, 54));
        System.out.println(m.add(48, 72));
    }
}



class calculator {
    public int add(){
        int x = 10; // or assign any value you want
        System.out.println(x);
        return x;
    }
}
public class Main {
    public static void main(String[] args) {
         calculator calc = new calculator();
         int result = calc.add();
         System.out.println(result);

        
        System.out.println("");
    }
}

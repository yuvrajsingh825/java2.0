public class constructor {
    int data ;
    public constructor(){
        data = 105;
    }
    public static void main(String[] args) {
        constructor c = new constructor();
        System.out.println(c.data);
    }
}
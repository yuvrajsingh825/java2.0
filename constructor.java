public class constructor {
    int x ;
    public constructor(int x){
        this.x = x;
    }
    public static void main(String[] args) {
        constructor c = new constructor(100);
        System.out.println(c.x);
    }
}
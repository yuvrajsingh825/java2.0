class Student {
    // private variable
    private String name;

    // getter (read the value)
    public String getName() {
        return name;
    }

    // setter (set or update the value)
    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Yuvraj");            // using setter
        System.out.println(s.getName()); // using getter
    }
}

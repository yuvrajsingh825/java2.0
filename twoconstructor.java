public class twoconstructor {

    int modelyear;
    String modelname;

    public twoconstructor() {
        modelyear = 0;
        modelname = "Unknown";
    }

    public twoconstructor(String modelname) {
        this(2020, modelname);   // Calls 2 parameter constructor
    }

    public twoconstructor(int modelyear, String modelname) {
        this.modelyear = modelyear;
        this.modelname = modelname;
    }

    public void display() {
        System.out.println("Model year: " + modelyear + " Model name: " + modelname);
    }

    public static void main(String[] args) {

        twoconstructor c2 = new twoconstructor("Alto");
        twoconstructor c3 = new twoconstructor(2025, "Nexon");

        c2.display();
        c3.display();
    }
}
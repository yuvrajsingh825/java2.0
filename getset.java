public class getset {

    private String name="YUVRAJ";
    public String getname(){
        return name;
    }
        public void setname(String name){
            this.name = name;

        }

    public static void main(String[] args) {
            getset obj = new getset();
            System.out.println(obj.getname());

    }
}
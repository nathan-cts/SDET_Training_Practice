public class Dev {
    public Dev(){
        System.out.println("Dev object created");
    }

//    Laptop laptop;
//    CONSTRUCTOR INJECTION
//      Laptop laptop;
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//        System.out.println("Dev object created and Laptop object referenced");
//    }

//    SETTER INJECTION
//    Laptop laptop;
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

//    Autowiring, when given interface, using autowire="byName", autowire="byType", primary="true"
    Computer com;
    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){

        com.hello();
        System.out.println("Dev class function working");
    }
}

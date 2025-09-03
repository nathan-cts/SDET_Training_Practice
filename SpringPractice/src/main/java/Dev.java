public class Dev {
    public Dev(){
        System.out.println("Dev object created");
    }

    Laptop laptop;

//    CONSTRUCTOR INJECTION
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//        System.out.println("Dev object created and Laptop object referenced");
//    }

//    SETTER INJECTION
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Dev class function working");
    }
}

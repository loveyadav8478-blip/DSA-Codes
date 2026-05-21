package Methods;

public class PassingArgument {
    public static void Details(String name,int clas, int age, String grade){
        System.out.print("Hi "+name+"Your Class is CSE- "+clas+" and age is "+age+" years"+" and grade is "+grade);
    }
    public static void main(String[] args) {
        Details("Love Yadav.", 19, 19, "A Plus");
    }
}

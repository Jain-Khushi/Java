package Assignment;
abstract class Marks {
    double sub1,sub2,sub3,sub4;
    Marks(double x1,double x2,double x3){
        sub1 = x1;
        sub2 = x2;
        sub3 = x3;
    }
    Marks(double x1,double x2,double x3,double x4){
        sub1 = x1;
        sub2 = x2;
        sub3 = x3;
        sub4 = x4;
    }
    abstract double getPercentage();
}

class A extends Marks{
    A(double x1,double x2,double x3){
        super(x1,x2,x3);
        
    }
    double getPercentage(){
        return ((sub1 + sub2 + sub3)/300) * 100;
    }
    
}

class B extends Marks{
    B(double x1,double x2,double x3,double x4){
        super(x1,x2,x3,x4);
        
    }
    double getPercentage(){
        return ((sub1 + sub2 + sub3 + sub4)/400) * 100;
    }
}
public class Abstract{
    public static void main(String args[]){
        A a = new A(70,80,90);
        B b = new B(80,90,90,100);

        System.out.println("Percentage of marks of student A : " + a.getPercentage() + " % ");
        System.out.println("Percentage of marks of student B : " + b.getPercentage() + " % ");
    }
}

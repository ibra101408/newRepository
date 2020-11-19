class OutrerClass{
    int a;
    public void show(){

    }
    class Inner{
        public void display(){
            System.out.println("in display");
        }
    }
    }
    public class InnerDemo{

    public static void main (String[] args){
        OutrerClass obj = new OutrerClass();
        obj.show();

        OutrerClass.Inner obj1 = obj.new Inner();
        obj1.display();

    }
    }
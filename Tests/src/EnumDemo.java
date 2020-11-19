import java.lang.*;

// enum showing Mobile prices
enum Mobile {
    Samsung(400), Nokia(250),Motorola(325);

    int price;
    Mobile(int p) {
        price = p;
    }
    int showPrice() {
        return price;
    }
}

public class EnumDemo {

    public static void main(String args[]) {

        System.out.println("CellPhone List:");
        for(Mobile m : Mobile.values()) {
            System.out.println(m + " costs " + m.showPrice() + " dollars");
        }

        Mobile ret = Mobile.Samsung;
        System.out.println("The ordinal is = " + ret.ordinal());
        System.out.println("MobileName = " + ret.name());
    }
}
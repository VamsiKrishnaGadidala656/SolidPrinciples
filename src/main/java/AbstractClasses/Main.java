package AbstractClasses;

public class Main {
    public static void main(String[] args) {

        Product p = new Macbook();
        p.termsAndConditions();

        Product p1 = new LenovoLaptop();
        p1.termsAndConditions();
    }
}

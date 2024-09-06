package AbstractClasses;

public class Macbook extends Product{

    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void termsAndConditions() {
        System.out.println("terms and conditions of macbook");
    }
}

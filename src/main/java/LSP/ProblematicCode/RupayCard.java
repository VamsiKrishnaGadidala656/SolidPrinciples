package LSP.ProblematicCode;

public class RupayCard extends CreditCard{

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of RupayCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of RupayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of RupayCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments impl of RupayCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("Upi Payments impl of RupayCard");
    }

    @Override
    public void internationalPayment() {
        throw new UnsupportedOperationException("International Payments impl of RupayCard");
    }

}

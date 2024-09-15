package LSP.BetterCode;

public class RupayCard extends CreditCard implements UPICompatibleCreditCard {

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
    public void UPIPayment() {
        System.out.println("UPI Payments impl of RupayCard");
    }
}

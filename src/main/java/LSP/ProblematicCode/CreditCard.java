package LSP.ProblematicCode;

public abstract class CreditCard {

    private String ccNumber;
    private String ownerName;
    private int cvv;

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public abstract void tapAndPay();
    public abstract void onlineTransfer();
    public abstract void swipeAndPay();
    public abstract void mandatePayments();

    public void displayCreditCardDetails() {
        System.out.println("ccNumber: " + ccNumber + " with ownerName: " + ownerName);
    }
}

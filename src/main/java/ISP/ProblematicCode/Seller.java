package ISP.ProblematicCode;

public class Seller implements IUser{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    //seller can't approve...still forced to implement
    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public boolean canApproveProduct() {
        return false;
    }
}

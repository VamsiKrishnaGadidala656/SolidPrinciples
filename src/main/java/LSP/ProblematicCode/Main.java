package LSP.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<CreditCard> cards = new ArrayList<>();

        for (CreditCard card : cards) {

            if (card instanceof RupayCard) {
                card.upiPayment();
            }

            if (card instanceof VisaCard) {
                card.internationalPayment();
            }
        }

        /*
            here we are saying visa is a credit card, mastercard is a credit card , Rupay card is credit card but

            Rupay card doesn't support international payment...so we are using instanceOf
            Visa and mastercard doesn't support UPI payment.... so we are using instanceOf

            so usage of instanceOf indicates this is problematic code

            Basically this code violates LSP(Liskov Substitution Principle)
            LSP :: Objects of a subclass should be substitutable for objects of the parent class without altering the correctness, behavior, or functionality of the program

            but here we can't place rupay card in place of creditcard becuase rupay card throw error when we call international payment.
            similary we can't place visa or mastercard in place of credit card because these cards throw error when we call UPI payment.

            LSP indirectly suggest that
            -> Inheritance might not be the best way always for reusability.
            -> Do inheritance if and only if there is a strict is-A relationship
            -> No change should be required in the codebase to accommodate a specific child class or you can say that
               child classes should not need any special treatment.
            -> child class should do exactly what the parent class expects.
         */
    }
}

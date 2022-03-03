
import java.util.ArrayList;

/**
 * @version 1.8.0_171
 * @author rahmansuhail
 **/
public class PayingCustomer extends Customer {

    private String paymentmethod; //Declare Variable
    private String paymentCardNo;  //Declare Variable
    public double totalCost;       //Declare Variable
    ArrayList<Customer> cSuppl;    //Declare Variable
    ArrayList<AssociateCustomer> aCust;  //Declare Variable

    /**
     * PayingCustomer Customer
     * <p>
     * This class is used to represent PayingCustomer with paymentmethod,
     * paymentCardNo,aCust,totalCost.
     * </p>
     * Precondition: PayingCustomer object of paymentmethod,paymentCardNo,
     * aCust,totalCost Postcondition: A PayingCustomer Object is Created with
     * the paymentmethod,paymentCardNo, aCust,totalCost.
     *
     * @param super() can be used to invoke immediate parent class constructor
     * @param paymentmethod
     * @param paymentCardNo
     * @param aCust
     * @param totalCost
     */
    public PayingCustomer() {
        super();
        this.paymentmethod = "null";
        this.paymentCardNo = "";
        this.aCust = null;
        this.totalCost = 0;

    }

    /**
     *
     * @param paymentmethod
     */
    public void setPaymentMethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    /**
     * <p>
     * This method is used get the PaymentMethod with PayingCustomer Object
     * </p>
     * Precondition: Paymentmethod is initialised at the Constructor <br>
     * PostCondition: The Paymentmethod of the PayingCustomer Object is returned
     *
     * @return paymentmethod Return the payingCustomer object.
     */
    public String getPaymentMethod() {
        return paymentmethod;
    }

    /**
     * <p>
     * This method is used set the PayingCustomer with PaymentCardNo object
     * </p>
     * PreCondition :paymentCardNo is initialised at the Constructor<br>
     * PostCondition: The pCardNo of the PayingCustomer object is Created and
     * declare
     *
     * @param pCardNo
     */
    public void setPaymentCardNo(String pCardNo) {
        this.paymentCardNo = pCardNo;
    }

    /**
     * <p>
     * This method is used get the PayingCustomer of PayingCardNo Object
     * </p>
     * Precondition: PaymentCardNo is initialised at the Constructor <br>
     * PostCondition: The PaymentCardNo of the PayingCustomer Object is returned
     *
     * @return paymentCardNo Return the payingCustomer object.
     */
    public String getPaymentCardNo() {
        return paymentCardNo;
    }

    /**
     * <p>
     * This method is used set the PayingCustomer with setAssociateCus cost of
     * supplement object
     * </p>
     * PreCondition : AssociateCustomer calculate the cost of the supplement and
     * magazine cost<br>
     * PostCondition: Get AssociateCustomer supplcost and magazinecost
     *
     * @param AssociateCus
     */
    public void setAssociateCus(ArrayList<AssociateCustomer> AssociateCus) {
        double totalAsupplCost = 0;

        aCust = AssociateCus;
        if (aCust == null) {

        } else {
            for (int i = 0; i < AssociateCus.size(); i++) {
                totalAsupplCost = totalAsupplCost + AssociateCus.get(i).getSupplCost() + AssociateCus.get(i).magazineCost;
                //Calculate the total Associate Customer Supplement Cost and magazinecost
            }

        }
        setTotalAcost(totalAsupplCost); //calling method
    }

    /**
     * <p>
     * This method is used get the PayingCustomer of getAssoCust Object
     * </p>
     * Precondition: aCust is initialised at the Constructor <br>
     * PostCondition: The aCust of the PayingCustomer Object is returned
     *
     * @return aCust Return the payingCustomer object.
     */
    public ArrayList getAssoCust() {
        return aCust;
    }

    /**
     * <p>
     * This method is used set the PayingCustomer with setTotalAcost object
     * </p>
     *
     * @param calculate the totalCost
     * magazineCost+supplCost+newAssociateCost<br>
     * @param AssociateCus
     */
    public void setTotalAcost(double nAssoCost) {
        totalCost = magazineCost + supplCost + nAssoCost;  //total supplements customer and Associate Customer Cost.

    }

    /**
     *
     * @return totalCost
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * @param print record
     * @return cName, cEmailaddress, suppl,aCust, totalCost
     */
    public String toString() {
        return "Name :  " + cName + "\n Email " + cEmailaddress + "\n Customer Supplements " + suppl
                + "\n Associate Customer " + aCust + "\nTotal cost " + totalCost;
    }
}

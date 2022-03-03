
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @version 1.8.0_171
 * @author rahmansuhail
 */
public class AssociateCustomer extends Customer {

    public String Associatename;  //Declare Variable 
    public ArrayList<Supplement> Suppllist;  //Declare Variable

    /**
     * Constructor Customer
     * <p>
     * This class is used to represent AssociateCustomer with assName,super
     * constructor
     * </p>
     * Precondition: AssociateCustomer object of assName
     *
     * @param super() can be used to invoke immediate parent class constructor
     * @param Associatename
     */
    
    public AssociateCustomer() {
        super();  //super can be used to invoke immediate parent class constructor
        this.Associatename = "assName";
    }

    /**
     * <p>
     * This method is used set the AssociateCustomer name of object
     * </p>
     * PreCondition :Associatename is initialised at the Constructor<br>
     * PostCondition: The Associatename of the Customer object is Created
     * anddeclare
     *
     * @param customerName
     */
    public void setAssociateName(String Associatename) {
        this.Associatename = Associatename;
    }

    /**
     * This method is used get the AssociateName of AssociateCustomer Object
     * <p>
     * Precondition: Associatename is initialised at the Constructor <br>
     * PostCondition: The Associatename of the AssociateCustomer Object is
     * returned
     *
     * @return cName Return the Customer object cEmailaddress
     */
    public String getAssociateName() {
        return Associatename;
    }

    /**
     * This method is used get the Suppllist of AssociateCustomer Object
     * <p>
     * Precondition: Suppllist is initialised at the Constructor <br>
     * PostCondition: The Supplist of the AssociateCustomer Object is returned
     *
     * @return Suppllist Return the AssociateCustomer Object
     */
    
    public ArrayList getSupplement() {
        return Suppllist;
    }

    /**
     *
     * @return Associatename, suppl
     */
    
    public String toString() {
        return "Associate Customer:" + Associatename + "\nAssociate Supplements " + suppl;
    }
}

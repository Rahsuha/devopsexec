import java.util.ArrayList;

/**
 * @author rahmansuhail
 * @version 1.8.0_171
 **/

public class Customer {

    public String cName; //Declare and initiliaze the variable
    public String cEmailaddress; //Declare and initiliaze the variable
    public double magazineCost; //Declare and initiliaze the variable
    public double supplCost; //Declare and initiliaze the variable
    public ArrayList<Supplement> suppl = new ArrayList<Supplement>();

    /**
     * Default Constructor
     * @param name
     * @param email
     * @param magazineCost
     * @param supplCost
     * @param suppl
     */
    
    public Customer() {
        cName = "name";
        cEmailaddress = "email";
        magazineCost = 5.60;
        supplCost = 0.0;
        suppl = new ArrayList<Supplement>();
    }

    /**
     * Constructor Customer
     * <p>
     * This class is used to represent Customer with
     * cName,cEmailaddress,supplCost,magazineCost,ArrayList<Supplement> suppl.
     * </p>
     * Precondition: Customer object of
     * cName,cEmailaddress,magazineCost,supplCost,sup Postcondition: A Customer
     * Object is Created with the
     * cName,cEmailaddress,supplCost,magazineCost,SupplCost,ArrayList<Supplement>
     * suppl.
     *
     * @param customerName
     * @param customerEmail
     * @param magazineC
     * @param supplementC
     * @param newsuppl
     */
    public void Customer(String customerName, String customerEmail,
            double magazineC, double supplementC, ArrayList<Supplement> newsuppl) {
        this.cName = customerName;
        this.cEmailaddress = customerEmail;
        this.magazineCost = magazineC;
        this.supplCost = supplementC;
        this.suppl = newsuppl;
    }

    /**
     * This method is used get the Name of Customer Object
     * <p>
     * Precondition: cName is initialised at the Constructor <br>
     * PostCondition: The cName of the Customer Object is returned
     *
     * @return cName Return the Customer object cname
     */
    public String getName() {
        return cName;
    }

    /**
     * <p>
     * This method is used set the Customer name of object
     * </p>
     * PreCondition :cName is initialised at the Constructor<br>
     * PostCondition: The customerName of the Customer object is Created and
     * declare
     *
     * @param customerName
     */
    public void setName(String customerName) {
        this.cName = customerName;
    }

    /**
     * This method is used get the Email of Customer Object
     * <p>
     * Precondition: cEmailaddress is initialised at the Constructor <br>
     * PostCondition: The cEmailaddress of the Customer Object is returned
     *
     * @return cName Return the Customer object cEmailaddress
     */
    public String getEmail() {
        return cEmailaddress;
    }

    /**
     * <p>
     * This method is used set the Customer email of object
     * </p>
     * PreCondition :cEmailaddress is initialised at the Constructor<br>
     * PostCondition: The customerEmail of the Customer object is Created and
     * declare
     *
     * @param customerEmail
     */
    public void setEmail(String customerEmail) {
        this.cEmailaddress = customerEmail;
    }

    /**
     * <p>
     * This method is used set the Customer supplelist of object
     * </p>
     * PreCondition: supplList foreach() method of ArrayList used to perform
     * each operation for each element in arraylist
     * PostCondition: Calling a method setSupplCost() to set the supplement cost
     *
     * @param supplList
     */
    public void Setsupplelist(ArrayList<Supplement> supplList) {
        supplList.forEach(value -> this.suppl.add(value));  //foreach method add each element in arraylist
        setSupplCost(); //calling method
    }

    /**
     * This method is used get the supplist of Customer Object
     * <p>
     * Precondition: suppl is initialised at the Constructor <br>
     * PostCondition: The suppl of the Supplement Object is returned
     *
     * @return cName Return the Customer object cEmailaddress
     */
    public ArrayList<Supplement> getSupplist() {
        return suppl;  //return suppl
    }

    /**
     * <p>
     * This method is used set the Customer Supplement Cost of object
     * </p>
     * PreCondition: The supplement get each weekly supplement cost
     * PostCondition: calculate the supplCost
     *
     * @param suppl
     */
    public void setSupplCost() {
        if (suppl == null) {
            supplCost = 0.0;  
        } else {
            for (int i = 0; i < suppl.size(); i++) {
                supplCost = supplCost + suppl.get(i).getWeeklyCost();// get weeklycost of each supplement and sum the supplCost
            }
        }
    }

    /**
     * <p>
     * This method is used get the getSupplCost of Customer Object
     * </p>
     * Precondition: supplCost is initialised at the Constructor <br>
     * PostCondition: The supplCost of the Supplement Object is returned
     *
     * @return supplCost Return the Supplement object.
     */
    public double getSupplCost() {
        return supplCost;
    }

    /**
     *
     * @return cName,Emailaddress,suppl
     */
    public String toString() {
        return "\nName: " + cName + "\nEmail" + cEmailaddress + "\nCustomer Supplements" + suppl;
    }
}

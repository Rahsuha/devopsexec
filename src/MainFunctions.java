
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 1.8.0_171
 * @author rahmansuhail
 **/
public class MainFunctions {

    public static Scanner kb = new Scanner(System.in);

    /**
     * <p>
     * This method is to print email Subscripted Customer with their magazine,
     * Supplements.
     * </p>
     *
     * @param Create a object for ArrayList PayingCustomer,AssociateCustomer
     * @param payCustomer
     * @param associateCust
     * @return payCustomer
     */
    
    public static ArrayList printEmail(ArrayList<PayingCustomer> payingCustomer,
            ArrayList<AssociateCustomer> associateCust) {
        if (!payingCustomer.isEmpty()) {
            for (int i = 0; i < payingCustomer.size(); i++) {  //for loop get each of payCustomer from ArrayList
                System.out.println("Recepient Email:" + payingCustomer.get(i).getEmail());  //Print the Email for payCustomer
                System.out.println("Dear Customer " + payingCustomer.get(i).getName() + ", your Weekly Choosen magazine and supplements list available now");
                payingCustomer.get(i).getSupplist().forEach(value -> System.out.println("" + value));  //foreach method add each element in arraylist
                System.out.println("-----------------------------------------------------------");
                System.out.println("-----------------------------------------------------------");
            }
        }
        return payingCustomer;
    }

    /**
     * <p>
     * This method is to print monthly email for customers paying
     * details,supplements and breakdown cost of supplements and magazine.
     * Calculate the monthly paying for the magazine and supplement
     * </p>
     *
     * @param payCustomer
     * @param AssociateCust
     * @return
     */
    public static ArrayList printmonthlyemailCustomer(ArrayList<PayingCustomer> payingCustomer, ArrayList<AssociateCustomer> AssociateCust) {
        if (!payingCustomer.isEmpty()) {
            for (int i = 0; i < payingCustomer.size(); i++) {
                System.out.println("Monthly bill");
                System.out.println("Receipent Email :" + payingCustomer.get(i).getEmail());  //print the customer email
                System.out.println("Dear PayeeCustomer:" + payingCustomer.get(i).getName()); //print the customer name
                System.out.println("Payment Card No : " + payingCustomer.get(i).getPaymentCardNo()); //print payment cardNo
                System.out.println("Payment Method : " + payingCustomer.get(i).getPaymentMethod());  //print payment Method
                System.out.println("-------Breakdown list supplementary -------");
                payingCustomer.get(i).getSupplist().forEach(value -> System.out.println("Choosen Supplement: " + value));
                //for each to get each element from the arraylist
                payingCustomer.get(i).getAssoCust().forEach(value -> System.out.println(value));
                System.out.println("Your weekly payment for both magazine, supplement and associate payment is  "
                        + payingCustomer.get(i).getTotalCost());       //get the weekly totalCost of magazine and supplements
                System.out.println("Total amount for four weeks are:" + payingCustomer.get(i).getTotalCost() * 4);
                // Calculate the totalCost multiply for four weeks
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("--------------------------------------------------------------------------");
            }

        }

        return payingCustomer;
    }

    /**
     * <p>
     * This method is to add the New Customer details and their
     * magazine,supplements
     * </p>
     *
     * @param payCustomer
     * @param supplist
     * @return payCustomer
     */
    public static ArrayList AddCustomer(ArrayList<PayingCustomer> payingCustomer, ArrayList<Supplement> Csupplist) {
        ArrayList<Supplement> paymentCustSuppl = new ArrayList<>();
        ArrayList<AssociateCustomer> assoCust = new ArrayList<>();

        PayingCustomer payc = new PayingCustomer(); //Created a object
        ///Initiliaztion and declaration of variable
        String name, email, payMethod;
        String cardNo;
        int suppList;
        String menu;
        boolean isSuppl = true;  //Initiliaztion and declaration boolean variable true or false
        System.out.println("Enter the payee Customer Name: ");
        name = kb.next();
        payc.setName(name);  //set Name
        System.out.println("Enter the payee Customer Email: ");
        email = kb.next();  //prompt user enter the email
        payc.setEmail(email);  //set Email

        System.out.println("Enter the payment Type: ");
        payMethod = kb.next();  //prompt user enter the payMethod 
        payc.setPaymentMethod(payMethod);  //set payMethod

        System.out.println("Enter the card number:  ");
        cardNo = kb.next();  //prompt user enter CardNo
        payc.setPaymentCardNo(cardNo); //set cardNo

        System.out.println("Do you want any supplements?(y or n)");
        menu = kb.next();   //prompt enter choose yes or no for supplements

        if (menu.charAt(0) == 'N' || menu.charAt(0) == 'n') {
            paymentCustSuppl = null;   ///paymentCustsupplementary set to null

        } else if (menu.charAt(0) == 'Y' || menu.charAt(0) == 'y') {
            while (isSuppl == true) { //while loop
                System.out.println("-------List of Supplements-------\n");
                for (int i = 0; i < Csupplist.size(); i++) {  //for loop
                    System.out.println(Csupplist.get(i).toString());  
             //print the supplement list stored in the arraylist
                }
                System.out.println("Enter the list Supplements(list 1 to 5)");
                suppList = kb.nextInt(); //prompt user enter the supplist
                paymentCustSuppl.add(Csupplist.get(suppList - 1));

                System.out.println("Do you want more supplement?(y or n)");
                menu = kb.next();  //prompt user enter the menu

                if (menu.charAt(0) == 'N' || menu.charAt(0) == 'n') {
                    isSuppl = false;  //isSuppl false
                }
            }
            payc.Setsupplelist(paymentCustSuppl);
        }
        System.out.println("Do you have any Associate Customer ?(y or n) ");
        menu = kb.next();
        boolean key = false;
        if (menu.charAt(0) == 'N' || menu.charAt(0) == 'n') {
            assoCust = null;
        } else if (menu.charAt(0) == 'Y' || menu.charAt(0) == 'y') {
            assoCust = AddAssociateCustomer(payingCustomer, Csupplist, assoCust);
            System.out.println("Do you have any more associate Customer ?(y or n) ");
            menu = kb.next();
            while (key == true) {
                if (menu.charAt(0) == 'N' || menu.charAt(0) == 'n') {
                    key = false;
                } else if (menu.charAt(0) == 'Y' || menu.charAt(0) == 'y') {
                    assoCust = AddAssociateCustomer(payingCustomer, Csupplist, assoCust); //calling method
                    key = true;
                }
                break;
            }
        }
        payc.setAssociateCus(assoCust); //set Associate Customer name
        payingCustomer.add(payc);     //add into payC

        System.out.println(payc.toString());
        return payingCustomer;
    }

    /**
     * <p>
     * This method is to Add new Associate Customer details and their magazine,
     * supplements
     * </p>
     *
     * @param payCustomer
     * @param supplist
     * @param associatecust
     * @return payCust
     */
    public static ArrayList AddAssociateCustomer(ArrayList<PayingCustomer> payCustomer, ArrayList<Supplement> Asupplist,
            ArrayList<AssociateCustomer> associatecust) {
        ArrayList<Supplement> Associatesupplist = new ArrayList<>();  //ArrayList declare and Initilaz

        AssociateCustomer associatCust1 = new AssociateCustomer();
        //Intilization and Declartion of variable
        String aName, aEmail;
        int supplOption;
        String menu;
        boolean isSuppl = true;
        System.out.println("Enter the Associate Customer name :");
        aName = kb.next();//prompt user enter the name
        associatCust1.setAssociateName(aName);
        //set Associate name
        System.out.println("Enter the Associate Customer Email :");   //prompt user enter the email
        aEmail = kb.next();
        associatCust1.setEmail(aEmail);  //set Associate customer email

        System.out.println("Do you want any supplements?(y or n) ");
        menu = kb.next();                                    //prompt user enter y or n

        if (menu.charAt(0) == 'N' || menu.charAt(0) == 'n') {
            Associatesupplist = null;  //set Associate to null 
        } else if (menu.charAt(0) == 'Y' || menu.charAt(0) == 'y') {
            while (isSuppl == true) {  //while boolean isSuppl==true
                System.out.println("-----List of Supplements------\n");
                for (int i = 0; i < Asupplist.size(); i++) {
                    System.out.println(Asupplist.get(i).toString());  //print supplist 
                }
                System.out.println("Enter the Supplements(1 to 5) ");
                supplOption = kb.nextInt();
                Associatesupplist.add(Asupplist.get(supplOption - 1));

                System.out.println("Do you want more supplement?(y or n)");
                menu = kb.next();

                if (menu.charAt(0) == 'N' || menu.charAt(0) == 'n') {
                    isSuppl = false;
                }
            }
            associatCust1.Setsupplelist(Associatesupplist);
        }
        associatecust.add(associatCust1);
        return associatecust;
    }

    /**
     * <p>
     * This method is to remove Customer from the stored list
     * </p>
     *
     * @param payingCustomer
     * @return payingCustomer
     */
    public static ArrayList RemoveCustomer(ArrayList<PayingCustomer> payingCustomer) {
        System.out.println("List of the Customer");

        for (int i = 0; i < payingCustomer.size(); i++) {
            System.out.println("-------******-------*****-------------------");
            System.out.println(payingCustomer.get(i).getName());   //print the name
            System.out.println(payingCustomer.get(i).getEmail());   //print the email

        }
        System.out.println("------------******------------*****---------");
        System.out.println("Enter Customer Name :");
        String name = kb.next();          //prompt user enter the customer name 

        System.out.println("Enter Customer email :");
        String email = kb.next();        //prompt user enter the email 

        boolean isFound = false;     //boolean isFound=false

        for (int i = 0; i < payingCustomer.size(); i++) {  //for loop 
            if (payingCustomer.get(i).getName().equalsIgnoreCase(name)) {  // compare getname and prompt entered name and email is equal 
                if (payingCustomer.get(i).getEmail().equalsIgnoreCase(email)) {
                    isFound = true;  //boolean
                    payingCustomer.remove(i);  //remove the record from the ArrayList
                    System.out.println("Successfully removed the Customer\n");   //print the value
                }
            }
        }
        return payingCustomer;
    }
}

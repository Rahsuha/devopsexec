
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 1.8.0_171
 * @author rahmansuhail
 **/

public class Client {
    
    public static ArrayList<Supplement> supplementdetails = new ArrayList<Supplement>();
    public static ArrayList<Customer> Custdetails = new ArrayList<Customer>();
    public static ArrayList<PayingCustomer> payCust = new ArrayList<>();
    public static ArrayList<AssociateCustomer> assoCust = new ArrayList<>();

    /**
     * @param Student details
     **/
    public static void studentDetails() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Name:ABDUL RAHMAN SUHAIL");
        System.out.println("Student No:33738202");
        System.out.println("Enrolment Mode: External");
        System.out.println("Tutor Name: Siew Cheong Chong");
        System.out.println("Tutorial attendance day : 02/09/2020 - 11/10/2020");
        System.out.println("-------------------------------------------------------\n");
    }

    /**
     *
     * @param args
     **/
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        studentDetails();  //studentDetails 
        StoreCustomerMagazineandSuppl(); //method have all HardCoded stored Customerrecord
        int option = 0;
        do {
            System.out.println("------Choose the menu--------");
            System.out.println("1. Print Weekly Email");
            System.out.println("2. Print Monthly Email");
            System.out.println("3. Add New Customer");
            System.out.println("4. Remove Customer");
            System.out.println("5. All Customer Record");
            System.out.println("6. All Supplement Record");
            System.out.println("7. Quit program \n");
            System.out.println("Enter the option:");  //Prompt the user enter option
            option = kb.nextInt();
            switch (option) {
                case 1:
                    MainFunctions.printEmail(payCust, assoCust);
                    System.out.println();
                    break;
                case 2:
                    MainFunctions.printmonthlyemailCustomer(payCust, assoCust);
                    System.out.println();
                    break;
                case 3:
                    MainFunctions.AddCustomer(payCust, supplementdetails);
                    System.out.println();
                    break;
                case 4:
                    MainFunctions.RemoveCustomer(payCust);
                    break;
                case 5:
                    System.out.println("Print Customer information");
                    for (int i = 0; i < payCust.size(); i++) {
                        System.out.println("-----------*******-------****-----------");
                        System.out.println(payCust.get(i).toString());
                    }
                    System.out.println();
                    break;
                case 6:
                    for (int i = 0; i < supplementdetails.size(); i++) {
                        System.out.println(supplementdetails.get(i).toString());
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("----Program successfully ended-----");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option");
                    System.out.println("Choose an appropriate option 1 to 7:");
                    break;
            }
        } while (option != 7);
    }

    public static void StoreCustomerMagazineandSuppl() {
        
        //ArrayList is to add new Supplements
        supplementdetails.add(new Supplement("1.Times Now", 2.00));
        supplementdetails.add(new Supplement("2.Southern Living", 1.20));
        supplementdetails.add(new Supplement("3.CNA lifestyle", 3.20));
        supplementdetails.add(new Supplement("4.Daily essentail", 2.20));
        supplementdetails.add(new Supplement("5.Motor riders", 1.00));
      
        //Create a Supplement object
        Supplement Supp1 = new Supplement("1.Southern Living", 1.20);
        Supplement Supp2 = new Supplement("2.CNA lifestyle", 3.20);
        Supplement Supp3 = new Supplement("3.Daily essentail", 2.20);
        Supplement Supp4 = new Supplement("4.Motor riders", 1.00);
        Supplement Supp5 = new Supplement("5.Times Now", 2.00);
        //create a PayingCustomerobject 
        PayingCustomer payCust1 = new PayingCustomer(); 
        PayingCustomer payCust2 = new PayingCustomer();
        PayingCustomer payCust3 = new PayingCustomer();
        PayingCustomer payCust4 = new PayingCustomer();
        PayingCustomer payCust5 = new PayingCustomer();

        //Create a AssociateCustomer Object
        AssociateCustomer aCust1 = new AssociateCustomer();
        AssociateCustomer aCust2 = new AssociateCustomer();
        AssociateCustomer aCust3 = new AssociateCustomer();
        AssociateCustomer aCust4 = new AssociateCustomer();
        AssociateCustomer aCust5 = new AssociateCustomer();

        //Create a ArrayList Supplement object
        ArrayList<Supplement> supplist1 = new ArrayList<>();
        ArrayList<Supplement> supplist2 = new ArrayList<>();
        ArrayList<Supplement> supplist3 = new ArrayList<>();
        ArrayList<Supplement> supplist4 = new ArrayList<>();
        ArrayList<Supplement> supplist5 = new ArrayList<>();

        //Create a AssociateCustomer object.
        ArrayList<AssociateCustomer> assoCust2 = new ArrayList<>();
        ArrayList<AssociateCustomer> assoCust3 = new ArrayList<>();
        ArrayList<AssociateCustomer> assoCust4 = new ArrayList<>();
        ArrayList<AssociateCustomer> assoCust5 = new ArrayList<>();

        //Add the supplist into ArrayList
        supplist1.add(Supp2);  //ArrayList supplist1 add two supplements
        supplist1.add(Supp1);
        supplist2.add(Supp2);
        supplist3.add(Supp3);
        supplist4.add(Supp4);
        supplist4.add(Supp1);
        supplist5.add(Supp5);

        aCust1.setAssociateName("Charles");
        aCust1.setEmail("Charles09@gmail.com");
        aCust1.Setsupplelist(supplist1);
        assoCust.add(aCust1);

        aCust2.setAssociateName("Jacknitro");
        aCust2.setEmail("jackNitro20@gmail.com");
        aCust2.Setsupplelist(supplist2);
        assoCust2.add(aCust2);

        aCust3.setAssociateName("GuhanKeer");
        aCust3.setEmail("GuhanKeer@gmail.com");
        aCust3.Setsupplelist(supplist3);
        assoCust3.add(aCust3);

        aCust4.setAssociateName("Thasleem");
        aCust4.setEmail("Thas90ee@yahoo.com");
        aCust4.Setsupplelist(supplist4);
        assoCust4.add(aCust4);

        aCust5.setAssociateName("MansoorR");
        aCust5.setEmail("MansoorR34@hotmail.com");
        aCust5.Setsupplelist(supplist1);
        assoCust5.add(aCust5);

        payCust1.setName("Davidwarner");
        payCust1.setEmail("David_98@yahoo.com.sg");
        payCust1.setPaymentMethod("Visa");
        payCust1.setPaymentCardNo("5678-9087-5463");
        payCust1.Setsupplelist(supplist1);
        payCust1.setAssociateCus(assoCust);
        payCust.add(payCust1);

        payCust2.setName("Joe");
        payCust2.setEmail("Joe34@gmail.com.sg");
        payCust2.setPaymentMethod("master");
        payCust2.setPaymentCardNo("1234-9092-6574");
        payCust2.Setsupplelist(supplist2);
        payCust2.setAssociateCus(assoCust2);
        payCust.add(payCust2);

        payCust3.setName("ChrisGayle");
        payCust3.setEmail("Chris7849@gmail.com.sg");
        payCust3.setPaymentMethod("master");
        payCust3.setPaymentCardNo("1234-9092-6574");
        payCust3.Setsupplelist(supplist3);
        payCust3.setAssociateCus(assoCust3);
        payCust.add(payCust3);

        payCust4.setName("Afreen");
        payCust4.setEmail("Afreen30@gmail.com");
        payCust4.setPaymentMethod("Visa");
        payCust4.setPaymentCardNo("3245-6778-1234");
        payCust4.Setsupplelist(supplist4);
        payCust4.setAssociateCus(assoCust4);
        payCust.add(payCust4);

        payCust5.setName("samuel");
        payCust5.setEmail("samuel38924@gmail.com");
        payCust5.setPaymentMethod("Visa");
        payCust5.setPaymentCardNo("3245-6778-1234");
        payCust5.Setsupplelist(supplist5);
        payCust5.setAssociateCus(assoCust5);
        payCust.add(payCust5);

    }
}

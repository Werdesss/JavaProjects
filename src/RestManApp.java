import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * @author Yusuf Mert Köseoğlu
 * @since 12.11.2020
 */
public class RestManApp {
    /**
     * It prints the menu items
     */
    public static void menu(){
            System.out.println("\nMENU\n1:addStaff:\n2:deleteStaff:\n3:getStaffDetails:\n4:addCustomer:\n5:deleteCustomer\n6:receiveBooking\n7:receiveOrder\n8:getCustomerDetails\n9:getCustomerBooking\n10:getCustomerOrders\n11:listStaff\n12:listCustomer\n-1:exit!");
    }

    /**
     * add new staffs to Staffs array list by creating a new staff and getting its values. Finally it adds to the Staffs
     * @param Staffs Staffs array list that I created in main
     * @exception try-cacth  to be able parse the string ro date
     */

    public static void addStaff(ArrayList<Staff> Staffs) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, ssn, gender, dateOfBirth(dd/MM/yyyy):");
        String name = myObj.nextLine();
        int ssn = myObj.nextInt();
        char gender = myObj.next().charAt(0);
        String dateOfBirth = myObj.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try{
            date = dateFormat.parse(dateOfBirth);

        } catch (ParseException e){
            e.printStackTrace();
        }
        Staff staff = new Staff();
        staff.setgender(gender);
        staff.setname(name);
        staff.setssn(ssn);
        staff.setdateOfBirth(date);
        Staffs.add(staff);
    }

    /**
     * Deletes staff from Staffs arraylist by taking ssn
     * @param ssn to be able to find the staff in Staffs
     * @param Staffs Staffs array list that I created in main
     */
    public static void deleteStaff(int ssn, ArrayList<Staff> Staffs){
        int i, index = -1;
        for (i = 0; i< Staffs.size(); i++) {
            if (Staffs.get(i).getssn() == ssn){
                index = i;
            }
        }
        if (index == -1)
            System.out.println("There is no staff with given ssn number");
        else{
            Staffs.remove(index);
            System.out.println("Customer successfully deleted");
        }
    }

    /**
     * shows the details of staff by taking ssn to detect which user it belongs
     * @param Staffs Staffs array list that I created in main
     * @param ssn to be able to find the staff in Staffs
     */
    public static void getStaffDetails(ArrayList<Staff> Staffs, int ssn){
        int i, index = -1;
        for (i = 0; i< Staffs.size(); i++) {
            if (Staffs.get(i).getssn() == ssn){
                index = i;
            }
        }
        if (index == -1)
            System.out.println("There is no staff with given ssn number");
        else{
            System.out.println("Name:" + Staffs.get(index).getname());
            System.out.println("SSN:" + Staffs.get(index).getssn());
            System.out.println("Gender:" + Staffs.get(index).getGender());
            System.out.println("DateOfBirth:" + Staffs.get(index).getDateOfBirth());
        }
    }

    /**
     * add customers to Customers array list i the main by creating a new customer and getting its values. Finally it adds to the Customers
     * @param Customers Customers array list that I created in
     */

    public static void addCustomer(ArrayList<Customer> Customers){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, ssn, gender, dateOfBirth(dd/MM/yyyy) , registration Date(dd/MM/yyyy): ");
        String name = myObj.nextLine();
        int ssn = myObj.nextInt();
        char gender = myObj.next().charAt(0);
        String dateOfBirth = myObj.next();
        String registrationDate = myObj.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        Date date2 = null;
        try{
            date = dateFormat.parse(dateOfBirth);
            date2 = dateFormat.parse(registrationDate);

        } catch (ParseException e){
            e.printStackTrace();
        }
        Customer customer = new Customer();
        customer.setgender(gender);
        customer.setname(name);
        customer.setssn(ssn);
        customer.setdateOfBirth(date);
        customer.setRegistrationDate(date2);

        // Wasn't sure if we needed to add the details of bookings here so I just put it in comment


        /*System.out.println("Please enter details for booking\nBooking date, booking table:");
        String bookingDate = myObj.next();
        Date date3 = null;
        try{
            date3 = dateFormat.parse(bookingDate);
        } catch (ParseException e){
            e.printStackTrace();
        }
        int bookingTable = myObj.nextInt();
        Booking c_booking = new Booking();
        c_booking.setbookingDate(date3);
        c_booking.setbookingTable(bookingTable);
        customer.makeBooking(c_booking);*/


        Customers.add(customer);

    }

    /**
     * Deletes customer from Customers arraylist by taking ssn
     * @param ssn to be able to find the customer in Customers
     * @param Customers Customers array list that I created in main
     */

    public static void deleteCustomer(int ssn, ArrayList<Customer> Customers){
        int i, index = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getssn() == ssn){
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("There is no customer with given ssn number");
        else{
            Customers.remove(index);
            System.out.println("Customer successfully deleted");
        }
    }

    /**
     * by taking ssn it finds which customer it belongs and adds booking to that customer
     * @param ssn to be able to find the customer in Customers
     * @param Customers Customers array list that I created in main
     */

    public static void receiveBooking(int ssn, ArrayList<Customer> Customers){
        int i, index = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getssn() == ssn){
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("There is no customer with given ssn number");
        else{
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter details for booking\nBooking date(dd/MM/yyyy), booking table:");
            String bookingDate = myObj.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date3 = null;
            try{
                date3 = dateFormat.parse(bookingDate);
            } catch (ParseException e){
                e.printStackTrace();
            }
            int bookingTable = myObj.nextInt();
            Booking c_booking = new Booking();
            c_booking.setbookingDate(date3);
            c_booking.setbookingTable(bookingTable);
            Customers.get(index).makeBooking(c_booking);
        }
    }

    /**
     * by taking ssn and booking date it finds which customer it belongs and order to that customer's booking
     * @param ssn to be able to find the customer in Customers
     * @param Customers Customers array list that I created in main
     * @param bookingDate to be able to find the booking in Bookings
     */

    public static void receiveOrder (int ssn, Date bookingDate, ArrayList<Customer> Customers){
        int i, index = -1, date = -1;

        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getssn() == ssn){
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("There is no customer with given ssn number");                     // If there is no customer with that ssn, there is no need to continue
            return;
        }

        for (i = 0; i < Customers.get(index).getBookings().size(); i++){
            if (Customers.get(index).getBookings().get(i).getbookingDate().equals(bookingDate)){
                date = i;
                break;
            }
        }

        if (index == -1 || date == -1)
            System.out.println("There is no customer with given ssn number and date");
        else{
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter details for order\nDetails, description:");
            String details = myObj.next();
            String description = myObj.next();
            Order order = new Order();
            order.setdescription(description);
            order.setdetails(details);
            Customers.get(index).getBookings().get(date).makeOrder(order);
        }
    }

    /**
     * shows the details of customer by taking ssn to detect which Customers it belongs
     * @param Customers Customers array list that I created in main
     * @param ssn to be able to find the staff in Staffs
     */

    public static void getCustomerDetails(int ssn, ArrayList<Customer> Customers){
        int i, index = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getssn() == ssn){
                index = i;
                break;
            }
        }

        if (index == -1)
            System.out.println("There is no customer with given ssn number");
        else{
            System.out.println("Ssn: " + Customers.get(index).getssn());
            System.out.println("Name: " + Customers.get(index).getname());
            System.out.println("Gender: " + Customers.get(index).getGender());
            System.out.println("Date of birth: " + Customers.get(index).getDateOfBirth());
            System.out.println("Registration date: " + Customers.get(index).getRegistrationDate());
        }
    }

    /**
     * shows the details of customer's bookings by taking ssn to detect which user it belongs
     * @param Customers Customers array list that I created in main
     * @param ssn to be able to find the staff in Staffs
     */
    public static void getCustomerBooking(int ssn, ArrayList<Customer> Customers){
        int i, index = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getssn() == ssn){
                index = i;
                 break;
            }
        }

        if (index == -1)
            System.out.println("There is no customer with given ssn number");
        else{
            for (i = 0; i < Customers.get(index).getBookings().size(); i++){
                System.out.println((i+1)+ ". booking date: " + Customers.get(index).getBookings().get(i).getbookingDate());
                System.out.println((i+1)+". booking table: " + Customers.get(index).getBookings().get(i).getbookingTable());
            }
        }
    }

    /**
     * shows the details of customer's orders by taking ssn to detect which user it belongs
     * @param Customers Customers array list that I created in main
     * @param ssn to be able to find the staff in Staffs
     */
    public static void getCustomerOrders(int ssn, Date bookingDate, ArrayList<Customer> Customers){
        int i, index = -1, date = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getssn() == ssn){
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("There is no customer with given ssn number");
            return;
        }

        for (i = 0; i< Customers.get(index).getBookings().size(); i++){
            if (Customers.get(index).getBookings().get(i).getbookingDate().equals(bookingDate)){
                date = i;
                break;
            }
        }

        if (index == -1 || date ==-1)
            System.out.println("There is no customer with given ssn number and date");
        else{
            for (i = 0; i < Customers.get(index).getBookings().get(date).getOrders().size(); i++){
                System.out.println((i+1) + ". details " + Customers.get(index).getBookings().get(date).getOrders().get(i).getdetails());
                System.out.println((i+1) + ". description " + Customers.get(index).getBookings().get(date).getOrders().get(i).getDescription());
            }
        }
    }

    /**
     * List all the staff details
     * @param Staffs Staffs array list that I created in main
     */
    public static void listStaff(ArrayList<Staff> Staffs){
        int i;
        if (Staffs.size() == 0)
            System.out.println("There is no registered staff ");
        else{
            for (i = 0; i < Staffs.size(); i++){
                System.out.println((i+1)+ ". Staff's Name:" + Staffs.get(i).getname());
                System.out.println((i+1)+ ". Staff's SSN:" + Staffs.get(i).getssn());
                System.out.println((i+1)+ ". Staff's Gender:" + Staffs.get(i).getGender());
                System.out.println((i+1)+ ". Staff's DateOfBirth:" + Staffs.get(i).getDateOfBirth());
            }
        }
    }

    /**
     * List all the customers details
     * @param Customers
     */
    public static void listCustomer(ArrayList<Customer> Customers){
        int i;
        if (Customers.size() == 0)
            System.out.println("There is no registered staff ");
        else{
            for (i = 0; i < Customers.size(); i++) {
                System.out.println((i+1) + ". Customer's Ssn: " + Customers.get(i).getssn());
                System.out.println((i+1) + ". Customer's Name: " + Customers.get(i).getname());
                System.out.println((i+1) + ". Customer's Gender: " + Customers.get(i).getGender());
                System.out.println((i+1) + ". Customer's Date of birth: " + Customers.get(i).getDateOfBirth());
                System.out.println((i+1) + ". Customer's Registration date: " + Customers.get(i).getRegistrationDate());
            }
        }
    }

    public static void main (String[] args) throws ParseException {
        ArrayList<Staff> Staffs = new ArrayList<Staff>();
        ArrayList<Customer> Customers = new ArrayList<Customer>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Populatedata populate = new Populatedata();
        populate.populate(Customers, Staffs);

        int n = 0;
        do {
            menu();
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter the number:");
            n = myObj.nextInt();
            switch (n) {
                case 1:
                    addStaff(Staffs);
                    break;
                case 2: {
                    System.out.println("Enter the ssn:");
                    int ssn = myObj.nextInt();
                    deleteStaff(ssn, Staffs);
                    break;
                }
                case 3:{
                    System.out.println("Enter the ssn:");
                    int ssn = myObj.nextInt();
                    getStaffDetails(Staffs, ssn);
                    break;
                }
                case 4:{
                    addCustomer(Customers);
                    break;
                }
                case 5:{
                    System.out.println("Enter the ssn:");
                    int ssn = myObj.nextInt();
                    deleteCustomer(ssn, Customers);
                    break;
                }
                case 6:{
                    System.out.println("Enter the ssn:");
                    int ssn = myObj.nextInt();
                    receiveBooking(ssn, Customers);
                    break;
                }
                case 7:{
                    System.out.println("Enter the ssn and date(dd/MM/yyyy):");
                    int ssn = myObj.nextInt();
                    String idate = myObj.next();
                    Date date = null;
                    try{
                        date = dateFormat.parse(idate);

                    } catch (ParseException e){
                        e.printStackTrace();
                    }
                    receiveOrder(ssn, date, Customers);
                    break;
                }
                case 8:{
                    System.out.println("Enter the ssn:");
                    int ssn = myObj.nextInt();
                    getCustomerDetails(ssn, Customers);
                    break;
                }
                case 9:{
                    System.out.println("Enter the ssn:");
                    int ssn = myObj.nextInt();
                    getCustomerBooking(ssn, Customers);
                    break;
                }
                case 10:{
                    System.out.println("Enter the ssn and date(dd/MM/yyyy):");
                    int ssn = myObj.nextInt();
                    String idate = myObj.next();
                    Date date = null;
                    try{
                        date = dateFormat.parse(idate);

                    } catch (ParseException e){
                        e.printStackTrace();
                    }
                    getCustomerOrders(ssn, date, Customers);
                    break;
                }
                case 11:{
                    listStaff(Staffs);
                    break;
                }
                case 12:{
                    listCustomer(Customers);
                    break;
                }
                case -1: {
                    n = -1;
                    break;
                }
                default:
                    System.out.println("Please enter a correct number!!");
            }
    }while (n!=-1);
    }
}
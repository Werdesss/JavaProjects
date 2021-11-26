import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.ParseException;


public class Populatedata {
    public Populatedata(){ }

    /**
     * To create 3 Staff objects, 3 Customer objects, with each Customer having one Booking and for each Booking one Order object
     * @param Customers
     * @param Staffs
     * @throws ParseException
     */
    public void populate (ArrayList<Customer> Customers, ArrayList<Staff> Staffs) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Staff staff1 = new Staff(1, "mert", 'm', dateFormat.parse("12/12/1212"));
        Staff staff2= new Staff(2, "merte", 'm', dateFormat.parse("12/12/1213") );
        Staff staff3 = new Staff(3, "merto", 'm', dateFormat.parse("12/12/1214") );
        Customer customer1 = new Customer(1, "mert", 'm', dateFormat.parse("12/12/1212"),  dateFormat.parse("12/12/2010") );
        Customer customer2 = new Customer(2, "merte", 'm', dateFormat.parse("12/12/1213"), dateFormat.parse("12/12/2012") );
        Customer customer3 = new Customer(3, "merto", 'm', dateFormat.parse("12/12/1214"), dateFormat.parse("12/12/2020") );
        Booking booking1 = new Booking(dateFormat.parse("12/12/2020"), 1);
        Booking booking2 = new Booking(dateFormat.parse("12/12/2012"), 2);
        Booking booking3 = new Booking(dateFormat.parse("12/12/2015"), 3);
        Order order1 = new Order("s","a");
        Order order2 = new Order("a","s");
        Order order3 = new Order("v","as");
        customer1.makeBooking(booking1);
        customer2.makeBooking(booking2);
        customer3.makeBooking(booking3);
        customer1.getBookings().get(0).makeOrder(order1);
        customer2.getBookings().get(0).makeOrder(order2);
        customer3.getBookings().get(0).makeOrder(order3);
        Staffs.add(staff1);
        Staffs.add(staff2);
        Staffs.add(staff3);
        Customers.add(customer1);
        Customers.add(customer2);
        Customers.add(customer3);
    }
}

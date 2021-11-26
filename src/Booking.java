import java.util.ArrayList;
import java.util.Date;

public class Booking {
    private java.util.Date bookingDate;
    private int bookingTable;
    private ArrayList<Order> orders;

    /**
     * constructor without given parameters
     */
    public Booking(){
        bookingTable = 0;
        bookingDate = new Date(0,0,0);
        orders = new ArrayList<Order>();
    }

    /**
     * constructor with given parameters
     * @param bookingDate
     * @param bookingTable
     */
    public Booking(Date bookingDate, int bookingTable){
        this.bookingTable = bookingTable;
        this.bookingDate = bookingDate;
        this.orders = new ArrayList<Order>();
    }

    /**
     * constructor with given parameters (+ order class)
     * @param bookingDate
     * @param bookingTable
     * @param orders
     */
     public Booking(Date bookingDate, int bookingTable, Order orders){
        this.bookingTable = bookingTable;
        this.bookingDate = bookingDate;
        this.orders.add(orders);
    }

    /**
     * setter for bookingDate
     * @param bookingDate
     */
    public void setbookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    /**
     * setter for bookingTable
     * @param bookingTable
     */
    public void setbookingTable(int bookingTable){
        this.bookingTable = bookingTable;
    }

    /**
     * getter for bookingDate
     * @return
     */
    public Date getbookingDate() {
        return bookingDate;
    }

    /**
     * getter for Order
     * @return orders
     */
    public ArrayList<Order> getOrders() {
        return orders;
    }

    /**
     * getter for bookingTable
     * @return bookingTable
     */
    public int getbookingTable(){
        return bookingTable;
    }

    /**
     * to make new order for bookings
     * @param orders
     */
    public void makeOrder(Order orders){
        this.orders.add(orders);
    }

}

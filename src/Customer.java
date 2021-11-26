import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int ssn;
    private String name;
    private char gender;
    private java.util.Date dateOfBirth;
    private java.util.Date registrationDate;
    private ArrayList<Booking> bookings;

    /**
     * constructor class without any parameters
     */
    public Customer(){
        ssn = 0;
        name = "unknown";
        gender = 'u';
        dateOfBirth = new Date(0, 0, 0);
        registrationDate = new Date(0,0,0);
        bookings = new ArrayList<Booking>();
    }

    /**
     * consturctor class with given parameters
     * @param ssn
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param registrationDate
     */
    public Customer(int ssn, String name, char gender, Date dateOfBirth, Date registrationDate){
        this.ssn = ssn;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.registrationDate = registrationDate;
        this.bookings = new ArrayList<Booking>();
    }

    /**
     * constructor classa wtih given parameter (+ booking class)
     * @param ssn
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param registrationDate
     * @param bookings
     */
    public Customer(int ssn, String name, char gender, Date dateOfBirth, Date registrationDate, Booking bookings){
        this.ssn = ssn;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.registrationDate = registrationDate;
        this.bookings.add(bookings);
    }

    /**
     * getter for ssn
     * @return ssn
     */
    public int getssn(){
        return ssn;
    }

    /**
     * getter for name
     * @return name
     */
    public String getname(){
        return name;
    }

    /**
     * getter for gender
     * @return gender
     */
    public char getGender(){
        return gender;
    }

    /**
     * getter for dateofBirth
     * @return dateofBirth
     */
    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    /**
     * getter for registrationdate
     * @return
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * getter for booking
     * @return
     */
    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    /**
     * setter for snn
     * @param ssn
     */
    public void setssn(int ssn){
        this.ssn = ssn;
    }

    /**
     * setter for registrationDate
     * @param registrationDate
     */
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * setter for name
     * @param name
     */
    public void setname(String name){
        this.name = name;
    }

    /**
     * setter for gender
     * @param gender
     */
    public void setgender(char gender){
        this.gender = gender;
    }

    /**
     * setter for dateofbirth
     * @param dateOfBirth
     */
    public void setdateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * makes booking for customer
     * @param booking
     */
    public void makeBooking (Booking booking){
        this.bookings.add(booking);
    }
}

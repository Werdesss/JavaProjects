public class Order {
    private String details;
    private String description;

    /**
     * constructor without given parameters
     */
    public Order(){
        details = "Unknown";
        description = "Unknown";
    }

    /**
     * constructor with given parameters
     * @param description
     * @param details
     */
    public Order(String description, String details){
        this.description = description;
        this.details = details;
    }

    /**
     * setter for details
     * @param details
     */
    public void setdetails(String details){
        this.details = details;
    }

    /**
     * setter for description
     * @param description
     */
    public void setdescription(String description){
        this.description = description;
    }

    /**
     * getter for details
     * @return details
     */
    public String getdetails(){
        return details;
    }

    /**
     * getter for description
     * @return description
     */
    public String getDescription(){
        return description;
    }
}

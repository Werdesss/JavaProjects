import java.util.Date;

public class Staff {
    private int ssn;
    private String name;
    private char gender;
    private java.util.Date dateOfBirth;


    /**
     * constructor without any parameters
     */
    public Staff(){
        ssn = 0;
        name = "unknown";
        gender = 'u';
        dateOfBirth = new Date(0, 0, 0);
    }

    /**
     * constructor with given parameters
     * @param ssn
     * @param name
     * @param gender
     * @param dateOfBirth
     */
    public Staff(int ssn, String name, char gender, Date dateOfBirth){
        this.ssn = ssn;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
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
     * @return gendet
     */
    public char getGender(){
        return gender;
    }

    /**
     * getter for dateofBirth
     * @return dateofbirth
     */
    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    /**
     * setter for ssn
     */
    public void setssn(int ssn){
        this.ssn = ssn;
    }

    /**
     * setter for name
     */
    public void setname(String name){
        this.name = name;
    }

    /**
     * setter for gender
     */
    public void setgender(char gender){
        this.gender = gender;
    }

    /**
     * setter for dateofbirth
     */
    public void setdateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
}

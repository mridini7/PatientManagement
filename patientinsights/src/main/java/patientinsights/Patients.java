package patientinsights;

public class Patients {
    private String firstName;
    private String lastName;
    private String month;
    private String year;
    private String email;
    private String phoneNumber;

    public Patients(){
        firstName = "";
        lastName = "";
        month = "0";
        year = "0";
        email = "";
        phoneNumber = "";
    }

    public Patients(String first, String last, String mon, String y, String e, String p){
        firstName = first;
        lastName = last;
        month = mon;
        year = y;
        email = e;
        phoneNumber = p;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMonth() {
        return month;
    }
    public String getYear() {
        return year;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setFirstName(String first) {
        firstName = first;
    }
    public void setLastName(String last) {
        lastName = last;
    }
    public void setMonth(String m) {
        month = m;
    }
    public void setYear(String y) {
        year = y;
    }
    public void setEmail(String e) {
        email = e;
    }
    public void setPhoneNumber(String p) {
        phoneNumber = p;
    }

    public String convertString(){
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Month: " + month + ", Year" + year + ", Email: " + email + ", Phone Number: " + phoneNumber;
    } 
}

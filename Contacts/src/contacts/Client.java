package contacts;
import java.util.regex.Pattern;
public class Client {
    private String fullName;
    private String phoneNumber;
    private String gmail;
    private String city;
    private String messege;
    private boolean f;
    {
        messege = "";
        fullName = "";
        gmail = "";
        phoneNumber = "";
        city = "";
        f = true;
    }
    public String getMessege() {
        return messege;
    }
    public Client(String fullName, String phoneNumber, String gmail, String city) {
        this(fullName , phoneNumber , gmail);
        setCity(city);
    }
    public Client(String fullName, String phoneNumber, String gmail) {
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
        setGmail(gmail);
    }
    public String getFullName() {
        return fullName.trim();//"   Bisho Salama   "
    }
    public void setFullName(String fullName) {
        if ( !fullName.isEmpty() && fullName.trim().replaceAll("[ ]+", " ").length() >= 10 ) {
            this.fullName = fullName.trim().replaceAll("[ ]+", " ");
        } else { // !    !a && !b
            messege += "Full name is invalid\n";
            f = false;
        } 
    }
    public String getPhoneNumber() {
        return phoneNumber.trim();
    }
    public void setPhoneNumber(String phoneNumber) {
        if (Pattern.matches("((\\+201)|(201)|(01))[0125]\\d{8}$", phoneNumber.trim())) {
            this.phoneNumber = phoneNumber;            
        } else {
            messege += "Phone number is invalid\n";
            f = false;
        }
    }
    public String getGmail() {
        return gmail.trim();
    }
    public void setGmail(String gmail) {
        if (Pattern.matches("[a-z0-9]{5,20}@[a-z]{3,6}\\.[a-z]{3,6}$", gmail.trim().toLowerCase())) {
            this.gmail = gmail.trim().toLowerCase();        
        } else {
            messege += "Gmail is invalid\n";
            f = false;
        } 
    }
    public String getCity() {
        return city.trim();
    }
    public void setCity(String city) {
        if (!(city.trim().length() > 20 || city.trim().length() < 3 )) {
            this.city = city;
        } else {
            messege += "City is invalid";
            f = false;
        }
    }
    public boolean flag(){
        return f;
    } 
}
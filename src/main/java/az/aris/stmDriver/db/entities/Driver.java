package az.aris.stmDriver.db.entities;



import java.io.Serializable;
import java.sql.Date;


public class Driver implements Serializable {
    private static final long serialVersionUID = 1L;

    private long idDriver;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String notes;
    private String currentAddress;
    private int gender;
    private String mobileNumber;
    private String email;
    private String homeNumber;
    private int fin;
    private String serialNumber;
    private Date givenDate;
    private Date finishDate;
    private Date birthDay;
    private String registrationAddress;
    private int rus;
    private int eng;
    private int aze;

    public Driver(String firstName, String lastName, String fatherName, String notes, String currentAddress, int gender, String mobileNumber, String email, String homeNumber, int fin, String serialNumber, Date givenDate, Date finishDate, Date birthDay, String registrationAddress, int rus, int eng, int aze) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.notes = notes;
        this.currentAddress = currentAddress;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.homeNumber = homeNumber;
        this.fin = fin;
        this.serialNumber = serialNumber;
        this.givenDate = givenDate;
        this.finishDate = finishDate;
        this.birthDay = birthDay;
        this.registrationAddress = registrationAddress;
        this.rus = rus;
        this.eng = eng;
        this.aze = aze;
    }

    public Driver() {

    }

    @Override
    public String toString() {
        return "Driver{" +
                "idDriver=" + idDriver +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", notes='" + notes + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", gender=" + gender +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", fin=" + fin +
                ", serialNumber='" + serialNumber + '\'' +
                ", givenDate=" + givenDate +
                ", finishDate=" + finishDate +
                ", birthDay=" + birthDay +
                ", registrationAddress='" + registrationAddress + '\'' +
                ", rus=" + rus +
                ", eng=" + eng +
                ", aze=" + aze +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(long idDriver) {
        this.idDriver = idDriver;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public int getRus() {
        return rus;
    }

    public void setRus(int rus) {
        this.rus = rus;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getAze() {
        return aze;
    }

    public void setAze(int aze) {
        this.aze = aze;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

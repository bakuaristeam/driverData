package az.aris.stm_driver_license.db.entity;

import java.io.Serializable;
import java.sql.Date;

public class DriverLicense implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idDriverLicense;
    private long idDriver;
    private int driverCategory;
    private Date givenDate;
    private Date finishDate;
    private String serialNumber;

    public DriverLicense(long idDriverLicense, long idDriver, int driverCategory, Date givenDate, Date finishDate, String serialNumber) {
        this.idDriverLicense = idDriverLicense;
        this.idDriver = idDriver;
        this.driverCategory = driverCategory;
        this.givenDate = givenDate;
        this.finishDate = finishDate;
        this.serialNumber = serialNumber;
    }

    public DriverLicense() {
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "idDriverLicense=" + idDriverLicense +
                ", idDriver=" + idDriver +
                ", driverCategory=" + driverCategory +
                ", givenDate=" + givenDate +
                ", finishDate=" + finishDate +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public long getIdDriverLicense() {
        return idDriverLicense;
    }

    public void setIdDriverLicense(long idDriverLicense) {
        this.idDriverLicense = idDriverLicense;
    }

    public long getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(long idDriver) {
        this.idDriver = idDriver;
    }

    public int getDriverCategory() {
        return driverCategory;
    }

    public void setDriverCategory(int driverCategory) {
        this.driverCategory = driverCategory;
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

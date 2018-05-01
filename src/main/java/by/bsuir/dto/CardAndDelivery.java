package by.bsuir.dto;

public class CardAndDelivery {
    private String city;
    private String address;
    private String phoneNumberDeliv;

    private Integer creditСardNumber;
    private Integer cvv;
    private String expiryDate;



    public CardAndDelivery() {
    }

    public CardAndDelivery(Integer creditСardNumber, Integer cvv, String expiryDate, String city, String address, String phoneNumberDeliv, Long idPhone) {
        this.creditСardNumber = creditСardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.city = city;
        this.address = address;
        this.phoneNumberDeliv = phoneNumberDeliv;

    }

    public Integer getCreditСardNumber() {
        return creditСardNumber;
    }

    public void setCreditСardNumber(Integer creditСardNumber) {
        this.creditСardNumber = creditСardNumber;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumberDeliv() {
        return phoneNumberDeliv;
    }

    public void setPhoneNumberDeliv(String phoneNumberDeliv) {
        this.phoneNumberDeliv = phoneNumberDeliv;
    }


}

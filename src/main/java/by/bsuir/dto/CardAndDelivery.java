package by.bsuir.dto;

public class CardAndDelivery {
    private String city;
    private String address;
    private String phoneNumberDeliv;

    private String creditСardNumber;
    private String cvv;
    private String expiryDate;





    public CardAndDelivery() {
    }

    public CardAndDelivery(String city, String address, String phoneNumberDeliv, String creditСardNumber, String cvv, String expiryDate) {
        this.city = city;
        this.address = address;
        this.phoneNumberDeliv = phoneNumberDeliv;
        this.creditСardNumber = creditСardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;

    }

    public String getCreditСardNumber() {
        return creditСardNumber;
    }

    public void setCreditСardNumber(String creditСardNumber) {
        this.creditСardNumber = creditСardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
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

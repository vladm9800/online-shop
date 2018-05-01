package by.bsuir.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "delivery_place", schema = "online_shop", catalog = "")
public class DeliveryPlace {
    private Long id;
    private String city;
    private String address;
    private String phoneNumberDeliv;
    private List<Orders> ordersById;

    public DeliveryPlace() {
    }

    public DeliveryPlace(String city, String address, String phoneNumberDeliv) {
        this.city = city;
        this.address = address;
        this.phoneNumberDeliv = phoneNumberDeliv;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




    @Basic
    @Column(name = "phone_number_deliv")
    public String getPhoneNumberDeliv() {
        return phoneNumberDeliv;
    }

    public void setPhoneNumberDeliv(String phoneNumberDeliv) {
        this.phoneNumberDeliv = phoneNumberDeliv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryPlace that = (DeliveryPlace) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phoneNumberDeliv != null ? !phoneNumberDeliv.equals(that.phoneNumberDeliv) : that.phoneNumberDeliv != null)
            return false;
        return ordersById != null ? ordersById.equals(that.ordersById) : that.ordersById == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumberDeliv != null ? phoneNumberDeliv.hashCode() : 0);
        result = 31 * result + (ordersById != null ? ordersById.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "deliveryPlaceByIdDeliveryPlace")
    public List<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(List<Orders> ordersById) {
        this.ordersById = ordersById;
    }
}

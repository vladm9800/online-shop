package by.bsuir.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "delivery_place", schema = "online_shop", catalog = "")
public class DeliveryPlace {
    private Long id;
    private String address;
    private String workingHours;
    private Integer phoneNumberDeliv;
    private Collection<Order> ordersById;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "working_hours")
    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    @Basic
    @Column(name = "phone_number_deliv")
    public Integer getPhoneNumberDeliv() {
        return phoneNumberDeliv;
    }

    public void setPhoneNumberDeliv(Integer phoneNumberDeliv) {
        this.phoneNumberDeliv = phoneNumberDeliv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryPlace that = (DeliveryPlace) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (workingHours != null ? !workingHours.equals(that.workingHours) : that.workingHours != null) return false;
        if (phoneNumberDeliv != null ? !phoneNumberDeliv.equals(that.phoneNumberDeliv) : that.phoneNumberDeliv != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (workingHours != null ? workingHours.hashCode() : 0);
        result = 31 * result + (phoneNumberDeliv != null ? phoneNumberDeliv.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "deliveryPlaceByIdDeliveryPlace")
    public Collection<Order> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Order> ordersById) {
        this.ordersById = ordersById;
    }
}

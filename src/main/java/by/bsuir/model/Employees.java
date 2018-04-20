package by.bsuir.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employees {
    private Long id;
    private String surname;
    private String name;
    private String patronymic;
    private String email;
    private String post;
    private Integer phoneNumberEmpl;
    private Collection<Delivery> deliveriesById;
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
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "patronymic")
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "post")
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "phone_number_empl")
    public Integer getPhoneNumberEmpl() {
        return phoneNumberEmpl;
    }

    public void setPhoneNumberEmpl(Integer phoneNumberEmpl) {
        this.phoneNumberEmpl = phoneNumberEmpl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees employees = (Employees) o;

        if (id != null ? !id.equals(employees.id) : employees.id != null) return false;
        if (surname != null ? !surname.equals(employees.surname) : employees.surname != null) return false;
        if (name != null ? !name.equals(employees.name) : employees.name != null) return false;
        if (patronymic != null ? !patronymic.equals(employees.patronymic) : employees.patronymic != null) return false;
        if (email != null ? !email.equals(employees.email) : employees.email != null) return false;
        if (post != null ? !post.equals(employees.post) : employees.post != null) return false;
        if (phoneNumberEmpl != null ? !phoneNumberEmpl.equals(employees.phoneNumberEmpl) : employees.phoneNumberEmpl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        result = 31 * result + (phoneNumberEmpl != null ? phoneNumberEmpl.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "employeesByIdEmployee")
    public Collection<Delivery> getDeliveriesById() {
        return deliveriesById;
    }

    public void setDeliveriesById(Collection<Delivery> deliveriesById) {
        this.deliveriesById = deliveriesById;
    }

    @OneToMany(mappedBy = "employeesByIdEmployee")
    public Collection<Order> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Order> ordersById) {
        this.ordersById = ordersById;
    }
}

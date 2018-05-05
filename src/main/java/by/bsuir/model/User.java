package by.bsuir.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
public class User implements Serializable {
    private Long userId;
    private String login;
    private String password;
    private int active;
    private String email;
    private String surname;
    private String name;
    private Date dateOfBrth;
    private List<CreditCard> creditCardsByUserId;
    private List<Orders> ordersByUserId;
    private Set<Role> roles;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "date_of_brth")
    public Date getDateOfBrth() {
        return dateOfBrth;
    }

    public void setDateOfBrth(Date dateOfBrth) {
        this.dateOfBrth = dateOfBrth;
    }

    @Basic
    @Column(name = "active")
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (active != user.active) return false;
        if (userId != null ? !userId.equals(user.userId) : user.userId != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (dateOfBrth != null ? !dateOfBrth.equals(user.dateOfBrth) : user.dateOfBrth != null) return false;
        if (creditCardsByUserId != null ? !creditCardsByUserId.equals(user.creditCardsByUserId) : user.creditCardsByUserId != null)
            return false;
        if (ordersByUserId != null ? !ordersByUserId.equals(user.ordersByUserId) : user.ordersByUserId != null)
            return false;
        return roles != null ? roles.equals(user.roles) : user.roles == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + active;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateOfBrth != null ? dateOfBrth.hashCode() : 0);
        result = 31 * result + (creditCardsByUserId != null ? creditCardsByUserId.hashCode() : 0);
        result = 31 * result + (ordersByUserId != null ? ordersByUserId.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByIdClient")
    public List<CreditCard> getCreditCardsByUserId() {
        return creditCardsByUserId;
    }

    public void setCreditCardsByUserId(List<CreditCard> creditCardsByUserId) {
        this.creditCardsByUserId = creditCardsByUserId;
    }

    @OneToMany(mappedBy = "userByIdClient")
    public List<Orders> getOrdersByUserId() {
        return ordersByUserId;
    }

    public void setOrdersByUserId(List<Orders> ordersByUserId) {
        this.ordersByUserId = ordersByUserId;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}

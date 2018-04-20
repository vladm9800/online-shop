package by.bsuir.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Clients {
    private Long id;
    private String login;
    private String password;
    private String emailCl;
    private String surnameCl;
    private String nameCl;
    private String patronymicCl;
    private String addressCl;
    private Date dateOfBrth;

    private Collection<CreditCard> creditCardsById;
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
    @Column(name = "email_cl")
    public String getEmailCl() {
        return emailCl;
    }

    public void setEmailCl(String emailCl) {
        this.emailCl = emailCl;
    }

    @Basic
    @Column(name = "surname_cl")
    public String getSurnameCl() {
        return surnameCl;
    }

    public void setSurnameCl(String surnameCl) {
        this.surnameCl = surnameCl;
    }

    @Basic
    @Column(name = "name_cl")
    public String getNameCl() {
        return nameCl;
    }

    public void setNameCl(String nameCl) {
        this.nameCl = nameCl;
    }

    @Basic
    @Column(name = "patronymic_cl")
    public String getPatronymicCl() {
        return patronymicCl;
    }

    public void setPatronymicCl(String patronymicCl) {
        this.patronymicCl = patronymicCl;
    }

    @Basic
    @Column(name = "address_cl")
    public String getAddressCl() {
        return addressCl;
    }

    public void setAddressCl(String addressCl) {
        this.addressCl = addressCl;
    }

    @Basic
    @Column(name = "date_of_brth")
    public Date getDateOfBrth() {
        return dateOfBrth;
    }

    public void setDateOfBrth(Date dateOfBrth) {
        this.dateOfBrth = dateOfBrth;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clients clients = (Clients) o;

        if (id != null ? !id.equals(clients.id) : clients.id != null) return false;
        if (login != null ? !login.equals(clients.login) : clients.login != null) return false;
        if (password != null ? !password.equals(clients.password) : clients.password != null) return false;
        if (emailCl != null ? !emailCl.equals(clients.emailCl) : clients.emailCl != null) return false;
        if (surnameCl != null ? !surnameCl.equals(clients.surnameCl) : clients.surnameCl != null) return false;
        if (nameCl != null ? !nameCl.equals(clients.nameCl) : clients.nameCl != null) return false;
        if (patronymicCl != null ? !patronymicCl.equals(clients.patronymicCl) : clients.patronymicCl != null)
            return false;
        if (addressCl != null ? !addressCl.equals(clients.addressCl) : clients.addressCl != null) return false;
        if (dateOfBrth != null ? !dateOfBrth.equals(clients.dateOfBrth) : clients.dateOfBrth != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (emailCl != null ? emailCl.hashCode() : 0);
        result = 31 * result + (surnameCl != null ? surnameCl.hashCode() : 0);
        result = 31 * result + (nameCl != null ? nameCl.hashCode() : 0);
        result = 31 * result + (patronymicCl != null ? patronymicCl.hashCode() : 0);
        result = 31 * result + (addressCl != null ? addressCl.hashCode() : 0);
        result = 31 * result + (dateOfBrth != null ? dateOfBrth.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", emailCl='" + emailCl + '\'' +
                ", surnameCl='" + surnameCl + '\'' +
                ", nameCl='" + nameCl + '\'' +
                ", patronymicCl='" + patronymicCl + '\'' +
                ", addressCl='" + addressCl + '\'' +
                ", dateOfBrth=" + dateOfBrth +
                ", creditCardsById=" + creditCardsById +
                ", ordersById=" + ordersById +
                '}';
    }

    @OneToMany(mappedBy = "clientsByIdClient")
    public Collection<CreditCard> getCreditCardsById() {
        return creditCardsById;
    }

    public void setCreditCardsById(Collection<CreditCard> creditCardsById) {
        this.creditCardsById = creditCardsById;
    }

    @OneToMany(mappedBy = "clientsByIdClient")
    public Collection<Order> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Order> ordersById) {
        this.ordersById = ordersById;
    }
}

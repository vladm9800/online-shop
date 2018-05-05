package by.bsuir.model;

import javax.persistence.*;

@Entity
@Table(name = "credit_card", schema = "online_shop", catalog = "")
public class CreditCard {
    private Long id;
    private String creditСardNumber;
    private String cvv;
    private String expiryDate;
    private Long idClient;
    private User userByIdClient;

    public CreditCard() {
    }

    public CreditCard(String creditСardNumber, String cvv, String expiryDate) {
        this.creditСardNumber = creditСardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
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
    @Column(name = "creditСard_number")
    public String getCreditСardNumber() {
        return creditСardNumber;
    }

    public void setCreditСardNumber(String creditСardNumber) {
        this.creditСardNumber = creditСardNumber;
    }

    @Basic
    @Column(name = "cvv")
    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Basic
    @Column(name = "expiry_date")
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Basic
    @Column(name = "id_client")
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard card = (CreditCard) o;

        if (id != null ? !id.equals(card.id) : card.id != null) return false;
        if (creditСardNumber != null ? !creditСardNumber.equals(card.creditСardNumber) : card.creditСardNumber != null)
            return false;
        if (cvv != null ? !cvv.equals(card.cvv) : card.cvv != null) return false;
        if (expiryDate != null ? !expiryDate.equals(card.expiryDate) : card.expiryDate != null) return false;
        if (idClient != null ? !idClient.equals(card.idClient) : card.idClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (creditСardNumber != null ? creditСardNumber.hashCode() : 0);
        result = 31 * result + (cvv != null ? cvv.hashCode() : 0);
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "user_id", insertable = false,updatable = false)
    public User getUserByIdClient() {
        return userByIdClient;
    }

    public void setUserByIdClient(User userByIdClient) {
        this.userByIdClient = userByIdClient;
    }
}

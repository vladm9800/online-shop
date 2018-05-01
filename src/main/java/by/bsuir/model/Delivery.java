package by.bsuir.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Delivery {
    private Long id;
    private Double totalWeight;
    private Integer sumGoods;
    private Date dateOfDelivery;
    private Time timeOfDelivery;
    private String regionOfMinsk;
    private Double costOfDelivery;
    private Long idEmployee;
    private String deliveryStatus;
    private String typeOfDelivery;
    private Employees employeesByIdEmployee;

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
    @Column(name = "total_weight")
    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Basic
    @Column(name = "sum_goods")
    public Integer getSumGoods() {
        return sumGoods;
    }

    public void setSumGoods(Integer sumGoods) {
        this.sumGoods = sumGoods;
    }

    @Basic
    @Column(name = "date_of_delivery")
    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    @Basic
    @Column(name = "time_of_delivery")
    public Time getTimeOfDelivery() {
        return timeOfDelivery;
    }

    public void setTimeOfDelivery(Time timeOfDelivery) {
        this.timeOfDelivery = timeOfDelivery;
    }

    @Basic
    @Column(name = "region_of_Minsk")
    public String getRegionOfMinsk() {
        return regionOfMinsk;
    }

    public void setRegionOfMinsk(String regionOfMinsk) {
        this.regionOfMinsk = regionOfMinsk;
    }

    @Basic
    @Column(name = "cost_of_delivery")
    public Double getCostOfDelivery() {
        return costOfDelivery;
    }

    public void setCostOfDelivery(Double costOfDelivery) {
        this.costOfDelivery = costOfDelivery;
    }

    @Basic
    @Column(name = "id_employee")
    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "delivery_status")
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Basic
    @Column(name = "type_of_delivery")
    public String getTypeOfDelivery() {
        return typeOfDelivery;
    }

    public void setTypeOfDelivery(String typeOfDelivery) {
        this.typeOfDelivery = typeOfDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Delivery delivery = (Delivery) o;

        if (id != null ? !id.equals(delivery.id) : delivery.id != null) return false;
        if (totalWeight != null ? !totalWeight.equals(delivery.totalWeight) : delivery.totalWeight != null)
            return false;
        if (sumGoods != null ? !sumGoods.equals(delivery.sumGoods) : delivery.sumGoods != null) return false;
        if (dateOfDelivery != null ? !dateOfDelivery.equals(delivery.dateOfDelivery) : delivery.dateOfDelivery != null)
            return false;
        if (timeOfDelivery != null ? !timeOfDelivery.equals(delivery.timeOfDelivery) : delivery.timeOfDelivery != null)
            return false;
        if (regionOfMinsk != null ? !regionOfMinsk.equals(delivery.regionOfMinsk) : delivery.regionOfMinsk != null)
            return false;
        if (costOfDelivery != null ? !costOfDelivery.equals(delivery.costOfDelivery) : delivery.costOfDelivery != null)
            return false;
        if (idEmployee != null ? !idEmployee.equals(delivery.idEmployee) : delivery.idEmployee != null) return false;
        if (deliveryStatus != null ? !deliveryStatus.equals(delivery.deliveryStatus) : delivery.deliveryStatus != null)
            return false;
        if (typeOfDelivery != null ? !typeOfDelivery.equals(delivery.typeOfDelivery) : delivery.typeOfDelivery != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (totalWeight != null ? totalWeight.hashCode() : 0);
        result = 31 * result + (sumGoods != null ? sumGoods.hashCode() : 0);
        result = 31 * result + (dateOfDelivery != null ? dateOfDelivery.hashCode() : 0);
        result = 31 * result + (timeOfDelivery != null ? timeOfDelivery.hashCode() : 0);
        result = 31 * result + (regionOfMinsk != null ? regionOfMinsk.hashCode() : 0);
        result = 31 * result + (costOfDelivery != null ? costOfDelivery.hashCode() : 0);
        result = 31 * result + (idEmployee != null ? idEmployee.hashCode() : 0);
        result = 31 * result + (deliveryStatus != null ? deliveryStatus.hashCode() : 0);
        result = 31 * result + (typeOfDelivery != null ? typeOfDelivery.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id", nullable = false, insertable = false,updatable = false)
    public Employees getEmployeesByIdEmployee() {
        return employeesByIdEmployee;
    }

    public void setEmployeesByIdEmployee(Employees employeesByIdEmployee) {
        this.employeesByIdEmployee = employeesByIdEmployee;
    }


}

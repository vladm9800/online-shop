package by.bsuir.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.List;

@Entity
public class Order {
    private Long id;
    private Date orderDate;
    private Time timeOfOrder;
    private String orderStatus;
    private String orderCost;
    private String payment;
    private String delivery;
    private Long idClient;
    private Long idEmployee;
    private Long idDeliveryPlace;
    private Delivery deliveryById;
    private Clients clientsByIdClient;
    private Employees employeesByIdEmployee;
    private DeliveryPlace deliveryPlaceByIdDeliveryPlace;

    private List<Goods> goodsById;

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
    @Column(name = "order_date")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "time_of_order")
    public Time getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setTimeOfOrder(Time timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    @Basic
    @Column(name = "order_status")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "order_cost")
    public String getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(String orderCost) {
        this.orderCost = orderCost;
    }

    @Basic
    @Column(name = "payment")
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "delivery")
    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    @Basic
    @Column(name = "id_client")
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
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
    @Column(name = "id_delivery_place")
    public Long getIdDeliveryPlace() {
        return idDeliveryPlace;
    }

    public void setIdDeliveryPlace(Long idDeliveryPlace) {
        this.idDeliveryPlace = idDeliveryPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (orderDate != null ? !orderDate.equals(order.orderDate) : order.orderDate != null) return false;
        if (timeOfOrder != null ? !timeOfOrder.equals(order.timeOfOrder) : order.timeOfOrder != null) return false;
        if (orderStatus != null ? !orderStatus.equals(order.orderStatus) : order.orderStatus != null) return false;
        if (orderCost != null ? !orderCost.equals(order.orderCost) : order.orderCost != null) return false;
        if (payment != null ? !payment.equals(order.payment) : order.payment != null) return false;
        if (delivery != null ? !delivery.equals(order.delivery) : order.delivery != null) return false;
        if (idClient != null ? !idClient.equals(order.idClient) : order.idClient != null) return false;
        if (idEmployee != null ? !idEmployee.equals(order.idEmployee) : order.idEmployee != null) return false;
        if (idDeliveryPlace != null ? !idDeliveryPlace.equals(order.idDeliveryPlace) : order.idDeliveryPlace != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (timeOfOrder != null ? timeOfOrder.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (orderCost != null ? orderCost.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (delivery != null ? delivery.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        result = 31 * result + (idEmployee != null ? idEmployee.hashCode() : 0);
        result = 31 * result + (idDeliveryPlace != null ? idDeliveryPlace.hashCode() : 0);
        return result;
    }

//    @OneToOne
//    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
//    public Delivery getDeliveryById() {
//        return deliveryById;
//    }
//
//    public void setDeliveryById(Delivery deliveryById) {
//        this.deliveryById = deliveryById;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "id_client", referencedColumnName = "id", nullable = false)
//    public Clients getClientsByIdClient() {
//        return clientsByIdClient;
//    }
//
//    public void setClientsByIdClient(Clients clientsByIdClient) {
//        this.clientsByIdClient = clientsByIdClient;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "id_employee", referencedColumnName = "id", nullable = false)
//    public Employees getEmployeesByIdEmployee() {
//        return employeesByIdEmployee;
//    }
//
//    public void setEmployeesByIdEmployee(Employees employeesByIdEmployee) {
//        this.employeesByIdEmployee = employeesByIdEmployee;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "id_delivery_place", referencedColumnName = "id", nullable = false)
//    public DeliveryPlace getDeliveryPlaceByIdDeliveryPlace() {
//        return deliveryPlaceByIdDeliveryPlace;
//    }
//
//    public void setDeliveryPlaceByIdDeliveryPlace(DeliveryPlace deliveryPlaceByIdDeliveryPlace) {
//        this.deliveryPlaceByIdDeliveryPlace = deliveryPlaceByIdDeliveryPlace;
//    }

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "order_goods",joinColumns = @JoinColumn(name ="id_order" ),inverseJoinColumns = @JoinColumn(name = "id_goods")))
//    public List<Goods> getGoodsById(){
//        return goodsById;
//    }

//    public void setGoodsById(List<Goods> goodsById) {
//        this.goodsById = goodsById;
//    }
}

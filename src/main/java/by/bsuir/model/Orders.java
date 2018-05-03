package by.bsuir.model;

import by.bsuir.model.Clients;
import by.bsuir.model.DeliveryPlace;
import by.bsuir.model.Goods;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Date;
import java.util.List;

@Entity
public class Orders implements Serializable {
    private Long id;
    private String orderDate;
    private String timeOfOrder;
    private String orderStatus;
    private Double orderCost;
    private String payment;
    private String delivery;
    private Long idClient;
    private Long idDeliveryPlace;
    private Clients clientsByIdClient;
    private DeliveryPlace deliveryPlaceByIdDeliveryPlace;
    private List<Goods> goods;


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
    @Column(name = "order_date")
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "time_of_order")
    public String getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setTimeOfOrder(String timeOfOrder) {
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
    public Double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(Double orderCost) {
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

        Orders orders = (Orders) o;

        if (id != null ? !id.equals(orders.id) : orders.id != null) return false;
        if (orderDate != null ? !orderDate.equals(orders.orderDate) : orders.orderDate != null) return false;
        if (timeOfOrder != null ? !timeOfOrder.equals(orders.timeOfOrder) : orders.timeOfOrder != null) return false;
        if (orderStatus != null ? !orderStatus.equals(orders.orderStatus) : orders.orderStatus != null) return false;
        if (orderCost != null ? !orderCost.equals(orders.orderCost) : orders.orderCost != null) return false;
        if (payment != null ? !payment.equals(orders.payment) : orders.payment != null) return false;
        if (delivery != null ? !delivery.equals(orders.delivery) : orders.delivery != null) return false;
        if (idClient != null ? !idClient.equals(orders.idClient) : orders.idClient != null) return false;
        if (idDeliveryPlace != null ? !idDeliveryPlace.equals(orders.idDeliveryPlace) : orders.idDeliveryPlace != null)
            return false;
        if (clientsByIdClient != null ? !clientsByIdClient.equals(orders.clientsByIdClient) : orders.clientsByIdClient != null)
            return false;
        if (deliveryPlaceByIdDeliveryPlace != null ? !deliveryPlaceByIdDeliveryPlace.equals(orders.deliveryPlaceByIdDeliveryPlace) : orders.deliveryPlaceByIdDeliveryPlace != null)
            return false;
        return goods != null ? goods.equals(orders.goods) : orders.goods == null;
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
        result = 31 * result + (idDeliveryPlace != null ? idDeliveryPlace.hashCode() : 0);
        result = 31 * result + (clientsByIdClient != null ? clientsByIdClient.hashCode() : 0);
        result = 31 * result + (deliveryPlaceByIdDeliveryPlace != null ? deliveryPlaceByIdDeliveryPlace.hashCode() : 0);
        result = 31 * result + (goods != null ? goods.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id", nullable = false, insertable = false,updatable = false)
    public Clients getClientsByIdClient() {
        return clientsByIdClient;
    }

    public void setClientsByIdClient(Clients clientsByIdClient) {
        this.clientsByIdClient = clientsByIdClient;
    }



    @ManyToOne
    @JoinColumn(name = "id_delivery_place", referencedColumnName = "id", nullable = false, insertable = false,updatable = false)
    public DeliveryPlace getDeliveryPlaceByIdDeliveryPlace() {
        return deliveryPlaceByIdDeliveryPlace;
    }

    public void setDeliveryPlaceByIdDeliveryPlace(DeliveryPlace deliveryPlaceByIdDeliveryPlace) {
        this.deliveryPlaceByIdDeliveryPlace = deliveryPlaceByIdDeliveryPlace;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "order_goods",
            joinColumns = {@JoinColumn(name = "id_order")},
            inverseJoinColumns = {@JoinColumn(name = "id_goods")})
    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}

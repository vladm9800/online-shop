package by.bsuir.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Goods {
    private Long id;
    private Double costGoods;
    private Double weightGoods;
    private Double lenght;
    private Double width;
    private Double height;
    private String description;
    private String nameGoods;
    private String goodsCategory;
    private Integer guarantee;
    private List<Orders> orders;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cost_goods")
    public Double getCostGoods() {
        return costGoods;
    }

    public void setCostGoods(Double costGoods) {
        this.costGoods = costGoods;
    }

    @Basic
    @Column(name = "weight_goods")
    public Double getWeightGoods() {
        return weightGoods;
    }

    public void setWeightGoods(Double weightGoods) {
        this.weightGoods = weightGoods;
    }

    @Basic
    @Column(name = "lenght")
    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

    @Basic
    @Column(name = "width")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height")
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "name_goods")
    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    @Basic
    @Column(name = "goods_category")
    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    @Basic
    @Column(name = "guarantee")
    public Integer getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Integer guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (id != null ? !id.equals(goods.id) : goods.id != null) return false;
        if (costGoods != null ? !costGoods.equals(goods.costGoods) : goods.costGoods != null) return false;
        if (weightGoods != null ? !weightGoods.equals(goods.weightGoods) : goods.weightGoods != null) return false;
        if (lenght != null ? !lenght.equals(goods.lenght) : goods.lenght != null) return false;
        if (width != null ? !width.equals(goods.width) : goods.width != null) return false;
        if (height != null ? !height.equals(goods.height) : goods.height != null) return false;
        if (description != null ? !description.equals(goods.description) : goods.description != null) return false;
        if (nameGoods != null ? !nameGoods.equals(goods.nameGoods) : goods.nameGoods != null) return false;
        if (goodsCategory != null ? !goodsCategory.equals(goods.goodsCategory) : goods.goodsCategory != null)
            return false;
        if (guarantee != null ? !guarantee.equals(goods.guarantee) : goods.guarantee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (costGoods != null ? costGoods.hashCode() : 0);
        result = 31 * result + (weightGoods != null ? weightGoods.hashCode() : 0);
        result = 31 * result + (lenght != null ? lenght.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (nameGoods != null ? nameGoods.hashCode() : 0);
        result = 31 * result + (goodsCategory != null ? goodsCategory.hashCode() : 0);
        result = 31 * result + (guarantee != null ? guarantee.hashCode() : 0);
        return result;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "order_goods",
            joinColumns = {@JoinColumn(name = "id_goods")},
            inverseJoinColumns = {@JoinColumn(name = "id_order")})
    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
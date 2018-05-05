package by.bsuir.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Goods implements Serializable {
    private Long id;
    private String nameOfModel;
    private String pict;
    private Double cost;
    private String dateOfEntry;
    private String os;
    private String screenSize;
    private String screenResolution;
    private String ram;
    private String flashMemory;
    private Double mp;
    private Integer numOfSimCards;
    private String maxVideoResolurion;
    private String cpu;
    private Double clockSpeed;
    private Integer numOfCores;
    private Integer sizeOfProcessor;
    private String housingDesign;
    private String colorOfCase;
    private String frontPanelColor;
    private Double length;
    private Double width;
    private Double thickness;
    private Double weight;
    private String screenTechnology;
    private Integer numOfColorsOfScreen;
    private String aspectRatio;
    private Double bluetooth;
    private String audioOutput;
    private String wiFi;
    private String connectionConnector;
    private String batteryType;
    private Integer batteryCapacity;
    private Integer talkTime;

    private List<Orders> orders;

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
    @Column(name = "cost")
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "pict")
    public String getPict() {
        return pict;
    }

    public void setPict(String pict) {
        this.pict = pict;
    }

    @Basic
    @Column(name = "nameOfModel")
    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    @Basic
    @Column(name = "dateOfEntry")
    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    @Basic
    @Column(name = "os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Basic
    @Column(name = "screenSize")
    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Basic
    @Column(name = "screenResolution")
    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Basic
    @Column(name = "ram")
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Basic
    @Column(name = "flashMemory")
    public String getFlashMemory() {
        return flashMemory;
    }

    public void setFlashMemory(String flashMemory) {
        this.flashMemory = flashMemory;
    }

    @Basic
    @Column(name = "mp")
    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    @Basic
    @Column(name = "numOfSimCards")
    public Integer getNumOfSimCards() {
        return numOfSimCards;
    }

    public void setNumOfSimCards(Integer numOfSimCards) {
        this.numOfSimCards = numOfSimCards;
    }

    @Basic
    @Column(name = "maxVideoResolurion")
    public String getMaxVideoResolurion() {
        return maxVideoResolurion;
    }

    public void setMaxVideoResolurion(String maxVideoResolurion) {
        this.maxVideoResolurion = maxVideoResolurion;
    }

    @Basic
    @Column(name = "cpu")
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Basic
    @Column(name = "clockSpeed")
    public Double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(Double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Basic
    @Column(name = "numOfCores")
    public Integer getNumOfCores() {
        return numOfCores;
    }

    public void setNumOfCores(Integer numOfCores) {
        this.numOfCores = numOfCores;
    }

    @Basic
    @Column(name = "sizeOfProcessor")
    public Integer getSizeOfProcessor() {
        return sizeOfProcessor;
    }

    public void setSizeOfProcessor(Integer sizeOfProcessor) {
        this.sizeOfProcessor = sizeOfProcessor;
    }

    @Basic
    @Column(name = "housingDesign")
    public String getHousingDesign() {
        return housingDesign;
    }

    public void setHousingDesign(String housingDesign) {
        this.housingDesign = housingDesign;
    }

    @Basic
    @Column(name = "colorOfCase")
    public String getColorOfCase() {
        return colorOfCase;
    }

    public void setColorOfCase(String colorOfCase) {
        this.colorOfCase = colorOfCase;
    }

    @Basic
    @Column(name = "frontPanelColor")
    public String getFrontPanelColor() {
        return frontPanelColor;
    }

    public void setFrontPanelColor(String frontPanelColor) {
        this.frontPanelColor = frontPanelColor;
    }

    @Basic
    @Column(name = "length")
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
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
    @Column(name = "thickness")
    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    @Basic
    @Column(name = "weight")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "screenTechnology")
    public String getScreenTechnology() {
        return screenTechnology;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    @Basic
    @Column(name = "numOfColorsOfScreen")
    public Integer getNumOfColorsOfScreen() {
        return numOfColorsOfScreen;
    }

    public void setNumOfColorsOfScreen(Integer numOfColorsOfScreen) {
        this.numOfColorsOfScreen = numOfColorsOfScreen;
    }

    @Basic
    @Column(name = "aspectRatio")
    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    @Basic
    @Column(name = "bluetooth")
    public Double getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Double bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Basic
    @Column(name = "audioOutput")
    public String getAudioOutput() {
        return audioOutput;
    }

    public void setAudioOutput(String audioOutput) {
        this.audioOutput = audioOutput;
    }

    @Basic
    @Column(name = "wiFi")
    public String getWiFi() {
        return wiFi;
    }

    public void setWiFi(String wiFi) {
        this.wiFi = wiFi;
    }

    @Basic
    @Column(name = "connectionConnector")
    public String getConnectionConnector() {
        return connectionConnector;
    }

    public void setConnectionConnector(String connectionConnector) {
        this.connectionConnector = connectionConnector;
    }

    @Basic
    @Column(name = "batteryType")
    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    @Basic
    @Column(name = "batteryCapacity")
    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Basic
    @Column(name = "talkTime")
    public Integer getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(Integer talkTime) {
        this.talkTime = talkTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (id != null ? !id.equals(goods.id) : goods.id != null) return false;
        if (nameOfModel != null ? !nameOfModel.equals(goods.nameOfModel) : goods.nameOfModel != null) return false;
        if (pict != null ? !pict.equals(goods.pict) : goods.pict != null) return false;
        if (cost != null ? !cost.equals(goods.cost) : goods.cost != null) return false;
        if (dateOfEntry != null ? !dateOfEntry.equals(goods.dateOfEntry) : goods.dateOfEntry != null) return false;
        if (os != null ? !os.equals(goods.os) : goods.os != null) return false;
        if (screenSize != null ? !screenSize.equals(goods.screenSize) : goods.screenSize != null) return false;
        if (screenResolution != null ? !screenResolution.equals(goods.screenResolution) : goods.screenResolution != null)
            return false;
        if (ram != null ? !ram.equals(goods.ram) : goods.ram != null) return false;
        if (flashMemory != null ? !flashMemory.equals(goods.flashMemory) : goods.flashMemory != null) return false;
        if (mp != null ? !mp.equals(goods.mp) : goods.mp != null) return false;
        if (numOfSimCards != null ? !numOfSimCards.equals(goods.numOfSimCards) : goods.numOfSimCards != null)
            return false;
        if (maxVideoResolurion != null ? !maxVideoResolurion.equals(goods.maxVideoResolurion) : goods.maxVideoResolurion != null)
            return false;
        if (cpu != null ? !cpu.equals(goods.cpu) : goods.cpu != null) return false;
        if (clockSpeed != null ? !clockSpeed.equals(goods.clockSpeed) : goods.clockSpeed != null) return false;
        if (numOfCores != null ? !numOfCores.equals(goods.numOfCores) : goods.numOfCores != null) return false;
        if (sizeOfProcessor != null ? !sizeOfProcessor.equals(goods.sizeOfProcessor) : goods.sizeOfProcessor != null)
            return false;
        if (housingDesign != null ? !housingDesign.equals(goods.housingDesign) : goods.housingDesign != null)
            return false;
        if (colorOfCase != null ? !colorOfCase.equals(goods.colorOfCase) : goods.colorOfCase != null) return false;
        if (frontPanelColor != null ? !frontPanelColor.equals(goods.frontPanelColor) : goods.frontPanelColor != null)
            return false;
        if (length != null ? !length.equals(goods.length) : goods.length != null) return false;
        if (width != null ? !width.equals(goods.width) : goods.width != null) return false;
        if (thickness != null ? !thickness.equals(goods.thickness) : goods.thickness != null) return false;
        if (weight != null ? !weight.equals(goods.weight) : goods.weight != null) return false;
        if (screenTechnology != null ? !screenTechnology.equals(goods.screenTechnology) : goods.screenTechnology != null)
            return false;
        if (numOfColorsOfScreen != null ? !numOfColorsOfScreen.equals(goods.numOfColorsOfScreen) : goods.numOfColorsOfScreen != null)
            return false;
        if (aspectRatio != null ? !aspectRatio.equals(goods.aspectRatio) : goods.aspectRatio != null) return false;
        if (bluetooth != null ? !bluetooth.equals(goods.bluetooth) : goods.bluetooth != null) return false;
        if (audioOutput != null ? !audioOutput.equals(goods.audioOutput) : goods.audioOutput != null) return false;
        if (wiFi != null ? !wiFi.equals(goods.wiFi) : goods.wiFi != null) return false;
        if (connectionConnector != null ? !connectionConnector.equals(goods.connectionConnector) : goods.connectionConnector != null)
            return false;
        if (batteryType != null ? !batteryType.equals(goods.batteryType) : goods.batteryType != null) return false;
        if (batteryCapacity != null ? !batteryCapacity.equals(goods.batteryCapacity) : goods.batteryCapacity != null)
            return false;
        if (talkTime != null ? !talkTime.equals(goods.talkTime) : goods.talkTime != null) return false;
        return orders != null ? orders.equals(goods.orders) : goods.orders == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nameOfModel != null ? nameOfModel.hashCode() : 0);
        result = 31 * result + (pict != null ? pict.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (dateOfEntry != null ? dateOfEntry.hashCode() : 0);
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + (screenSize != null ? screenSize.hashCode() : 0);
        result = 31 * result + (screenResolution != null ? screenResolution.hashCode() : 0);
        result = 31 * result + (ram != null ? ram.hashCode() : 0);
        result = 31 * result + (flashMemory != null ? flashMemory.hashCode() : 0);
        result = 31 * result + (mp != null ? mp.hashCode() : 0);
        result = 31 * result + (numOfSimCards != null ? numOfSimCards.hashCode() : 0);
        result = 31 * result + (maxVideoResolurion != null ? maxVideoResolurion.hashCode() : 0);
        result = 31 * result + (cpu != null ? cpu.hashCode() : 0);
        result = 31 * result + (clockSpeed != null ? clockSpeed.hashCode() : 0);
        result = 31 * result + (numOfCores != null ? numOfCores.hashCode() : 0);
        result = 31 * result + (sizeOfProcessor != null ? sizeOfProcessor.hashCode() : 0);
        result = 31 * result + (housingDesign != null ? housingDesign.hashCode() : 0);
        result = 31 * result + (colorOfCase != null ? colorOfCase.hashCode() : 0);
        result = 31 * result + (frontPanelColor != null ? frontPanelColor.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (thickness != null ? thickness.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (screenTechnology != null ? screenTechnology.hashCode() : 0);
        result = 31 * result + (numOfColorsOfScreen != null ? numOfColorsOfScreen.hashCode() : 0);
        result = 31 * result + (aspectRatio != null ? aspectRatio.hashCode() : 0);
        result = 31 * result + (bluetooth != null ? bluetooth.hashCode() : 0);
        result = 31 * result + (audioOutput != null ? audioOutput.hashCode() : 0);
        result = 31 * result + (wiFi != null ? wiFi.hashCode() : 0);
        result = 31 * result + (connectionConnector != null ? connectionConnector.hashCode() : 0);
        result = 31 * result + (batteryType != null ? batteryType.hashCode() : 0);
        result = 31 * result + (batteryCapacity != null ? batteryCapacity.hashCode() : 0);
        result = 31 * result + (talkTime != null ? talkTime.hashCode() : 0);
        result = 31 * result + (orders != null ? orders.hashCode() : 0);
        return result;
    }

    @ManyToMany(fetch = FetchType.EAGER)
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

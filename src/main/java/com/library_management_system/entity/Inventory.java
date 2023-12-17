package com.library_management_system.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="lab_ms_inventory")
public class Inventory {

    @Id
    @Column(name = "book_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    @Column(name = "quantity_available",columnDefinition = "INT default 0")
    private int quantityAvailable;
    @Column(name = "shelf_location")
    private String shelfLocation;
    @Column(name = "acquisition_date")
    @Temporal(TemporalType.DATE)
    private Date acquisitionDate;
    @Column(name = "total_cost",columnDefinition = "double default 0")
    private Double inventoryCost;
    @Column(name = "inventory_condition")
    private String condition;

    public Inventory() {
    }

    public Inventory(Long bookId, int quantityAvailable, String shelfLocation, Date acquisitionDate, Double cost, String condition) {
        this.bookId = bookId;
        this.quantityAvailable = quantityAvailable;
        this.shelfLocation = shelfLocation;
        this.acquisitionDate = acquisitionDate;
        this.inventoryCost = cost;
        this.condition = condition;
    }


    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public Double getInventoryCost() {
        return inventoryCost;
    }

    public void setInventoryCost(Double cost) {
        this.inventoryCost = cost;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "bookId=" + bookId +
                ", quantityAvailable=" + quantityAvailable +
                ", shelfLocation='" + shelfLocation + '\'' +
                ", acquisitionDate='" + acquisitionDate + '\'' +
                ", cost=" + inventoryCost +
                ", condition='" + condition + '\'' +
                '}';
    }
}

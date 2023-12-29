package com.library_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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


}

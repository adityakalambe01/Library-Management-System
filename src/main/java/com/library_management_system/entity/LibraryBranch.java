package com.library_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lab_ms_branches")
public class LibraryBranch {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchId;
    @Column(name = "location")
    private String branchLocation;
    @Column(name = "contact_number")
    private Long branchContactNumber;

    @Column(name = "operation_hours")
    private int branchOperatingHours;
}

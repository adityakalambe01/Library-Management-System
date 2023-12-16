package com.library_management_system.entity;

import javax.persistence.*;

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

    public LibraryBranch() {
    }

    public LibraryBranch(Long branchId, String branchLocation, Long branchContactNumber, int branchOperatingHours) {
        this.branchId = branchId;
        this.branchLocation = branchLocation;
        this.branchContactNumber = branchContactNumber;
        this.branchOperatingHours = branchOperatingHours;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public Long getBranchContactNumber() {
        return branchContactNumber;
    }

    public void setBranchContactNumber(Long branchContactNumber) {
        this.branchContactNumber = branchContactNumber;
    }

    public int getBranchOperatingHours() {
        return branchOperatingHours;
    }

    public void setBranchOperatingHours(int branchOperatingHours) {
        this.branchOperatingHours = branchOperatingHours;
    }

    @Override
    public String toString() {
        return "LibraryBranch{" +
                "branchId=" + branchId +
                ", branchLocation='" + branchLocation + '\'' +
                ", branchContactNumber=" + branchContactNumber +
                ", branchOperatingHours=" + branchOperatingHours +
                '}';
    }
}

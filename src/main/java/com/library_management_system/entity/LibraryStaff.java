package com.library_management_system.entity;



import javax.persistence.*;

@Entity
@Table(name = "lab_ms_staffs")
public class LibraryStaff {
    @Id
    @Column(name = "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staffMemberID;
    @Column(name = "name")
    private String staffMemberName;
    @Column(name = "position")
    private String staffMemberPosition;
    @Column(name = "contact_number")
    private Long staffMemberContactNumber;
    @Column(name = "password")
    private String staffMemberPassword;


    public LibraryStaff() {
    }

    public LibraryStaff(Long staffMemberID, String staffMemberName, String staffMemberPosition, Long staffMemberContactNumber, String staffMemberPassword) {
        this.staffMemberID = staffMemberID;
        this.staffMemberName = staffMemberName;
        this.staffMemberPosition = staffMemberPosition;
        this.staffMemberContactNumber = staffMemberContactNumber;
        this.staffMemberPassword = staffMemberPassword;
    }

    public LibraryStaff(String staffMemberName, String staffMemberPosition, Long staffMemberContactNumber, String staffMemberPassword) {
        this.staffMemberName = staffMemberName;
        this.staffMemberPosition = staffMemberPosition;
        this.staffMemberContactNumber = staffMemberContactNumber;
        this.staffMemberPassword = staffMemberPassword;
    }

    public Long getStaffMemberID() {
        return staffMemberID;
    }

    public void setStaffMemberID(Long staffMemberID) {
        this.staffMemberID = staffMemberID;
    }

    public String getStaffMemberName() {
        return staffMemberName;
    }

    public void setStaffMemberName(String staffMemberName) {
        this.staffMemberName = staffMemberName;
    }

    public String getStaffMemberPosition() {
        return staffMemberPosition;
    }

    public void setStaffMemberPosition(String staffMemberPosition) {
        this.staffMemberPosition = staffMemberPosition;
    }

    public Long getStaffMemberContactNumber() {
        return staffMemberContactNumber;
    }

    public void setStaffMemberContactNumber(Long staffMemberContactNumber) {
        this.staffMemberContactNumber = staffMemberContactNumber;
    }

    public String getStaffMemberPassword() {
        return staffMemberPassword;
    }

    public void setStaffMemberPassword(String staffMemberPassword) {
        this.staffMemberPassword = staffMemberPassword;
    }

    @Override
    public String toString() {
        return "LibraryStaff{" +
                "staffMemberID=" + staffMemberID +
                ", staffMemberName='" + staffMemberName + '\'' +

                ", staffMemberPosition='" + staffMemberPosition + '\'' +
                ", staffMemberContactNumber=" + staffMemberContactNumber +
                ", staffMemberPassword='" + staffMemberPassword + '\'' +
                '}';
    }
}

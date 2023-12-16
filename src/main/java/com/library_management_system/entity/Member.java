package com.library_management_system.entity;

import javax.persistence.*;

@Entity
@Table(name = "lab_ms_members")
public class Member {
    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberID;
    @Column(name="name")
    private String memberName;
    @Column(name="address")
    private String memberAddress;
    @Column(name="contact_number")
    private Long memberContactNumber;
    @Column(name="email_id")
    private String memberEmailId;
    @Column(name="membership_type",columnDefinition = "varchar(255) default 'guest'")
    private String memberMembershipType;
    @Column(name="book_borrowed")
    private int memberBooksBorrowed;

    @Column(name = "pssword")
    private String password;

    public Member() {
    }

    public Member(Long memberID, String memberName, String memberAddress, Long memberContactNumber, String memberEmailId, String memberMembershipType, int memberBooksBorrowed) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.memberContactNumber = memberContactNumber;
        this.memberEmailId = memberEmailId;
        this.memberMembershipType = memberMembershipType;
        this.memberBooksBorrowed = memberBooksBorrowed;
    }


    public Long getMemberID() {
        return memberID;
    }

    public void setMemberID(Long memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public Long getMemberContactNumber() {
        return memberContactNumber;
    }

    public void setMemberContactNumber(Long memberContactNumber) {
        this.memberContactNumber = memberContactNumber;
    }

    public String getMemberEmailId() {
        return memberEmailId;
    }

    public void setMemberEmailId(String memberEmailId) {
        this.memberEmailId = memberEmailId;
    }

    public String getMemberMembershipType() {
        return memberMembershipType;
    }

    public void setMemberMembershipType(String memberMembershipType) {
        this.memberMembershipType = memberMembershipType;
    }

    public int getMemberBooksBorrowed() {
        return memberBooksBorrowed;
    }

    public void setMemberBooksBorrowed(int memberBooksBorrowed) {
        this.memberBooksBorrowed = memberBooksBorrowed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", memberName='" + memberName + '\'' +
                ", memberAddress='" + memberAddress + '\'' +
                ", memberContactNumber=" + memberContactNumber +
                ", memberEmailId='" + memberEmailId + '\'' +
                ", memberMembershipType='" + memberMembershipType + '\'' +
                ", memberBooksBorrowed=" + memberBooksBorrowed +
                ", password='" + password + '\'' +
                '}';
    }
}

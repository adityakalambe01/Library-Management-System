package com.library_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}

package com.library_management_system.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}

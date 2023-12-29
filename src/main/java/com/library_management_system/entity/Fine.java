package com.library_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lab_ms_fines")
public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long fineId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "amount",columnDefinition = "double default 0")
    private Double fineAmount;
    @Column(name = "reason")
    private String fineReason;
    @Column(name = "status",columnDefinition = "varchar(255) default 'paid'")
    private String paymentStatus;
}

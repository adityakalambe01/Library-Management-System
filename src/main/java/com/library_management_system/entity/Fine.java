package com.library_management_system.entity;

import javax.persistence.*;

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

    public Fine() {
    }

    public Fine(Long fineId, Long userId, Double fineAmount, String fineReason, String paymentStatus) {
        this.fineId = fineId;
        this.userId = userId;
        this.fineAmount = fineAmount;
        this.fineReason = fineReason;
        this.paymentStatus = paymentStatus;
    }

    public Long getFineId() {
        return fineId;
    }

    public void setFineId(Long fineId) {
        this.fineId = fineId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(Double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getFineReason() {
        return fineReason;
    }

    public void setFineReason(String fineReason) {
        this.fineReason = fineReason;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "fineId=" + fineId +
                ", userId=" + userId +
                ", fineAmount=" + fineAmount +
                ", fineReason='" + fineReason + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}

package com.library_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="lab_ms_transactions")
public class LibraryTransaction {
    @Id
    @Column(name = "transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionID;
    @Column(name = "book_id")
    private Long bookID;
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "checkout_date")
    private LocalDate checkoutDate;

    @Column(name = "return_date")
    private LocalDate returnDate;
    @Column(name = "fine_amount",columnDefinition = "double default 0")
    private Double fineAmount;

}

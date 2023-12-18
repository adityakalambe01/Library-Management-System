package com.library_management_system.entity;

import javax.persistence.*;
import java.time.LocalDate;

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


    public LibraryTransaction() {
    }

    public LibraryTransaction(Long transactionID, Long bookID, Long userID, LocalDate checkoutDate, LocalDate returnDate, Double fineAmount) {
        this.transactionID = transactionID;
        this.bookID = bookID;
        this.userID = userID;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
        this.fineAmount = fineAmount;
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(Double fineAmount) {
        this.fineAmount = fineAmount;
    }

    @Override
    public String toString() {
        return "LibraryTransaction{" +
                "transactionID=" + transactionID +
                ", bookID=" + bookID +
                ", userID=" + userID +
                ", checkoutDate=" + checkoutDate +
                ", returnDate=" + returnDate +
                ", fineAmount=" + fineAmount +
                '}';
    }
}

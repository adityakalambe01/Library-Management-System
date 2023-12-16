package com.library_management_system.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="lab_ms_transactions")
public class Transaction {

    @Id
    @Column(name = "transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionID;
    @Column(name = "book_id")
    private Long bookID;
    @Column(name = "user_id")
    private Long userID;
    @Column(name = "checkout_date")
    private Date checkoutDate;
    @Column(name = "return_date")
    private Date returnDate;
    @Column(name = "fine_amount",columnDefinition = "double default 0")
    private Double fineAmount;


    public Transaction() {
    }

    public Transaction(Long transactionID, Long bookID, Long userID, Date checkoutDate, Date returnDate, Double fineAmount) {
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

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
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
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", bookID=" + bookID +
                ", userID=" + userID +
                ", checkoutDate=" + checkoutDate +
                ", returnDate=" + returnDate +
                ", fineAmount=" + fineAmount +
                '}';
    }
}

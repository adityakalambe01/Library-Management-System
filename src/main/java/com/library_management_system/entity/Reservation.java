package com.library_management_system.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lab_ms_reservations")
public class Reservation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "book_id")
    private Long bookId;
    @Column(name = "date")
    private Date reservationDate;
    @Column(name = "status")
    private String reservationStatus;

    public Reservation() {
    }

    public Reservation(Long reservationId, Long userId, Long bookId, Date reservationDate, String reservationStatus) {
        this.reservationId = reservationId;
        this.userId = userId;
        this.bookId = bookId;
        this.reservationDate = reservationDate;
        this.reservationStatus = reservationStatus;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", reservationDate=" + reservationDate +
                ", reservationStatus='" + reservationStatus + '\'' +
                '}';
    }
}

package com.library_management_system.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lab_ms_books")
public class Book {
    @Id
    @Column(name="book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "book_title")
    private String bookName;
    @Column(name = "book_author")
    private String bookAuthor;
    @Column(name = "book_isbn")
    private Long bookISBN;
    @Column(name = "book_genre")
    private String bookGenre;
    @Column(name = "book_publication_year")
    @Temporal(TemporalType.DATE)
    private Date bookPublicationYear;
    @Column(name = "book_availabily_status")
    private Boolean bookAvailabilityStatus;

    public Book() {
    }
    public Book(String bookName, String bookAuthor, Long bookISBN, String bookGenre, Date bookPublicationYear, Boolean bookAvailabilityStatus) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.bookGenre = bookGenre;
        this.bookPublicationYear = bookPublicationYear;
        this.bookAvailabilityStatus = bookAvailabilityStatus;
    }

    public Book(Long bookId, String bookName, String bookAuthor, Long bookISBN, String bookGenre, Date bookPublicationYear, Boolean bookAvailabilityStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.bookGenre = bookGenre;
        this.bookPublicationYear = bookPublicationYear;
        this.bookAvailabilityStatus = bookAvailabilityStatus;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Long getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(Long bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public Date getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(Date bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    public Boolean getBookAvailabilityStatus() {
        return bookAvailabilityStatus;
    }

    public void setBookAvailabilityStatus(Boolean bookAvailabilityStatus) {
        this.bookAvailabilityStatus = bookAvailabilityStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookISBN=" + bookISBN +
                ", bookGenre='" + bookGenre + '\'' +
                ", bookPublicationYear=" + bookPublicationYear +
                ", bookAvailabilityStatus=" + bookAvailabilityStatus +
                '}';
    }
}

package com.library_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}

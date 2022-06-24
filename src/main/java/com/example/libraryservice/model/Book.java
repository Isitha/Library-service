package com.example.libraryservice.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
    private Long id;
    @Column(name = "Name", length = 100, nullable = false)
    private String name;
    @Column(name = "Author_Name", length = 100, nullable = false)
    private String authorName;
    @Column(name = "Date", nullable = false)
    private LocalDate date;
}

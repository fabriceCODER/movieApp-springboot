package dev.fabish.movieApp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 500)
    private String genre;
    @Column(length = 1000)
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;
}

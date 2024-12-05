package dev.fabish.movieApp.repository;

import dev.fabish.movieApp.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    //We specify movie query methods here
}

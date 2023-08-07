package dev.suryaarmy.Movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService
{
    @Autowired
    private MovieResposity movieResposity;

    public List<movies> getallMovies() {
      return movieResposity.findAll();

    }
}

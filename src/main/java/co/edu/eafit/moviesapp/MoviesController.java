package co.edu.eafit.moviesapp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.inject.Inject;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MoviesController {

  @Inject
  private final MoviesService moviesService;

  public MoviesController(MoviesService moviesService) {
    this.moviesService = moviesService;
  }
  @RequestMapping("/{movieId}")
  public @ResponseBody String getMovie(@PathVariable("movieId") String movieId) {
    return moviesService.getMovie(movieId);
  }
}

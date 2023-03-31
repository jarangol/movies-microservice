package co.edu.eafit.moviesapp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MoviesController {

  private final MoviesService moviesService;

  public MoviesController(MoviesService moviesService) {
    this.moviesService = moviesService;
  }
  @RequestMapping("/movies/{movieId}")
  public @ResponseBody String getMovie(@PathVariable("movieId") String movieId) {
    return moviesService.getMovie(movieId);
  }

  @RequestMapping("/movies")
  public @ResponseBody String getMovies() {
    return moviesService.getMovies();
  }
}

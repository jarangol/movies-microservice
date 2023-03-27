package co.edu.eafit.moviesapp;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class MoviesService {
  private final RestTemplate restTemplate;


  public MoviesService() {
    this.restTemplate = new RestTemplate();
  }

  public MoviesService(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  };

  public String getMovie(String movieId) {
    String url = "http://159.122.183.100:32341/api/v1.0/films/" + movieId;
    return this.restTemplate.getForObject(url, String.class);
  }
}

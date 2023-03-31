package co.edu.eafit.moviesapp;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class MoviesService {
  private final RestTemplate restTemplate;
  private final String host;

  public MoviesService() {
    this.restTemplate = new RestTemplate();
    this.host = "http://159.122.183.100:32341/api/v1.0";
  }

  public MoviesService(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
    this.host = "http://159.122.183.100:32341/api/v1.0";
  };

  public String getMovie(String movieId) {
    String url = this.host + "/films/" + movieId;
    return this.restTemplate.getForObject(url, String.class);
  }

  public String getMovies() {
    String url = this.host + "/films/";
    return this.restTemplate.getForObject(url, String.class);
  }
}

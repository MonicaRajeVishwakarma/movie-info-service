package basics.tech.movieinfoservice.controller;

import basics.tech.movieinfoservice.model.Movie;
import basics.tech.movieinfoservice.model.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("{movieId}")
    public Movie getMoveInfo(@PathVariable("movieId") String movieId){
        MovieSummary movieSummary =
                restTemplate.
                        getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey,MovieSummary.class);
        System.out.println(restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey,MovieSummary.class));
        return new Movie(movieId,movieSummary.getTitle(),movieSummary.getOverView());
    }

}

package basics.tech.movieinfoservice.model;

public class Movie {

    private String movieId;
    private String name;

    private String overview;

    public Movie() {
    }

    public String getOverView() {
        return overview;
    }

    public void setOverView(String overView) {
        this.overview = overView;
    }



    public Movie(String movieId, String name,String overView) {
        this.movieId = movieId;
        this.name = name;
        this.overview = overView;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

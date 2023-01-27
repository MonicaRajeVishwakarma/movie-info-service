package basics.tech.movieinfoservice.model;

public class MovieSummary {

    private String title;
    private String overview;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverView() {
        return overview;
    }

    public void setOverView(String overView) {
        this.overview = overView;
    }

    public MovieSummary(String title, String overView) {
        this.title = title;
        this.overview = overView;
    }

    public MovieSummary() {
    }
}

package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category){
        List<Movie> filtered = new ArrayList<>();
        for (Movie actual : movies){
            if (actual.getCategory() == category && actual.getRating() > 3){
                filtered.add(actual);
            }
        }
        return filtered;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }
}

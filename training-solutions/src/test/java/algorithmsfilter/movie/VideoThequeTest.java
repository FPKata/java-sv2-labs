package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {
    VideoTheque vt = new VideoTheque();

    @Test
    void testGetGoodMoviesWithCategoryGiven(){
        vt.addMovie(new Movie("Forrest Gump", Category.COMEDY, 5));
        vt.addMovie(new Movie("Rambo", Category.ACTION, 4));
        vt.addMovie(new Movie("Casino", Category.COMEDY, 3));
        vt.addMovie(new Movie("Shrek", Category.ANIMATION, 5));
        vt.addMovie(new Movie("Lion King", Category.ANIMATION, 4));
        vt.addMovie(new Movie("Shrek2", Category.ANIMATION, 5));
        vt.addMovie(new Movie("Shrek3", Category.ANIMATION, 4));
        vt.addMovie(new Movie("Shrek4", Category.ANIMATION, 3));

        List<Movie> filtered = vt.getGoodMoviesWithCategoryGiven(Category.ANIMATION);
        assertEquals(4, filtered.size());
    }

}
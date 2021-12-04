package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void testCreate(){
        Movie movie = new Movie("Forrest Gump", Category.COMEDY, 5);

        assertEquals("Forrest Gump", movie.getTitle());
        assertEquals(Category.COMEDY, movie.getCategory());
        assertEquals(5, movie.getRating());
    }
}
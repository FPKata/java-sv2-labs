package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    Recipe recipe = new Recipe();
    @Test
    void testAddIngredients(){
        Path path = Path.of("src/test/resources/recipe.txt");
        recipe.addIngredients(path);

        assertEquals(10, recipe.getIngredients().size());
        assertEquals("alma", recipe.getIngredients().get(8));
    }

    @Test
    void testAddIngredientsNoExistingFile(){
        Path path = Path.of("src/test/resources/recipe.tx");

        IllegalStateException ise = assertThrows(IllegalStateException.class, ()-> recipe.addIngredients(path));
        assertEquals("Cannot read file", ise.getMessage());
    }
}
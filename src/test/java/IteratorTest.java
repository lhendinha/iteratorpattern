import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {
    private ShapeStorage storage;

    @BeforeEach
    void setUp() {
        storage = new ShapeStorage();
    }

    @Test
    void testShapesOne() {
        System.out.println("Running: testShapesOne");

        storage.addShape("Polygon");
        storage.addShape("Hexagon");

        ShapeIterator iterator = new ShapeIterator(storage.getShapes());

        while(iterator.hasNext()) {
            assertEquals(iterator.next().getName(), "Polygon");
            assertEquals(iterator.next().getName(), "Hexagon");
        }
    }

    @Test
    void testShapesTwo() {
        System.out.println("Running: testShapesTwo");

        storage.addShape("Rectangle");
        storage.addShape("Square");

        ShapeIterator iterator = new ShapeIterator(storage.getShapes());

        while(iterator.hasNext()) {
            assertEquals(iterator.next().getName(), "Rectangle");
            assertEquals(iterator.next().getName(), "Square");
        }
    }
}

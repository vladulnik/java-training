import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CarSetTest {

    private CarSet<Car> carSet;

    @BeforeEach
    void setUp() {
        carSet = new CarHashSet<>();
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("Brand" + i, i));
        }
    }

    @Test
    void whenAdd3SimilarObjectsThenSizeIncreaseBy1() {
        assertEquals(100, carSet.size());
        assertTrue(carSet.add(new Car("BMW", 10)));
        assertFalse(carSet.add(new Car("BMW", 10)));
        assertFalse(carSet.add(new Car("BMW", 10)));
        assertEquals(101, carSet.size());
    }

    @Test
    void whenElementRemovedThenSizeDecreased() {
        assertTrue(carSet.remove(new Car("Brand30", 30)));
        assertEquals(99, carSet.size());
        assertFalse(carSet.remove(new Car("Brand30", 30)));
        assertEquals(99, carSet.size());
    }

    @Test
    void size() {
    }

    @Test
    void whenSetClearedThenSize0() {
        carSet.clear();
        assertEquals(0, carSet.size());
    }
}
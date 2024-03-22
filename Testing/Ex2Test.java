import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2Test {
    @Test
    public void canConvertCSVToPerson() {
        Ex2 person = Ex2.convert("Billy, Bob, 1234 Big St., Big City, California, 90210");
        assertEquals(person, new Ex2("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"));
    }

    @Test
    public void canConvertMultiCSVtoPeople() {
        String multiCSV = "Billy, Bob, 1234 Big St., Big City, California, 90210|Jackson, Joe, 4321 Little St., Little City, New York, 20109";
        Ex2[] people = Ex2.convertMulti(multiCSV);
        Ex2[] expPeople = {
                new Ex2("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"),
                new Ex2("Jackson", "Joe", "4321 Little St.", "Little City", "New York", "20109")
        };
        assertArrayEquals(expPeople, people);
    }
}

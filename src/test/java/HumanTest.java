import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void multiplication() {
        Human human=new Human();


        assertEquals(35,human.multiplication(5,7), "ne tak suka!");
    }
}
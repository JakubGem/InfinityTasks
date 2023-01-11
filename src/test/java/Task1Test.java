import Task1.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void nullStringShouldReturnZero(){
        var task1 = new Task1();
        assertEquals(0, task1.countNumbers(null));
    }

    @Test
    void separatorAsFirstCharacterIsNotThrowingAnyError(){
        var task1 = new Task1();
        assertEquals(67, task1.countNumbers(";67+"));
    }

    @Test
    void addingNumbersIsWorkingProperly(){
        var task1 = new Task1();
        assertTrue(task1.countNumbers("67;2;1+")==70);
    }

    @Test
    void subtractingNumbersIsWorkingProperly(){
        var task1 = new Task1();
        assertTrue(task1.countNumbers("67;2;1-") == 64);
    }

    @Test
    void stringWithoutAdditionSignShouldReturnZero(){
        var task1 = new Task1();
        assertEquals(0, task1.countNumbers("8;9;77.9;"));
    }

    @Test
    void stringWithoutSubtractionSignShouldReturnZero(){
        var task1 = new Task1();
        assertEquals(0, task1.countNumbers("8;9;77.9;"));
    }

    @Test
    void stringWithOnlyOneNumberShouldReturnThatNumber(){
        var task1 = new Task1();
        assertEquals(0, task1.countNumbers(".9;"));
    }

    @Test
    void occurrencesOfNotSpecifiedCharactersShouldNotThrowAnyError(){
        var task1 = new Task1();
        assertEquals(10, task1.countNumbers(";<1>?;'[]{}.9;+"));
    }

    @Test
    void multipleOccurrencesOfNotNumbersCharactersShouldNotThrowAnyError(){
        var task1 = new Task1();
        assertEquals(25, task1.countNumbers(";<10>?;'[1]{5}.9;+"));
    }

}
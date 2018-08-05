package pl.zajeca1.Zoo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PolarBearTest {
    @Test
    void sholudBeAliveAfterCreation() {
        Animal animal = new PolarBear();

        assertTrue(animal.isAlive());
    }

    @Test
    void sholudBeAliveAfterEating() {
        Animal animal = new PolarBear();

        animal.eat();

        assertTrue(animal.isAlive());
    }

    @Test
    void sholudBeDeadIfEat11DaysBefore() {
        Animal animal = spy(new PolarBear());

        LocalDateTime value = LocalDateTime.now().minusDays(11);
        when(animal.getLastTime()).thenReturn(value);

        assertFalse(animal.isAlive());
    }

    @Test
    public void should() {
        // given
        
        // when
        
        // then
    }

}
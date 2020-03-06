package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CashbackHackServiceTest {
    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroIfAmountMultiplicity1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
	
	@Test
	void shuldReturnExeption() {
		CashbackHackService service = new CashbackHackService();
		int amount = -100;
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
		service.remain(amount));
		assertEquals("amount must be greater than zero", exception.getMessage());
	}
}




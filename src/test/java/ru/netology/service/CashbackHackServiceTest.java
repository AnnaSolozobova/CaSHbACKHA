package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBelowLimit() {
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLimit() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
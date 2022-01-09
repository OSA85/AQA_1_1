package ru.netology.Service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCashbackHackServiceIf0() {
        int amount = 0;
        int expected = 1000;

        assertEquals(service.remain(amount), expected);

    }


    @Test
    public void shouldCashbackHackServiceBelow1000() {
        int amount = 500;
        int expected = 500;

        assertEquals(service.remain(amount), expected);

    }
    @Test
    public void shouldCashbackHackService999() {
        int amount = 999;
        int expected = 1;

        assertEquals(service.remain(amount), expected);

    }
    @Test
    public void shouldCashbackHackServiceBorder1000() {
        int amount = 1_000;
        int expected = 0;

        assertEquals(service.remain(amount), expected);

    }

    @Test
    public void shouldCashbackHackService1001() {
        int amount = 1_001;
        int expected = 999;

        assertEquals(service.remain(amount), expected);

    }

    @Test
    public void shouldCashbackHackServiceMore1000() {
        int amount = 1_700;
        int expected = 300;

        assertEquals(service.remain(amount), expected);

    }

}
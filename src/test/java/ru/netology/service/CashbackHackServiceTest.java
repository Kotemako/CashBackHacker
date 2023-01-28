package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void calculateServiceInTheBoundary () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1550;

        int actual = service.remain(amount);
        int expected = 450;
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateServiceNotInTheBoundary () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
}
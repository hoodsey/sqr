package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForCorrectValue() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int first = 200;
        int end = 300;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(first, end);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForInCorrectValue() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int first = 500;
        int end = 100;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(first, end);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

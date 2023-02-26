package ru.netology.sqr;

public class SQRService {
    public int calculate(int first, int end) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            int coubed = i * i;
            if (first < coubed & coubed < end) {
                result = result + 1;
            }
        }
        return result;
    }
}

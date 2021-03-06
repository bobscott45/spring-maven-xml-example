package dev.robertscott.springmavenexample;

import java.util.Random;

public class Feedback implements ReportingService {
    private String[] fortunes = {
       "You need to watch your diet",
       "You need to spend more time at the gym",
       "Cut out the beer."
    };

    @Override
    public String getReport() {
        Random random = new Random();
        int index = random.nextInt(3);
        return fortunes[index];
    }
}

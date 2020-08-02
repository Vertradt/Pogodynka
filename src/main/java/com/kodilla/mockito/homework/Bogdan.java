package main.java.com.kodilla.mockito.homework;

import javax.management.Notification;

public class Bogdan implements Subscriber {

    @Override
    public String toString() {
        return "Bogdan";
    }

    @Override
    public boolean receiveNotification(WeatherNotification weatherNotification) {
        return false;
    }

    @Override
    public boolean removeNotification(WeatherNotification weatherNotification) {
        return false;
    }
}

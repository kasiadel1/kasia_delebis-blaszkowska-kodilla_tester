package com.kodilla.collections.adv.homework;

public class Task {
  protected final   String title;
   protected final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}

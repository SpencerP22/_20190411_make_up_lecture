package edu.missouriwestern.spalmeter.csc254.publications;

import java.time.LocalDate;

public class Publication implements Comparable<Publication> {
    private String title;
    private LocalDate firstPrinted;

    public Publication(String title, LocalDate firstPrinted) {
        this.title = title;
        this.firstPrinted = firstPrinted;
    }
    public Publication(String title, int year, int month, int day) {
        this.title = title;
        firstPrinted = LocalDate.of(year, month, day);
    }
    public Publication(String title) {
        this.title = title;
        firstPrinted = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getFirstPrinted() {
        return firstPrinted;
    }

    public void setFirstPrinted(LocalDate firstPrinted) {
        this.firstPrinted = firstPrinted;
    }
    public void setFirstprinted(int year, int month, int day) {
        firstPrinted = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", firstPrinted=" + firstPrinted +
                '}';
    }
    @Override
    public int compareTo(Publication other) {
        int result = this.title.compareToIgnoreCase(other.title);
        if(result == 0)
            result = this.firstPrinted.compareTo(other.firstPrinted);
        return result;
    }

}

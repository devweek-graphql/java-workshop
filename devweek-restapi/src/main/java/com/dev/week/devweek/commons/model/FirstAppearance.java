package com.dev.week.devweek.commons.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FIRST_APPEARANCES")
public class FirstAppearance {

    @Id
    @Column(name = "COMIC_NAME")
    private String comicName;

    @Column(name = "YEAR")
    private String year;

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

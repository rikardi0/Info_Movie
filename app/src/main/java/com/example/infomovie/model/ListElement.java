package com.example.infomovie.model;

import java.time.LocalDate;
import java.util.List;

public class ListElement {
    public ListElement(String backdropPath, String overview, String posterPath, String releaseDate, String title, double voteAverage) {
        this.backdropPath = backdropPath;
        this.overview = overview;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
        this.title = title;
        this.voteAverage = voteAverage;
    }

    private String backdropPath;


    private String overview;
    private String posterPath;
    private String releaseDate;
    private String title;
    private double voteAverage;


    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String value) {
        this.backdropPath = value;
    }


    public String getOverview() {
        return overview;
    }

    public void setOverview(String value) {
        this.overview = value;
    }


    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String value) {
        this.posterPath = value;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String value) {
        this.releaseDate = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }


    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double value) {
        this.voteAverage = value;
    }


}

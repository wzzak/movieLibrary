package org.example.models;

import java.util.List;

public class Movie {

    private String Title;
    private Director Director;
    private List<Actor> actorList;

    public Movie(String title, org.example.models.Director director, List<Actor> actorList) {
        Title = title;
        Director = director;
        this.actorList = actorList;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public org.example.models.Director getDirector() {
        return Director;
    }

    public void setDirector(org.example.models.Director director) {
        Director = director;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Title='" + Title + '\'' +
                ", Director=" + Director +
                ", actorList=" + actorList +
                '}';
    }
}


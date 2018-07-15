package com.example.hannabotar.listviewapp.model;

public class Album {

    private Long id;
    private String artist;
    private String name;

    public Album(Long id, String artist, String name) {
        this.id = id;
        this.artist = artist;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

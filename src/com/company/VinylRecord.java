package com.company;

public class  VinylRecord {
    private String artist;
    private String genre;
    private String albumTitle;
    private int copies;

    public String getAlbumTitle() {
        return albumTitle;
    }

    public boolean trySetAlbumTitle(String albumTitle) {
        if(albumTitle==null)
            return false;
        this.albumTitle = albumTitle;
        return true;
    }

    public String getArtist() {
        return artist;
    }

    public boolean trySetArtist(String artist) {
        if(artist==null)
            return false;
        this.artist = artist;
        return true;
    }

    public String getGenre() {
        return genre;
    }

    public boolean trySetGenre(String genre) {
        if(genre==null)
            return false;
        this.genre = genre;
    return true;
    }

    public int getCopies() {
        return copies;
    }

    public boolean trySetCopies(int copies) {
        if(copies<0)
            return false;
        this.copies = copies;
    return true;
    }
}

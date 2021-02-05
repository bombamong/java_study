package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(Song song) {
        int position = findSong(song);
        if(position >= 0) {
            System.out.println(song.getTitle() + " is already in this album.");
            return false;
        }
        this.songs.add(song);
        System.out.println("Added " + song.getTitle() + " to " + this.name);
        return true;
    }

    public boolean addSong(String songTitle, double songDuration) {
        Song song = new Song(songTitle, songDuration);
         return addSong(song);
    }

    public void printSongs() {
        int position = 1;
        if(this.songs.size() == 0){
            System.out.println("No songs in album " + this.name);
        }
        else {
            for(Song song : songs) {
                System.out.println(position + " " + song.getTitle());
                position++;
            }
        }
    }

    private int findSong(String songName) {
        for(int i = 0; i < songs.size(); i++) {
            if(songs.get(i).getTitle().equals(songName)) return i;
        }
        return -1;
    }

    private int findSong(Song song) {
        return songs.indexOf(song);
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        int index = findSong(songTitle);
       return  addToPlaylist((index + 1), playlist);
    }

}

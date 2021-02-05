package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	    Album album1 = new Album("Album1", "Artist1");
	    album1.addSong(new Song("Song1", 1.01));
	    album1.addSong(new Song("Song2", 1.02));
	    album1.addSong(new Song("Song3", 1.03));
	    album1.addSong(new Song("Song4", 1.04));
	    album1.addSong(new Song("Song5", 1.05));
	    albums.add(album1);

	    LinkedList<Song> playlist = new LinkedList<Song>();
	    albums.get(0).addToPlaylist("Song1", playlist);
	    albums.get(0).addToPlaylist("Song2", playlist);
	    albums.get(0).addToPlaylist("Song3", playlist);
	    albums.get(0).addToPlaylist("Song4", playlist);
	    albums.get(0).addToPlaylist("Song5", playlist);

	    play(playlist);
    }

    public static void play(LinkedList<Song> playlist) {
    	Scanner scanner = new Scanner(System.in);
    	boolean quit = false;
    	boolean forward = true;
		ListIterator<Song> listIterator = playlist.listIterator();
		if(playlist.size() == 0) {
			System.out.println("No songs in playlist");
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		while(!quit) {
			System.out.print("Action: ");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
				case 0:
					System.out.println("Terminating playlist.");
					quit = true;
					break;
				case 1:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
					} else {
						System.out.println("We have reached the end of the playlist");
						forward = false;
					}
					break;
				case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else {
						System.out.println("We are at the start of the playlist");
						forward = true;
					}
					break;
				case 3:
					if(forward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now replaying " + listIterator.previous());
							forward = false;
						} else {
							System.out.println("We are at the start of the list");
						}
					} else {
						if(listIterator.hasNext()) {
							System.out.println("Now replaying " + listIterator.next());
							forward = true;
						} else {
							System.out.println("We have reached the end of the list");
						}
					}
					break;
				case 4:
					printList(playlist);
					break;
				case 5:
					printMenu();
					break;
			}
		}
	}
	private static void printMenu() {
		System.out.println("--------MENU-------");
		System.out.println("Available actions: ");
		System.out.println(
				"0 - to quit \n" +
				"1 - to play next song\n" +
				"2 - to play previous song \n" +
				"3 - to replay the current song\n" +
				"4 - list songs in the playlist\n" +
				"5 - print available actions.");
		System.out.println("-------------------");
	}

	private static void printList(LinkedList<Song> playlist) {
		ListIterator<Song> listIterator = playlist.listIterator();
		System.out.println("===================================");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("===================================");
	}



}

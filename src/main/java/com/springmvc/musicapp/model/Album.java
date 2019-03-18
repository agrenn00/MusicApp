package com.springmvc.musicapp.model;

import java.util.ArrayList;
import java.util.List;

public class Album {
	List<Song> songs = new ArrayList<Song>();
	String title;
	int duration;
}

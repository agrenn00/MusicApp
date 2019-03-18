package com.springmvc.musicapp.model;

public class Song {
	
	String title;
	String artist;
	int timeSec;
	int timeMin;
	int duration;
	int trackNo;
	
	public Song() { 
		
	}

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getTimeSec() {
		return timeSec;
	}

	public void setTimeSec(int timeSec) {
		this.timeSec = timeSec;
	}

	public int getTimeMin() {
		return timeMin;
	}

	public void setTimeMin(int timeMin) {
		this.timeMin = timeMin;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTrackNo() {
		return trackNo;
	}

	public void setTrackNo(int trackNo) {
		this.trackNo = trackNo;
	}
	
	
}

package com.tinpan.model;

import java.util.List;

public class Artist {
	private List<Event> associatedEvents;
	private Profile artistProfile;
	private List<Album> albums;
	
	public List<Event> getAssociatedEvents() {
		return associatedEvents;
	}
	public void setAssociatedEvents(List<Event> associatedEvents) {
		this.associatedEvents = associatedEvents;
	}
	public Profile getArtistProfile() {
		return artistProfile;
	}
	public void setArtistProfile(Profile artistProfile) {
		this.artistProfile = artistProfile;
	}
	public List<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	

}

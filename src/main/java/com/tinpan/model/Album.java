package com.tinpan.model;

import java.util.Date;
import java.util.List;

public class Album {
	private String title;
	private Date releaseDate;
	private String coverArtLoc;
	private List<String> genres;
	private List<String> tags;
	private List<TrackInterface> tracks;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCoverArtLoc() {
		return coverArtLoc;
	}
	public void setCoverArtLoc(String coverArtLoc) {
		this.coverArtLoc = coverArtLoc;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<TrackInterface> getTracks() {
		return tracks;
	}
	public void setTracks(List<TrackInterface> tracks) {
		this.tracks = tracks;
	}
	
	
}

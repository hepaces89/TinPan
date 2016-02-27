package com.tinpan.model;

public interface TrackInterface {

	String getTitle();

	void setTitle(String title);

	long getDuration();

	void setDuration(long duration);

	MediaFileInterface getMediaFile();

	void setMediaFile(MediaFileInterface mediaFile);

}
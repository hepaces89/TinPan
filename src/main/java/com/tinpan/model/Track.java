package com.tinpan.model;

public class Track implements TrackInterface {
	private String title;
	private long duration;
	private MediaFileInterface mediaFile;
	
	/* (non-Javadoc)
	 * @see com.tinpan.model.TrackInterface#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.TrackInterface#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.TrackInterface#getDuration()
	 */
	@Override
	public long getDuration() {
		return duration;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.TrackInterface#setDuration(long)
	 */
	@Override
	public void setDuration(long duration) {
		this.duration = duration;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.TrackInterface#getMediaFile()
	 */
	@Override
	public MediaFileInterface getMediaFile() {
		return mediaFile;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.TrackInterface#setMediaFile(com.tinpan.model.MediaFileInterface)
	 */
	@Override
	public void setMediaFile(MediaFileInterface mediaFile) {
		this.mediaFile = mediaFile;
	}
	
}

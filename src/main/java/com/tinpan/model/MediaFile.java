package com.tinpan.model;

public class MediaFile implements MediaFileInterface {
	private int sizeInMb;
	private String mimeType;
	private String checkSum;
	private String filePath;
	
	
	/* (non-Javadoc)
	 * @see com.tinpan.model.MediaFileInterface#getSizeInMb()
	 */
	@Override
	public int getSizeInMb() {
		return sizeInMb;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.MediaFileInterface#setSizeInMb(int)
	 */
	@Override
	public void setSizeInMb(int sizeInMb) {
		this.sizeInMb = sizeInMb;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.MediaFileInterface#getMimeType()
	 */
	@Override
	public String getMimeType() {
		return mimeType;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.MediaFileInterface#setMimeType(java.lang.String)
	 */
	@Override
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.MediaFileInterface#getCheckSum()
	 */
	@Override
	public String getCheckSum() {
		return checkSum;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.MediaFileInterface#setCheckSum(java.lang.String)
	 */
	@Override
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.MediaFileInterface#getFilePath()
	 */
	@Override
	public String getFilePath() {
		return filePath;
	}
	/* (non-Javadoc)
	 * @see com.tinpan.model.MediaFileInterface#setFilePath(java.lang.String)
	 */
	@Override
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}

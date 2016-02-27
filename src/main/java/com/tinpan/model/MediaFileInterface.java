package com.tinpan.model;

public interface MediaFileInterface {

	int getSizeInMb();

	void setSizeInMb(int sizeInMb);

	String getMimeType();

	void setMimeType(String mimeType);

	String getCheckSum();

	void setCheckSum(String checkSum);

	String getFilePath();

	void setFilePath(String filePath);

}
package com.tinpan.model;

import java.util.List;

public class User {
	private boolean hasSignedUserAgreement;
	private List<Artist> associatedArtists;
	
	public boolean isHasSignedUserAgreement() {
		return hasSignedUserAgreement;
	}
	public void setHasSignedUserAgreement(boolean hasSignedUserAgreement) {
		this.hasSignedUserAgreement = hasSignedUserAgreement;
	}
	public List<Artist> getAssociatedArtists() {
		return associatedArtists;
	}
	public void setAssociatedArtists(List<Artist> associatedArtists) {
		this.associatedArtists = associatedArtists;
	}
	

}

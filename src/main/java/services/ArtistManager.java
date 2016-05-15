package services;

import com.tinpan.model.Artist;

public class ArtistManager {
	
	public Artist getArtistByArtistId(String artistId){
		Artist artist = new Artist();
		artist.setAlbums(null);
		artist.setArtistProfile(null);
		return artist;
	}

}

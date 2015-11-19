package pl.chiveit.photobrowser.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Photo {

	protected Photo() {

	}

	public Photo(String name, PhotoExifData exif, byte[] image) {
		this.name = name;
		this.exif = exif;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	@OneToOne
	private PhotoExifData exif;

	private byte[] image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PhotoExifData getExif() {
		return exif;
	}

	public void setExif(PhotoExifData exif) {
		this.exif = exif;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Long getId() {
		return id;
	}
}

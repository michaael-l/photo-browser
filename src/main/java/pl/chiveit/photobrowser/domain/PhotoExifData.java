package pl.chiveit.photobrowser.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.springframework.data.geo.Point;

@Entity
public class PhotoExifData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;
	
	private String description;

	private Date dateTaken;

	@Type(type = "org.hibernate.spatial.GeometryType")
	private Point location;

	public Date getDate() {
		return dateTaken;
	}

	public String getDescription() {
		return description;
	}

	public Long getId() {
		return id;
	}

	public Point getLocation() {
		return this.location;
	}

	public String getTitle() {
		return title;
	}

	public void setDate(Date date) {
		this.dateTaken = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

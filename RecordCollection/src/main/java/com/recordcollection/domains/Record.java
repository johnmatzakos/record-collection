package com.recordcollection.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;


/**
 * Created by Ioannis Matzakos on 22/03/2019.
 */

@Entity
public class Record implements DomainObject{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Version
    private Integer version;
	
	private String artist; //band or artist name
	private String album; //album title
	private int year; //release year

	@Override
    public Integer getId() {
        return id;
    }

	@Override
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    
    public String getArtist() {
    	return artist;
    }
    
    public void setArtist(String artist) {
    	this.artist=artist;
    }
    
    public String getAlbum() {
    	return album;
    }
    
    public void setAlbum(String album) {
    	this.album=album;
    }
    
    public int getYear() {
    	return year;
    }
    
    public void setYear(int year) {
    	this.year=year;
    }
}
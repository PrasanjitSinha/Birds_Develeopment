package com.bird.dao;

import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;

import com.bird.model.Bird;



public interface BirdDaoInterface {
	
	public JSONObject getAllBirds();
	
	public boolean addBird(Bird bird);
	
	public String getBirdById( String id);
	
	public boolean deleteBirdById(String id);

}

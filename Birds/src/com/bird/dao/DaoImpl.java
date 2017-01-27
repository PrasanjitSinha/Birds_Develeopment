package com.bird.dao;

import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

import com.bird.model.Bird;

@Component
public class DaoImpl implements BirdDaoInterface{

	@Override
	public JSONObject getAllBirds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addBird(Bird bird) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getBirdById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBirdById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}

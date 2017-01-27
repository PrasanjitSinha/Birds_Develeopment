package com.jersey.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bird.dao.BirdDaoInterface;
import com.bird.model.Bird;

@Path("/birds")
public class BirdJerseyResource {
	
	private BirdDaoInterface dao;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllBirds")
	public JSONObject getAllBirds() {
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = dao.getAllBirds();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addBird")
	public Response addBird(Bird bird) {
		boolean res = dao.addBird(bird);
		if(res){
			return Response.status(201).entity("Bird has been added successfully added").build();
		}
		return Response.status(404).entity("Error while adding the bird").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getBirdById")
	public Response getBirdById(@PathParam("id") String id){
		JSONObject jsonObject = new JSONObject();
		JSONParser parser = new JSONParser();
		String result  = "";
		result = dao.getBirdById(id);
		try{
			result = dao.getBirdById(id);
			jsonObject = (JSONObject) parser.parse(result);
			
		}
		catch(Exception e){
			
		}
		return Response.status(201).entity(jsonObject).build();
	}
	
	
	@GET
	@Path("/deleteBirdById")
	public Response deleteBirdById(@PathParam("id") String id){
		
		try{
			
		}catch(Exception e){
			
		}
		return null;
		
	}
	
	
	

}

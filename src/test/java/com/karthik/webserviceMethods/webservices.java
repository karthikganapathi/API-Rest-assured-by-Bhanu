package com.karthik.webserviceMethods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class webservices {

	// POST
	public static Response post (String uRI ,String JSONstring){

		RequestSpecification req = RestAssured.given().body(JSONstring);
		req.contentType(ContentType.JSON);
		Response resp=req.post(uRI);
		return resp;

	}


    //PUT
	public static Response put (String uRI ,String JSONstring){

		RequestSpecification req = RestAssured.given().body(JSONstring);
		req.contentType(ContentType.JSON);
		Response resp=req.put(uRI);
		return resp;

	}

    // GET
	public static Response get (String uRI){

		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		Response resp=req.get(uRI);
		return resp;

	}
     
	//DELETE
	public static Response delete (String uRI){

		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		Response resp=req.delete(uRI);
		return resp;

	}

}

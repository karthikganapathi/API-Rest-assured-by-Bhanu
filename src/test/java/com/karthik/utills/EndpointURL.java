package com.karthik.utills;

public enum EndpointURL {

	
	GET_POST("/get"),
	PUT_POST("/put"),
	DELETE_POST("/posts/"),
	POST_("/posts");
    
      String resourcePath;
      
       EndpointURL( String resourcePath){
        	this.resourcePath=resourcePath;
	}
        
        public String getResourcePath(){
        	return this.resourcePath;
        	
        }
        
        public String getResourcePath(String data){
        	return this.resourcePath+data;
        	
        }
        
        
        public static void main(String[] args) {
        	
        	System.out.println(FixedURL.fixURL+EndpointURL.GET_POST.getResourcePath());
			
		}
        
        }
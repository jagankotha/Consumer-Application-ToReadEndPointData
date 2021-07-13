package com.abc.Consumer_Application_ToReadEndPointData;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String url = "http://localhost:8080/Consumer-And-Provider-App/rest-points/show-on-screen/hello";
    	// 1. Create on empty Client object
    	Client c = Client.create();
    	// 2. add url to Client, get WebResource
    	WebResource wr = c.resource(url);
    	// 3. make request call, get ClientResponse
    	ClientResponse cr = wr.get(ClientResponse.class);
    	// 4. read entity from cr object
    	String str = cr.getEntity(String.class);
    	// 5. print entity
    	System.out.println(str);
    	// 6. print extra details
    	System.out.println(cr.getStatus());
    	System.out.println(cr.getStatusInfo()); 
    }
}

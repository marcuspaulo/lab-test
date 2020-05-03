package br.com.mp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/lab")
public class TestLabResource {

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Teste Lab Project" + new Date();
    }

    @GET
    @Path("/code={code}")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(@PathParam("code") String code) {
        System.out.println("code: " + code);
        return "code: " + code;
    }


}
package org.hoge.api;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/Path001")
public interface Path001Resource {
  @GET
  void generatedMethod1(@QueryParam("Query001") String query001,
      @HeaderParam("Test001") String test001);
}

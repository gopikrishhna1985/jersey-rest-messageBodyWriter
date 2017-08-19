package org.virtuSkill.jersey;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class MessageBodyWriterService {

	@GET
	@Path("/bool")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean returnBoolean() {
		return false;
	}

	@GET
	@Path("/date")
	@Produces(MediaType.TEXT_PLAIN)
	public Date returnDate() {
		return Calendar.getInstance().getTime();
	}

	@GET
	@Path("/version")
	@Produces("application/version")
	public VersionVO returnVersion() {
		VersionVO vo = new VersionVO();
		vo.setVersionNumber("0.0.1-SNAPSHOT");
		vo.setBuildNumber(1);
		vo.setBuildDate(new Date());
		vo.setGitSourceTag("jersey-rest-messageBodyWriter");
		return vo;
	}
}

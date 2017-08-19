package org.virtuSkill.jersey;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces("application/version")
public class VersionMessageBodyWriter implements MessageBodyWriter<VersionVO> {

	@Override
	public long getSize(VersionVO arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		return arg0 == VersionVO.class;
	}

	@Override
	public void writeTo(VersionVO arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream arg6) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("<api-verion><version-number>").append(arg0.getVersionNumber().toString())
				.append("</version-number>");
		sb.append("<build-number>").append(String.valueOf(arg0.getBuildNumber()))
				.append("</build-number>");
		sb.append("<build-date>").append(arg0.getBuildDate().toString())
				.append("</build-date>");
		sb.append("<git-source-tag>").append(arg0.getGitSourceTag().toString())
				.append("</git-source-tag></api-verion>");

		//DataOutputStream dos = new DataOutputStream(arg6);
		arg6.write(sb.toString().getBytes());
	}
}

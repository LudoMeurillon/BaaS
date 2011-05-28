package org.baas.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("project")
public interface ProjectChannel extends RemoteService {
	/**
	 * The client side stub for the RPC service.
	 */
	String join(String projectName);
	
	void send(String projectName, String text);
}

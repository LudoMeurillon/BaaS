package org.baas.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ProjectChannelAsync {
	/**
	 * The client side stub for the RPC service.
	 */
	void join(String projectName, AsyncCallback<String> callback);

	void send(String projectName, String text, AsyncCallback<Void> callback);
}

package org.baas.server;

import java.util.HashMap;
import java.util.Map;

import org.baas.client.ProjectChannel;

import com.google.appengine.api.channel.ChannelMessage;
import com.google.appengine.api.channel.ChannelServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ProjectChannelImpl extends RemoteServiceServlet implements ProjectChannel{

	private static Map<String, String> channelKeys;
	
	static{
		channelKeys = new HashMap<String, String>();
	}
	
	@Override
	public String join(String projectName) {
		if(!channelKeys.containsKey(projectName)){
			channelKeys.put(projectName, ChannelServiceFactory.getChannelService().createChannel(projectName));
		}
		return channelKeys.get(projectName);
	}

	@Override
	public void send(String projectName, String text) {
		ChannelServiceFactory.getChannelService().sendMessage(new ChannelMessage(projectName, text));
	}

}

package com.demo.structural.proxy;

import java.util.ArrayList;
import java.util.List;

//Proxy object
public class InternetProxy implements Internet {

	// Instance of actual object to be proxied
	private Internet internet = new InternetServiceProvider();

	private static List<String> bannedSites = new ArrayList<>();

	static {
		bannedSites.add("facebook.com");
		bannedSites.add("twitter.com");
		bannedSites.add("jobs.com");
		bannedSites.add("netflix.com");
	}

	// Here we customize our method as needed
	@Override
	public void connectToSite(String site) {
		if (!checkForBannedSites(site)) {
			internet.connectToSite(site);
		} else {
			System.out.println("Site banned:" + site);
		}

	}

	private boolean checkForBannedSites(String site) {
		return bannedSites.contains(site);
	}

}

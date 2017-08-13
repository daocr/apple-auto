package com.appleframework.auto.acquisition.vvsmart.utils;

import com.appleframework.auto.acquisition.vvsmart.model.JsonTrack;
import com.appleframework.auto.bean.location.Location;

public class LocationConversion {

	public static Location conversion(JsonTrack jtrack) {
		Location location = new Location();
		location.setAccount(jtrack.getDeviceId().toString());
		location.setDirection((double) jtrack.getDirection());
		location.setLatitude(jtrack.getLat());
		location.setLongitude(jtrack.getLng());
		location.setAltitude(0d);
		location.setSpeed((double) jtrack.getSpeed());
		String time = jtrack.getTime().substring(6, 19);
		location.setTime(Long.parseLong(time));
		return location;
	}
	
	

}

package com.zosh.service;

import java.util.List;

import com.zosh.Exception.RestaurantException;
import com.zosh.model.Events;

public interface EventsService {
	
	public Events createEvent(Events event,Long restaurantId) throws RestaurantException;
	
	public List<Events> findAllEvent();
	
	public List<Events> findRestaurantsEvent(Long id);

	public Events findById(Long id) throws Exception;

	public void deleteEvent(Long eventId) throws Exception;
	

}

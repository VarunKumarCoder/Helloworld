package com.cdc.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime dateTime;
	
	
	public String wishMessage(String user) {
		int hour=dateTime.getHour();
		if (hour<12)
			return "Good Moring "+ user;
		else if(hour<16)
			return "Good Ofternoon " + user;
		else if(hour<20)
			return "Good Evening "+ user;
		else
			return "Good NIghet "+user;		
	}
	public String findSeason() {
		int month=dateTime.getMonthValue();
		if (month>=3 && month<=6)
			return "Summer Season";
		else if (month>=7 && month<=10)
			return "Rainy season";
		else
			return "Winter Season";				
	}
	
}

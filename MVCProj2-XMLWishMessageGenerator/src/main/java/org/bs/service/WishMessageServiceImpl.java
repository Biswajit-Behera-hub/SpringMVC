package org.bs.service;

import java.util.Calendar;

public class WishMessageServiceImpl implements WishMessageService {

	@Override
	public String generateMesage() {
		var hour=0;
		
		var caledar=Calendar.getInstance();
		hour=caledar.get(Calendar.HOUR_OF_DAY);
		
		if(hour<12)
			return "Good Morning";
	    else if(hour<16)
			return "Good Noon";
    	else if(hour<20)
			return "Good Evening";
		else
			return "Good Night";
	}

}

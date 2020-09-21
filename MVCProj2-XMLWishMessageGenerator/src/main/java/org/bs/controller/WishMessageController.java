package org.bs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bs.service.WishMessageService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageController extends AbstractController {
	
	private WishMessageService service;
	
	public WishMessageController(WishMessageService service) {
		this.service=service;
		
	}
	

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String msg=null;
		msg=service.generateMesage();
		
		return new ModelAndView("result", "wsmg",msg);
	}

}

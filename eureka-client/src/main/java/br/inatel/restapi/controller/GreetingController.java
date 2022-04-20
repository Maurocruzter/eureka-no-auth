package br.inatel.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;


@RestController
@RequestMapping("/greetings")
public class GreetingController {
	
	@Autowired
	private ApplicationInfoManager applicationInfoManager;
	
	
	@GetMapping
	public String greeting() {
		
		InstanceInfo applicationInfo = applicationInfoManager.getInfo();

		
		applicationInfo.getIPAddr();
		applicationInfo.getPort();
		
		
		
		return "Greetings from a remote service with"
				+ " name = " + applicationInfo.getAppName()
				+ " IP = " + applicationInfo.getIPAddr()
				+ " Running on port = " + applicationInfo.getPort();
	}

}

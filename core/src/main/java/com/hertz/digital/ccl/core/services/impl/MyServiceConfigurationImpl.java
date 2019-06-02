package com.hertz.digital.ccl.core.services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;

import com.hertz.digital.ccl.core.services.MyServiceConfiguration;

@Component(
		immediate = true, 
		service = { MyServiceConfigurationImpl.class }, 
		configurationPolicy = ConfigurationPolicy.REQUIRE
)
@Designate(ocd = MyServiceConfiguration.class)
public class MyServiceConfigurationImpl {
	
	private String serviceName;

	private String serviceNumber;

	@Activate
	@Modified
	protected void Activate(final MyServiceConfiguration custmerconfig) {
		serviceName = custmerconfig.serviceName();
		serviceNumber = custmerconfig.serviceNumber();		
	}

	public String getServiceName() {
		return serviceName;
	}

	public String getServiceNumber() {
		return serviceNumber;
	}

}

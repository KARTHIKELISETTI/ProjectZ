package com.hertz.digital.ccl.core.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.ServletResolverConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.hertz.digital.ccl.core.beans.Customer;
import com.hertz.digital.ccl.core.services.impl.MyServiceConfigurationImpl;
import com.hertz.digital.ccl.core.utils.CCLConstants;

/**
 * CustomerDetailsServlet, used to fetch all the customer details
 * 
 * @author karthik
 * @since 12/18/2018
 *
 */
@Component(
		service = Servlet.class,
		property = {
	        ServletResolverConstants.SLING_SERVLET_METHODS + CCLConstants.EQUALS + HttpConstants.METHOD_GET,
	        ServletResolverConstants.SLING_SERVLET_PATHS + CCLConstants.EQUALS + "/bin/services/ccl/customerdetails",
	        ServletResolverConstants.SLING_SERVLET_EXTENSIONS + CCLConstants.EQUALS + CCLConstants.JSON
		}
)
public class CCLServletByPath extends SlingAllMethodsServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = LoggerFactory.getLogger(CCLServletByPath.class);
	
	@Reference
	private MyServiceConfigurationImpl myServiceConfigurationImpl;

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		LOG.info("Beginning of doGet method");
		
		LOG.info("Service name: {} and Service number: {}", myServiceConfigurationImpl.getServiceName(), myServiceConfigurationImpl.getServiceNumber());

		// Prepare customer info with dummy data
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Karthik", "Elisetti", "30", "1234512345", "A1S2D3F4", "Model S", "TS122345"));
		customers.add(new Customer("Ravi", "Raman", "30", "98763456", "A1S2D3F4", "Model X", "TS122345"));
		
		String json = new Gson().toJson(customers);
		
		// Set response
		response.setContentType("application/json");
		response.getWriter().write(json);
		
		LOG.info("Ending of doGet method");
	}
}

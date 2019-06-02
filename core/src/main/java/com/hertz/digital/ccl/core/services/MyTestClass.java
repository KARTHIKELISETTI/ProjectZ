package com.hertz.digital.ccl.core.services;

import javax.jcr.Node;

import org.apache.sling.api.resource.ValueMap;

import com.adobe.cq.sightly.WCMUsePojo;

public class MyTestClass extends WCMUsePojo {
	
	String output;
	
	String createdBy;

	@Override
	public void activate() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(this.getResource().getPath());
		/*
		 * ValueMap vm = this.getResource().adaptTo(ValueMap.class); output =
		 * vm.get("text",null); createdBy =vm.get("jcr:createdBy",null);
		 * System.out.println("Output::"+output+":"+createdBy);
		 */
		 
		output=get("param1",String.class);
		createdBy = get("param2",String.class);
		//Node n =this.getResource().adaptTo(Node.class);
	}

	public String getOutput() {
		return output;
	}

	public String getCreatedBy() {
		return createdBy;
	}
	

}

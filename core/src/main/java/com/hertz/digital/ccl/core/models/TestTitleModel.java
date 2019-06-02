package com.hertz.digital.ccl.core.models; 

import org.apache.sling.api.resource.ValueMap;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.wcm.api.Page;

public class TestTitleModel extends WCMUsePojo {
	
	private String resourcetype;
	private String lastmodified;

	public String getResourcetype() {
		return resourcetype;
	}

	public String getLastmodified() {
		return lastmodified;
	}

	@Override
	public void activate() throws Exception {
		
		ValueMap testTitle = getResource().adaptTo(ValueMap.class);
		resourcetype = testTitle.get("sling:resourceType",String.class);
		lastmodified = testTitle.get("jcr:lastModified",String.class);
		Page page = getResource().adaptTo(Page.class);
		page.get
		
	}

}

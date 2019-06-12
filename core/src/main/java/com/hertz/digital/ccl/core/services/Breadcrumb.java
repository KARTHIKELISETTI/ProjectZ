package com.hertz.digital.ccl.core.services;

import java.util.ArrayList;
import java.util.List;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.wcm.api.Page;

public class Breadcrumb extends WCMUsePojo{
	
	private List<Page> pagesList = new ArrayList<>();
	private Page parentPage;

	@Override
	public void activate() throws Exception {
		Page page = getCurrentPage();
		int depth = page.getDepth();
		for(int i=0;i<depth;i++) {
			 parentPage = page.getAbsoluteParent(i);
			 pagesList.add(parentPage);
		}
		
	}

	public List<Page> getPagesList() {
		return pagesList;
	}

}

package com.hertz.digital.ccl.core.models;

import org.apache.sling.api.resource.ValueMap;

import com.adobe.cq.sightly.WCMUsePojo;

public class TestTextModel extends WCMUsePojo {
	
	private String abc;
	private String xyz;

	public String getAbc() {
		return abc;
	}

	public String getXyz() {
		return xyz;
	}

	@Override
	public void activate() throws Exception {
		// TODO Auto-generated method stub
		ValueMap VM = getResource().adaptTo(ValueMap.class);
		abc = VM.get("text",String.class );
		xyz = VM.get("jcr:createdBy",String.class);
	}

}

package com.hertz.digital.ccl.core.models;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * Title Model class
 * 
 * @author karthik
 * @since 12/19/2018
 *
 */
@Model(adaptables = SlingHttpServletRequest.class, resourceType = "ccl/components/content/title", defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = "jackson", extensions = "json" )
public class Title {
	
    @ValueMapValue
	@Inject
	private String type;
	
    @ValueMapValue
	@Inject
	private String linkURL;
    
    @ValueMapValue
    @Named("jcr:title")
    @Inject
    private String title;

	public String getType() {
		return type;
	}

	public String getLinkURL() {
		return linkURL;
	}
	
	public String getTitle() {
		return title;
	}

}
package com.hertz.digital.ccl.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "My Service Configuration")
public @interface MyServiceConfiguration {
	
    @AttributeDefinition(name = "Service Name", description = "Enter service name", type = AttributeType.STRING)
    String serviceName() default "ServiceName";
    
    @AttributeDefinition(name = "Service number", description = "Enter service number", type = AttributeType.STRING)
    String serviceNumber() default "ServiceNumber";

}

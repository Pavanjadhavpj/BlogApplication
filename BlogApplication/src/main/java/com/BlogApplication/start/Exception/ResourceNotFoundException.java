package com.BlogApplication.start.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
   String resourceName;
   String fieldName;
   int fieldvalue;
public ResourceNotFoundException(String resourceName, String fieldName, int fieldvalue) {
	super(String.format("%s not Found with %s : %s ",resourceName, fieldName,fieldvalue));
	this.resourceName = resourceName;
	this.fieldName = fieldName;
	this.fieldvalue = fieldvalue;
}
   
}

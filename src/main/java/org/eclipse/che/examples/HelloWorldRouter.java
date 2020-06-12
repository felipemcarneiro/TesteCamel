package org.eclipse.che.examples;

import org.apache.camel.builder.RouteBuilder;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class HelloWorldRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {

        
        from("file://home/user/entrada?noop=true")
		.to("file://home/usr/saida");
        
        // implementation goes here
		System.out.println("Hello World..File.");
	}
	
}
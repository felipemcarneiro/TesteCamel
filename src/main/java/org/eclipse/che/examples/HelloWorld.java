/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class HelloWorld {
    public static void main(final String... argvs)  {
        final String a = "Che";
        System.out.println("Hello World bla2" + a + "!");

        // creating an instance for camel context
        final CamelContext context = new DefaultCamelContext();

        // creating an instance for router
        final HelloWorldRouter router = new HelloWorldRouter();

        try {

            // adding router to context
            context.addRoutes(router);

            // starting the camel context
            context.start();

            Thread.currentThread().join();

            // stopping the camel context
            //context.stop();

            //context.close();

        } catch (final Exception e) {
            e.printStackTrace();
            
		}

    }
}

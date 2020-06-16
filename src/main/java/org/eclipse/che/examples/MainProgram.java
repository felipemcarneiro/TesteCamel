package org.eclipse.che.examples;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;

import java.util.Date;

public class MainProgram {

    public static void main(String[] args) throws Exception {

        MainProgram mainProgram = new MainProgram();
        mainProgram.starCamelRouter();

    }

    public void starCamelRouter() throws Exception {
        Main main = new Main();

        //main.configure().addRoutesBuilder(new MyRouteBuilder());
        main.configure().addRoutesBuilder(new MyRouteBuilder2());
     
        //System.out.println("Starting Camel. Use ctrl + c to terminate the JVM.\n");
        main.run();
    }

    private static class MyRouteBuilder extends RouteBuilder {
        @Override
        public void configure() throws Exception {
            from("timer://foo?fixedRate=true&period=6000")
                    .process(new Processor() {
                        public void process(Exchange exchange) throws Exception {
                            System.out.println("Invoked timer at " + new Date());
                        }
                    });
        }
    }

       private static class MyRouteBuilder2 extends RouteBuilder {
        @Override
        public void configure() throws Exception {
            from("file:///home/user/inicio?noop=true")
            .to("file:///home/user/fim")
            .end()
            System.out.println("File mooved at " + new Date());
            ;
        }
    }
}
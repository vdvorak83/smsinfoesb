package ua.np.services.smsinfo.impl;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import ua.np.services.smsinfo.SmsBulkResponse;

public class ResponceProcessorImpl implements Processor {

    @Override
    public void process( Exchange exchange ) throws Exception {
        System.out.println( "IN BODY = " + exchange.getIn().getBody(SmsBulkResponse.class));
        SmsBulkResponse responce = new SmsBulkResponse();
        responce.setCode(200);
        System.out.println( "Rsponce = " + responce.getCode());
        exchange.getOut().setBody(responce);
    }
}
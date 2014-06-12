package ua.np.services.smsinfo.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ua.np.services.smsinfo.Sms;
import ua.np.services.smsinfo.SmsBulkResponse;


@WebService
public interface SmsService {
	@WebMethod
	public SmsBulkResponse saveMessages (@WebParam(name = "message") List<Sms> smsList);
}

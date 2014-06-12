/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ua.np.services.smsinfo;

/**
 * Copyright (C) 2014 Nova Poshta. All rights reserved. http://novaposhta.ua/
 * Author: soloviov.d email: soloviov.d@novaposhta.ua
 */

public interface SmsService {
	/*
	 * @POST
	 * 
	 * @Path("/send")
	 * 
	 * @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) public
	 * SmsBulkResponse sendSmsBulk(@WebParam(name = "smsBulk") SmsBulk smsBulk);
	 */
	public SmsBulkResponse sendSmsBulk(SmsBulk smsBulk);
}

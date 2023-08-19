/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.redem.model.RedemRequest;
import com.tesco.redem.model.RedemResponse;
import com.tesco.redem.service.ICreditLimitRedemService;

/**
 * @Author Manoj by 15-Aug-2023
 */
@RestController
@RequestMapping("v1/")
public class CreditLimitRedemController {
	
	@Autowired
	ICreditLimitRedemService creditLimitRedemService;
	
	@PostMapping("/redem")
	public RedemResponse increaseLimit(@RequestBody RedemRequest redemRequest,
													  @RequestHeader("client_id") String clientId,
													  @RequestHeader("channel_id") String channelId,
													  @RequestHeader("message_ts") String messageId)										  
													  {
		
		
		//1 . Get the request from consumer and validate the request

		// 2. Prapre the request for service layer

		//3  Call service and get the response

		//4  Send response to client/consumer

		RedemResponse redemResponse	=creditLimitRedemService.increaseLimit(redemRequest);
		
		
		return redemResponse;
		
		
	 }

}



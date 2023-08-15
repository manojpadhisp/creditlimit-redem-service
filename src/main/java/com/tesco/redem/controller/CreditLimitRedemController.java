/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.redem.model.RedemRequest;
import com.tesco.redem.model.RedemResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
@RestController
@RequestMapping("v1/")
public class CreditLimitRedemController {
	
	@PostMapping("/redem")
	public RedemResponse increaseLimit(@RequestBody RedemRequest redemRequest,
													  @RequestHeader("client_id") String clientId,
													  @RequestHeader("channel_id") String channelId,
													  @RequestHeader("message_ts") String messageId)										  
													  {
		
		
		return null;
		
		
	 }

}



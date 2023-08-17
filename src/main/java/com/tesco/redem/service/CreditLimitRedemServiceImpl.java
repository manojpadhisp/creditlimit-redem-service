/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tesco.redem.builder.CreditLimitRedemRequestBuilder;
import com.tesco.redem.builder.CreditLimitRedemResponseBuilder;
import com.tesco.redem.model.CardVerifyServiceClientRequest;
import com.tesco.redem.model.RedemRequest;
import com.tesco.redem.model.RedemResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
@Component
public class CreditLimitRedemServiceImpl implements ICreditLimitRedemService {

	@Autowired
	CreditLimitRedemRequestBuilder creditLimitRedemReqBuilder ;
	
	@Autowired
	CreditLimitRedemResponseBuilder creditLimitRedemRespBuilder ;
	
	
	
	@Override
	public RedemResponse increaseLimit(RedemRequest redemRequest) {
		
		//1 Get request from controller
		
		//2 Call requestBukder to build cardverifyserviceclient request
		
	   CardVerifyServiceClientRequest 	cardVerifyServiceClientReq=creditLimitRedemReqBuilder.buildCardVerifyRequest(redemRequest);
		
		return null;
	}

}

/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.builder;

import org.springframework.stereotype.Component;

import com.tesco.redem.model.CardVerifyServiceClientRequest;
import com.tesco.redem.model.MessageRequest;
import com.tesco.redem.model.RedemDaoRequest;
import com.tesco.redem.model.RedemDaoResponse;
import com.tesco.redem.model.RedemRequest;
import com.tesco.redem.model.RedemResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
@Component
public class CreditLimitRedemRequestBuilder {

	public CardVerifyServiceClientRequest buildCardVerifyRequest(RedemRequest redemRequest) {

		CardVerifyServiceClientRequest cardVerifyServiceClientRequest = new CardVerifyServiceClientRequest();

		// prepare the CardVerifyServiceClientRequest with the help of RedemRequest
		// reuest

		return cardVerifyServiceClientRequest;
	}

	public static RedemDaoRequest buildDaoRequest(RedemRequest redemRequest) {

		RedemDaoRequest redemDaoRequest = new RedemDaoRequest();

		return redemDaoRequest;
	}


	public static MessageRequest buildMQRequest(RedemDaoResponse redemDaoResponse) {
		
		MessageRequest messageRequest = new MessageRequest();
		
		return messageRequest;
	}

}

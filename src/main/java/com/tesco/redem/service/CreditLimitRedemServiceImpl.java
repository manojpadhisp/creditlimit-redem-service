/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tesco.redem.builder.CreditLimitRedemRequestBuilder;
import com.tesco.redem.builder.CreditLimitRedemResponseBuilder;
import com.tesco.redem.dao.ICreditLimitRedemDao;
import com.tesco.redem.model.CardVerifyServiceClientRequest;
import com.tesco.redem.model.CardVerifyServiceClientResponse;
import com.tesco.redem.model.MessageRequest;
import com.tesco.redem.model.RedemDaoRequest;
import com.tesco.redem.model.RedemDaoResponse;
import com.tesco.redem.model.RedemRequest;
import com.tesco.redem.model.RedemResponse;
import com.tesco.redem.publisher.MessagePublisher;
import com.tesco.redem.servicecleint.ICardVerifyServiceClient;

/**
 * @Author Manoj by 15-Aug-2023
 */
@Component
public class CreditLimitRedemServiceImpl implements ICreditLimitRedemService {

	@Autowired
	CreditLimitRedemRequestBuilder creditLimitRedemReqBuilder;

	@Autowired
	CreditLimitRedemResponseBuilder creditLimitRedemRespBuilder;

	@Autowired
	ICardVerifyServiceClient cardVerifyServiceClient;

	@Autowired
	ICreditLimitRedemDao creditLimitRedemDao;
	
	@Autowired
	MessagePublisher messagePublisher;

	@Override
	public RedemResponse increaseLimit(RedemRequest redemRequest) {

		// 1 Get request from controller

		// 2 Call requestBukder to build cardverifyserviceclient request

		CardVerifyServiceClientRequest cardVerifyServiceClientReq = creditLimitRedemReqBuilder
				.buildCardVerifyRequest(redemRequest);

		// 3 call cardverifyserviceclient and get the response

		CardVerifyServiceClientResponse cardVerifyServiceResp = cardVerifyServiceClient
				.verifyCard(redemRequest.getCardNum());

		// write business logic cardVerifyServiceResp for status

		// Call reuestBuilder to buid request

		RedemDaoRequest redemDaoRequest = CreditLimitRedemRequestBuilder.buildDaoRequest(redemRequest);

		// 6 . Call dao and get the response.
		
		RedemDaoResponse redemDaoResponse= creditLimitRedemDao.redemption(redemDaoRequest);
		//apply some business logic on RedemDaoResponse
		
		//8 . Call RequestBuilder to build request for KafkaServer/MQ
		
		
		MessageRequest messageRequest = CreditLimitRedemRequestBuilder.buildMQRequest(redemDaoResponse);
		
		
		//9. Call messagepublisher to push the message into KAFKA server and get the response
		
		
		boolean flag=messagePublisher.sendMessage(messageRequest);
		
		//Apply some business logic on messagepublisher response if required
		//Call responseBuilder to prepare the final resposne
		
		RedemResponse redemResponse=creditLimitRedemRespBuilder.buildRedemResponse(redemDaoResponse);
		
		return redemResponse;
	}

}

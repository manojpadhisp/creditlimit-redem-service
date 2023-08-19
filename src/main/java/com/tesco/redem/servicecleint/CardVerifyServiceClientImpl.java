/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.servicecleint;


import java.security.KeyStore.PrivateKeyEntry;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.tesco.redem.model.CardVerifyServiceClientRequest;
import com.tesco.redem.model.CardVerifyServiceClientResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
@Component
public class CardVerifyServiceClientImpl implements ICardVerifyServiceClient {

	//@Value("${card_verify_ser}")
	private String cardVerifyServiceUriString;
	
	@Override
	public CardVerifyServiceClientResponse verifyCard(String cardnumber) {
		
//	public CardVerifyServiceClientResponse verifyCard(CardVerifyServiceClientRequest cardVerifyServiceClientRequest) {
		
		//Write the restclint logic to invoke the cardverify service
		RestTemplate restTemplate= new RestTemplate();
		
		//MultiValueMap<String, Object> headers= new LinkedMultiValueMap<String,Object>();
		HttpHeaders headers = new HttpHeaders();
		
		headers.set("client_id", "WEB");
		headers.set("channel_id", "ONLINE");
		headers.set("message_ts", new Date().toString() );
		headers.set("request_id", UUID.randomUUID().toString());
		
		HttpEntity<Void> requestEntity= new HttpEntity<>(headers);
		
		//Temp
		String cardVerifyServiceUriString= "http://localhost:2020/v1/card/"+cardnumber;
		
		ResponseEntity<CardVerifyServiceClientResponse> responseEntity=restTemplate.exchange(cardVerifyServiceUriString, HttpMethod.GET, requestEntity, CardVerifyServiceClientResponse.class);
		
		CardVerifyServiceClientResponse cardVerifyServiceClientResponse = null;
		if(responseEntity.getStatusCode().value()== 200)
		{
			cardVerifyServiceClientResponse= responseEntity.getBody() ;
		}
		
		return cardVerifyServiceClientResponse;
	}
	
	
	public static void main(String[] args)
	{
		CardVerifyServiceClientImpl cardVerifyServiceClientImpl = new CardVerifyServiceClientImpl();
		CardVerifyServiceClientRequest cardVerifyServiceClientRequest = new CardVerifyServiceClientRequest();
		
		
		CardVerifyServiceClientResponse response=cardVerifyServiceClientImpl.verifyCard("123456789");
		
		System.out.println("resposne is:"+ response);
	}
	}



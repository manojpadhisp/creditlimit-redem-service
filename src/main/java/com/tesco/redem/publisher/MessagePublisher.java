/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.publisher;

import org.springframework.stereotype.Component;

import com.tesco.redem.model.MessageRequest;

/**
 * @Author Manoj by 19-Aug-2023
 */

@Component
public class MessagePublisher {
	
	public boolean sendMessage(MessageRequest messageRequest)
	{
		
		//Write the Kafaka client code to send the message to the kafka server
		
		return false;
		
	}

}

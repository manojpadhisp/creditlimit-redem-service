/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.builder;

import org.springframework.stereotype.Component;

import com.tesco.redem.model.RedemDaoResponse;
import com.tesco.redem.model.RedemResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
@Component
public class CreditLimitRedemResponseBuilder {

	
	public RedemResponse buildRedemResponse(RedemDaoResponse redemDaoResponse) {
		
		RedemResponse redemResponse = new RedemResponse();
		
		//Prepare the redemResposne with the help of RedemDaoResposne
		
		return redemResponse;
	}

}

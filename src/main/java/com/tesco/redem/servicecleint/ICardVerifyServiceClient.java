/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.servicecleint;

import com.tesco.redem.model.CardVerifyServiceClientRequest;
import com.tesco.redem.model.CardVerifyServiceClientResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
public interface ICardVerifyServiceClient {
	
	CardVerifyServiceClientResponse verifyCard(CardVerifyServiceClientRequest cardVerifyServiceClientRequest);

}

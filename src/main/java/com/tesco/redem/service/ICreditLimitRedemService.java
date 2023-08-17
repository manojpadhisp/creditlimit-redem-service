/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.service;

import com.tesco.redem.model.RedemRequest;
import com.tesco.redem.model.RedemResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
public interface ICreditLimitRedemService {
	
	public RedemResponse increaseLimit(RedemRequest redemRequest);

}

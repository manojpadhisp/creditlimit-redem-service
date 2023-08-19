/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.dao;

import org.springframework.stereotype.Component;

import com.tesco.redem.model.RedemDaoRequest;
import com.tesco.redem.model.RedemDaoResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
@Component
public class CreditLimitRedemDaoImpl implements ICreditLimitRedemDao {

	@Override
	public RedemDaoResponse redemption(RedemDaoRequest redemDaoRequest) {
		
		RedemDaoResponse redemDaoResponse = new RedemDaoResponse();
		return redemDaoResponse;
	}

}

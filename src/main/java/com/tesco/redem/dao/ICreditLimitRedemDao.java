/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.dao;

import com.tesco.redem.model.RedemDaoRequest;
import com.tesco.redem.model.RedemDaoResponse;

/**
 * @Author Manoj by 15-Aug-2023
 */
public interface ICreditLimitRedemDao {
	
	RedemDaoResponse redemption(RedemDaoRequest redemDaoRequest);

}

/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.redem.model;

import lombok.Data;

/**
 * @Author Manoj by 15-Aug-2023
 */

@Data
public class RedemRequest {
	
	 private long currentCreditLimit;
	 private long  eligibleAmount;		 
	 private long  requestedLimit;		 
	 private long  availbleLimit;		 
	 private String  cardNum;			
	 private String  cvvString;
	 private String  nameOnCard;
	 private String  expDate;
	   

}

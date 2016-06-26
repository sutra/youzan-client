package org.oxerr.youzan.dto.ump;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Verifylogs implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	private UmpPromotionVerifylog[] verifylogs;

	public Verifylogs(
		@JsonProperty("verifylogs") UmpPromotionVerifylog[] verifylogs
	) {
		this.verifylogs = verifylogs;
	}

	public UmpPromotionVerifylog[] getVerifylogs() {
		return verifylogs;
	}

	public void setVerifylogs(UmpPromotionVerifylog[] verifylogs) {
		this.verifylogs = verifylogs;
	}

}

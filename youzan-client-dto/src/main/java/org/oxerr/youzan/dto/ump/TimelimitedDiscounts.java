package org.oxerr.youzan.dto.ump;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimelimitedDiscounts implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	private UmpTimelimitedDiscountGoodsJoin[] list;
	private Long count;

	public TimelimitedDiscounts() {
	}

	public TimelimitedDiscounts(
		@JsonProperty("list") UmpTimelimitedDiscountGoodsJoin[] list,
		@JsonProperty("count") Long count
	) {
		this.list = list;
		this.count = count;
	}

	public UmpTimelimitedDiscountGoodsJoin[] getList() {
		return list;
	}

	public void setList(UmpTimelimitedDiscountGoodsJoin[] list) {
		this.list = list;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

}

package org.oxerr.youzan.dto;

import java.io.Serializable;
import java.time.Instant;

public abstract class BaseObject implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private Instant created;

	public BaseObject(Instant created) {
		this.created = created;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

}

package com.hudongwx.studentsys.common;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDomainTag<M extends BaseDomainTag<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setDomainId(java.lang.Integer domainId) {
		set("domainId", domainId);
	}

	public java.lang.Integer getDomainId() {
		return get("domainId");
	}

	public void setTagId(java.lang.Integer tagId) {
		set("tagId", tagId);
	}

	public java.lang.Integer getTagId() {
		return get("tagId");
	}

}

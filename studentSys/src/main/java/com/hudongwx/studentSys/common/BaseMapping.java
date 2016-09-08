package com.hudongwx.studentsys.common;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMapping<M extends BaseMapping<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}

	public java.lang.String getUrl() {
		return get("url");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}

	public java.lang.String getIcon() {
		return get("icon");
	}

	public void setLeftChildId(java.lang.Long leftChildId) {
		set("leftChildId", leftChildId);
	}

	public java.lang.Long getLeftChildId() {
		return get("leftChildId");
	}

	public void setNextSiblingId(java.lang.Long nextSiblingId) {
		set("nextSiblingId", nextSiblingId);
	}

	public java.lang.Long getNextSiblingId() {
		return get("nextSiblingId");
	}

	public void setParentId(java.lang.Long parentId) {
		set("parentId", parentId);
	}

	public java.lang.Long getParentId() {
		return get("parentId");
	}

	public void setChildCount(java.lang.Integer childCount) {
		set("childCount", childCount);
	}

	public java.lang.Integer getChildCount() {
		return get("childCount");
	}

	public void setDegree(java.lang.Integer degree) {
		set("degree", degree);
	}

	public java.lang.Integer getDegree() {
		return get("degree");
	}

}

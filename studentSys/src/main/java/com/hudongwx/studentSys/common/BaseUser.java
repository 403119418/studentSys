package com.hudongwx.studentSys.common;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setUserAccount(java.lang.String userAccount) {
		set("userAccount", userAccount);
	}

	public java.lang.String getUserAccount() {
		return get("userAccount");
	}

	public void setUserPassword(java.lang.String userPassword) {
		set("userPassword", userPassword);
	}

	public java.lang.String getUserPassword() {
		return get("userPassword");
	}

	public void setUserNickname(java.lang.String userNickname) {
		set("userNickname", userNickname);
	}

	public java.lang.String getUserNickname() {
		return get("userNickname");
	}

	public void setUserEmail(java.lang.String userEmail) {
		set("userEmail", userEmail);
	}

	public java.lang.String getUserEmail() {
		return get("userEmail");
	}

	public void setUserRole(java.lang.String userRole) {
		set("userRole", userRole);
	}

	public java.lang.String getUserRole() {
		return get("userRole");
	}

	public void setUserPurikura(java.lang.String userPurikura) {
		set("userPurikura", userPurikura);
	}

	public java.lang.String getUserPurikura() {
		return get("userPurikura");
	}

	public void setUserLastLoginIp(java.lang.String userLastLoginIp) {
		set("userLastLoginIp", userLastLoginIp);
	}

	public java.lang.String getUserLastLoginIp() {
		return get("userLastLoginIp");
	}

	public void setUserCreateTime(java.lang.String userCreateTime) {
		set("userCreateTime", userCreateTime);
	}

	public java.lang.String getUserCreateTime() {
		return get("userCreateTime");
	}

	public void setUserUpdateTime(java.lang.String userUpdateTime) {
		set("userUpdateTime", userUpdateTime);
	}

	public java.lang.String getUserUpdateTime() {
		return get("userUpdateTime");
	}

	public void setUserPhone(java.lang.String userPhone) {
		set("userPhone", userPhone);
	}

	public java.lang.String getUserPhone() {
		return get("userPhone");
	}

	public void setUserAddress(java.lang.String userAddress) {
		set("userAddress", userAddress);
	}

	public java.lang.String getUserAddress() {
		return get("userAddress");
	}

	public void setUserMessage(java.lang.String userMessage) {
		set("userMessage", userMessage);
	}

	public java.lang.String getUserMessage() {
		return get("userMessage");
	}

}

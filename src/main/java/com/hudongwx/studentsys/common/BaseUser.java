package com.hudongwx.studentsys.common;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
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

	public void setRoleId(java.lang.Integer roleId) {
		set("roleId", roleId);
	}

	public java.lang.Integer getRoleId() {
		return get("roleId");
	}

	public void setUserRole(java.lang.String userRole) {
		set("userRole", userRole);
	}

	public java.lang.String getUserRole() {
		return get("userRole");
	}

	public void setUserPhone(java.lang.String userPhone) {
		set("userPhone", userPhone);
	}

	public java.lang.String getUserPhone() {
		return get("userPhone");
	}

	public void setUserEmail(java.lang.String userEmail) {
		set("userEmail", userEmail);
	}

	public java.lang.String getUserEmail() {
		return get("userEmail");
	}

	public void setUserAddress(java.lang.String userAddress) {
		set("userAddress", userAddress);
	}

	public java.lang.String getUserAddress() {
		return get("userAddress");
	}

	public void setUserPurikura(java.lang.String userPurikura) {
		set("userPurikura", userPurikura);
	}

	public java.lang.String getUserPurikura() {
		return get("userPurikura");
	}

	public void setUserMessage(java.lang.String userMessage) {
		set("userMessage", userMessage);
	}

	public java.lang.String getUserMessage() {
		return get("userMessage");
	}

	public void setUserLastLoginIp(java.lang.String userLastLoginIp) {
		set("userLastLoginIp", userLastLoginIp);
	}

	public java.lang.String getUserLastLoginIp() {
		return get("userLastLoginIp");
	}

	public void setUserCreateTime(java.lang.Long userCreateTime) {
		set("userCreateTime", userCreateTime);
	}

	public java.lang.Long getUserCreateTime() {
		return get("userCreateTime");
	}

	public void setUserUpdateTime(java.lang.Long userUpdateTime) {
		set("userUpdateTime", userUpdateTime);
	}

	public java.lang.Long getUserUpdateTime() {
		return get("userUpdateTime");
	}

	public void setOperater(java.lang.String operater) {
		set("operater", operater);
	}

	public java.lang.String getOperater() {
		return get("operater");
	}

}

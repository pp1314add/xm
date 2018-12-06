package com.chuange.aishijing.pojo.recommendmanage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
 * 成功案例表
 */
@Entity
@Table(name="ASJ_SUCCESSCASES")
public class SuccessCases {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String recommendor;//推荐人
	private String cosplayer;//饰演角色
	private String Castname;//所属剧本
	private String linkto;//跳转链接
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRecommendor() {
		return recommendor;
	}
	public void setRecommendor(String recommendor) {
		this.recommendor = recommendor;
	}
	public String getCosplayer() {
		return cosplayer;
	}
	public void setCosplayer(String cosplayer) {
		this.cosplayer = cosplayer;
	}
	public String getCastname() {
		return Castname;
	}
	public void setCastname(String castname) {
		Castname = castname;
	}
	public String getLinkto() {
		return linkto;
	}
	public void setLinkto(String linkto) {
		this.linkto = linkto;
	}
	@Override
	public String toString() {
		return "SuccessCases [id=" + id + ", recommendor=" + recommendor + ", cosplayer=" + cosplayer + ", Castname="
				+ Castname + ", linkto=" + linkto + "]";
	}
	public SuccessCases(@NotNull String id, String recommendor, String cosplayer, String castname, String linkto) {
		super();
		this.id = id;
		this.recommendor = recommendor;
		this.cosplayer = cosplayer;
		Castname = castname;
		this.linkto = linkto;
	}
	public SuccessCases() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package com.chuange.aishijing.pojo.bannermanage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
 * 培训推荐表
 */
@Entity
@Table(name="ASJ_TRAININGRECOMMEND")
public class TrainingRecommend {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String recommendLoc;
	private String classname;
	private String showterminal;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRecommendLoc() {
		return recommendLoc;
	}
	public void setRecommendLoc(String recommendLoc) {
		this.recommendLoc = recommendLoc;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getShowterminal() {
		return showterminal;
	}
	public void setShowterminal(String showterminal) {
		this.showterminal = showterminal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TrainingRecommend [id=" + id + ", recommendLoc=" + recommendLoc + ", classname=" + classname
				+ ", showterminal=" + showterminal + ", status=" + status + "]";
	}
	public TrainingRecommend(@NotNull String id, String recommendLoc, String classname, String showterminal,
			String status) {
		super();
		this.id = id;
		this.recommendLoc = recommendLoc;
		this.classname = classname;
		this.showterminal = showterminal;
		this.status = status;
	}
	public TrainingRecommend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

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
 * 影视原声
 */
@Entity
@Table(name="ASJ_MOVIEAUDIO")
public class MovieAudio {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String castname;//剧本名称
	private String castAuthor;//剧本原作
	private String showterminal;//展示终端
	private String status;//状态
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCastname() {
		return castname;
	}
	public void setCastname(String castname) {
		this.castname = castname;
	}
	public String getCastAuthor() {
		return castAuthor;
	}
	public void setCastAuthor(String castAuthor) {
		this.castAuthor = castAuthor;
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
		return "MovieAudio [id=" + id + ", castname=" + castname + ", castAuthor=" + castAuthor + ", showterminal="
				+ showterminal + ", status=" + status + "]";
	}
	public MovieAudio(@NotNull String id, String castname, String castAuthor, String showterminal, String status) {
		super();
		this.id = id;
		this.castname = castname;
		this.castAuthor = castAuthor;
		this.showterminal = showterminal;
		this.status = status;
	}
	public MovieAudio() {
		super();
		// TODO Auto-generated constructor stub
	}
}

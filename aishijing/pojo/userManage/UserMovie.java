package com.chuange.aishijing.pojo.userManage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 用户影视经历
 */
@Entity
@Table(name="ASJ_USERMOVIE")
public class UserMovie {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String userId;//关联用户id
    private String movieName;//电影名称
    private String cosplay;//饰演
    private String movieCompany;//出品方
    private String director;//导演
    private String mainActors;//主演
    private String introduction;//剧情简介
    private Date playTime;//饰演时间
    
    public Date getPlayTime() {
		return playTime;
	}

	public void setPlayTime(Date playTime) {
		this.playTime = playTime;
	}

	public UserMovie(){}
    

	public UserMovie(@NotNull String id, String userId, String movieName, String cosplay,
			String movieCompany, String director, String mainActors, String introduction, Date playTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.movieName = movieName;
		this.cosplay = cosplay;
		this.movieCompany = movieCompany;
		this.director = director;
		this.mainActors = mainActors;
		this.introduction = introduction;
		this.playTime = playTime;
	}


	public String getMovieCompany() {
		return movieCompany;
	}

	public void setMovieCompany(String movieCompany) {
		this.movieCompany = movieCompany;
	}

	@Override
	public String toString() {
		return "UserMovie [id=" + id + ", userId=" + userId + ", movieName=" + movieName + ", cosplay=" + cosplay
				+ ", movieCompany=" + movieCompany + ", director=" + director + ", mainActors=" + mainActors
				+ ", introduction=" + introduction + ", playTime=" + playTime + "]";
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getMainActors() {
		return mainActors;
	}

	public void setMainActors(String mainActors) {
		this.mainActors = mainActors;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCosplay() {
        return cosplay;
    }

    public void setCosplay(String cosplay) {
        this.cosplay = cosplay;
    }
}


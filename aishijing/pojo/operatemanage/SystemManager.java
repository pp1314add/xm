package com.chuange.aishijing.pojo.operatemanage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by Administrator on 2018-11-07.
 * 系统消息
 */
@Entity
@Table(name="ASJ_SYSTEMMANAGER")
public class SystemManager {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private Integer clickNum;//点击数量
    private String messageTitle;//消息标题
    private String messageContent;//消息内容
    private String messagePicture;//消息图片
    private String jumpLink;//跳转链接
    private String directionalUser;//发布用户

    public SystemManager(@NotNull String id, Integer clickNum, String messageTitle, String messageContent,
			String messagePicture, String jumpLink, String directionalUser) {
		super();
		this.id = id;
		this.clickNum = clickNum;
		this.messageTitle = messageTitle;
		this.messageContent = messageContent;
		this.messagePicture = messagePicture;
		this.jumpLink = jumpLink;
		this.directionalUser = directionalUser;
	}

	@Override
	public String toString() {
		return "SystemManager [id=" + id + ", clickNum=" + clickNum + ", messageTitle=" + messageTitle
				+ ", messageContent=" + messageContent + ", messagePicture=" + messagePicture + ", jumpLink=" + jumpLink
				+ ", directionalUser=" + directionalUser + "]";
	}

	public Integer getClickNum() {
		return clickNum;
	}

	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}

	public String getMessageTitle() {
		return messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

    public SystemManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessagePicture() {
        return messagePicture;
    }

    public void setMessagePicture(String messagePicture) {
        this.messagePicture = messagePicture;
    }

    public String getJumpLink() {
        return jumpLink;
    }

    public void setJumpLink(String jumpLink) {
        this.jumpLink = jumpLink;
    }

    public String getDirectionalUser() {
        return directionalUser;
    }

    public void setDirectionalUser(String directionalUser) {
        this.directionalUser = directionalUser;
    }
}

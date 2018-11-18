package cn.haircut.entity;

import java.util.Date;

public class HairUser {
    private Long id;

    private String username;

    private String password;

    private Integer sex;

    private String phone;

    private String image;

    private Integer score;

    private Integer role;

    private Date created;

    private Date updated;

    private HairUserBoss hairUserBoss;
    
    private HairUserDesigner hairUserDesigner;
    
    public HairUserBoss getHairUserBoss() {
		return hairUserBoss;
	}

	public void setHairUserBoss(HairUserBoss hairUserBoss) {
		this.hairUserBoss = hairUserBoss;
	}

	public HairUserDesigner getHairUserDesigner() {
		return hairUserDesigner;
	}

	public void setHairUserDesigner(HairUserDesigner hairUserDesigner) {
		this.hairUserDesigner = hairUserDesigner;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
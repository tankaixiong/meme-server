package tank.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tank
 * @email kaixiong.tan@qq.com
 * @date:2015年3月23日 上午10:19:47
 * @description:保存系统，用户的配置信息
 * @version :0.1
 */
@Entity
@Table(name = "meme_setting")
public class Setting implements Serializable {
	@Id
	private String id;

	private String val;

	@Column(length = 36)
	private String userId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}

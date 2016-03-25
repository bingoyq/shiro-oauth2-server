package com.github.shiro.chapter.entity;

import java.io.Serializable;

/**
 * 
 * @ClassName: Client
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 袁强
 * @date 2016年3月25日 下午3:18:19
 *
 */
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6991856384663318435L;

	private Long id;
	private String clientName;
	private String clientId;
	private String clientSecret;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Client client = (Client) o;

		if (id != null ? !id.equals(client.id) : client.id != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Client{" + "id=" + id + ", clientName='" + clientName + '\'' + ", clientId='" + clientId + '\''
				+ ", clientSecret='" + clientSecret + '\'' + '}';
	}
}

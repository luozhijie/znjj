package lzj.entity;

import java.util.ArrayList;

public class User {
	private int userId;
	private String userName;
	private String userPassWord;
	private UserType userType;
	private ArrayList<Device> deviceList;
	private ArrayList<TeleControl> teleControlList;

	public User() {
		super();
	}

	public User(int userId, String userName, String userPassWord, UserType userType, ArrayList<Device> deviceList,
			ArrayList<TeleControl> teleControlList) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassWord = userPassWord;
		this.userType = userType;
		this.deviceList = deviceList;
		this.teleControlList = teleControlList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassWord() {
		return userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public ArrayList<Device> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(ArrayList<Device> deviceList) {
		this.deviceList = deviceList;
	}

	public ArrayList<TeleControl> getTeleControlList() {
		return teleControlList;
	}

	public void setTeleControlList(ArrayList<TeleControl> teleControlList) {
		this.teleControlList = teleControlList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassWord=" + userPassWord + ", userType="
				+ userType + ", deviceList=" + deviceList + ", teleControlList=" + teleControlList + "]";
	}

}

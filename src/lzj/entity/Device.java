package lzj.entity;

public class Device {
	private int deviceId;
	private int userId;
	private String deviceName;
	private String deviceStat;
	private DeviceType deviceType;
	private String device_onLine;
	private int device_gpio;

	public Device() {
		super();
	}

	public Device(int deviceId, int userId, String deviceName, String deviceStat, DeviceType deviceType,
			String device_onLine, int device_gpio) {
		super();
		this.deviceId = deviceId;
		this.userId = userId;
		this.deviceName = deviceName;
		this.deviceStat = deviceStat;
		this.deviceType = deviceType;
		this.device_onLine = device_onLine;
		this.device_gpio = device_gpio;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceStat() {
		return deviceStat;
	}

	public void setDeviceStat(String deviceStat) {
		this.deviceStat = deviceStat;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public String getDevice_onLine() {
		return device_onLine;
	}

	public void setDevice_onLine(String device_onLine) {
		this.device_onLine = device_onLine;
	}

	public int getDevice_gpio() {
		return device_gpio;
	}

	public void setDevice_gpio(int device_gpio) {
		this.device_gpio = device_gpio;
	}

	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", userId=" + userId + ", deviceName=" + deviceName + ", deviceStat="
				+ deviceStat + ", deviceType=" + deviceType + ", device_onLine=" + device_onLine + ", device_gpio="
				+ device_gpio + "]";
	}

}

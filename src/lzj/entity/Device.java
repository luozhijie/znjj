package lzj.entity;

public class Device {
	private int deviceId;
	private int userId;
	private String deviceName;
	private String deviceStat;
	private DeviceType deviceType;
	private int device_onLine;

	public Device() {
		super();
	}

	public Device(int deviceId, int userId, String deviceName, String deviceStat, DeviceType deviceType,
			int device_onLine) {
		super();
		this.deviceId = deviceId;
		this.userId = userId;
		this.deviceName = deviceName;
		this.deviceStat = deviceStat;
		this.deviceType = deviceType;
		this.device_onLine = device_onLine;
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

	public int getDevice_onLine() {
		return device_onLine;
	}

	public void setDevice_onLine(int device_onLine) {
		this.device_onLine = device_onLine;
	}

	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", userId=" + userId + ", deviceName=" + deviceName + ", deviceStat="
				+ deviceStat + ", deviceType=" + deviceType + ", device_onLine=" + device_onLine + "]";
	}

}

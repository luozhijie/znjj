package lzj.entity;

public class DeviceType {
	private int deviceTypeId;
	private String deviceTypeName;

	public DeviceType() {
		super();
	}

	public DeviceType(int deviceTypeId, String deviceTypeName) {
		super();
		this.deviceTypeId = deviceTypeId;
		this.deviceTypeName = deviceTypeName;
	}

	public int getDeviceTypeId() {
		return deviceTypeId;
	}

	public void setDeviceTypeId(int deviceTypeId) {
		this.deviceTypeId = deviceTypeId;
	}

	public String getDeviceTypeName() {
		return deviceTypeName;
	}

	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}

	@Override
	public String toString() {
		return "DeviceType [deviceTypeId=" + deviceTypeId + ", deviceTypeName=" + deviceTypeName + "]";
	}

}

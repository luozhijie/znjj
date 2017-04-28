package lzj.entity;

public class TeleControl {
	private int teleControlId;
	private String teleControlKey;
	private TeleControlType teleControlType;
	private String teleControlTname;
	private int telecontrolDeviceId;

	public TeleControl() {
		super();
	}

	public TeleControl(int teleControlId, String teleControlKey, TeleControlType teleControlType,
			String teleControlTname, int telecontrolDeviceId) {
		super();
		this.teleControlId = teleControlId;
		this.teleControlKey = teleControlKey;
		this.teleControlType = teleControlType;
		this.teleControlTname = teleControlTname;
		this.telecontrolDeviceId = telecontrolDeviceId;
	}

	public int getTeleControlId() {
		return teleControlId;
	}

	public void setTeleControlId(int teleControlId) {
		this.teleControlId = teleControlId;
	}

	public String getTeleControlKey() {
		return teleControlKey;
	}

	public void setTeleControlKey(String teleControlKey) {
		this.teleControlKey = teleControlKey;
	}

	public TeleControlType getTeleControlType() {
		return teleControlType;
	}

	public void setTeleControlType(TeleControlType teleControlType) {
		this.teleControlType = teleControlType;
	}

	public String getTeleControlTname() {
		return teleControlTname;
	}

	public void setTeleControlTname(String teleControlTname) {
		this.teleControlTname = teleControlTname;
	}

	public int getTelecontrolDeviceId() {
		return telecontrolDeviceId;
	}

	public void setTelecontrolDeviceId(int telecontrolDeviceId) {
		this.telecontrolDeviceId = telecontrolDeviceId;
	}

	@Override
	public String toString() {
		return "TeleControl [teleControlId=" + teleControlId + ", teleControlKey=" + teleControlKey
				+ ", teleControlType=" + teleControlType + ", teleControlTname=" + teleControlTname
				+ ", telecontrolDeviceId=" + telecontrolDeviceId + "]";
	}

}

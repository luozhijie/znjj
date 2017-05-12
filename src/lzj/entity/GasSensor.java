package lzj.entity;

public class GasSensor {
	private int gid;
	private int deviceId;
	private String time;
	private int ischeck;

	public GasSensor() {
		super();
	}

	public GasSensor(int gid, int deviceId, String time, int ischeck) {
		super();
		this.gid = gid;
		this.deviceId = deviceId;
		this.time = time;
		this.ischeck = ischeck;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getIscheck() {
		return ischeck;
	}

	public void setIscheck(int ischeck) {
		this.ischeck = ischeck;
	}

	@Override
	public String toString() {
		return "GasSensor [gid=" + gid + ", deviceId=" + deviceId + ", time=" + time + ", ischeck=" + ischeck + "]";
	}

}

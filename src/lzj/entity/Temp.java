package lzj.entity;

public class Temp {
	private int tempId;
	private int deviceId;
	private String time;
	private float temperature;
	private float humidity;

	public Temp() {
		super();
	}

	public Temp(int tempId, int deviceId, String time, float temperature, float humidity) {
		super();
		this.tempId = tempId;
		this.deviceId = deviceId;
		this.time = time;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public int getTempId() {
		return tempId;
	}

	public void setTempId(int tempId) {
		this.tempId = tempId;
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

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "Temp [tempId=" + tempId + ", deviceId=" + deviceId + ", time=" + time + ", temperature=" + temperature
				+ ", humidity=" + humidity + "]";
	}

}

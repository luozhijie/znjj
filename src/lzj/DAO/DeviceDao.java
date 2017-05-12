package lzj.DAO;

import java.util.ArrayList;
import lzj.entity.Device;

public interface DeviceDao {
	public int addDevice(Device device);

	public int delDeviceById(int id);

	public int updateDevice(Device device);

	public ArrayList<Device> findDeviceByUserId(int id);

	public int statChange(String stat, int deviceId);

	public void flashOnlineTime(ArrayList<Device> deviceList);
}

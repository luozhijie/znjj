package lzj.DAO;

import java.util.ArrayList;

import lzj.entity.DeviceType;

public interface DeviceTypeDao {
	public int addDeviceType(String deviceType);

	public int delDeviceTypeById(int id);

	public int updateDeviceType(DeviceType deviceType);

	public ArrayList<DeviceType> findAllDevicetype();
}

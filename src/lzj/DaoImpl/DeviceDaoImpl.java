package lzj.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import lzj.DAO.BaseDao;
import lzj.DAO.DeviceDao;
import lzj.entity.Device;
import lzj.entity.DeviceType;

public class DeviceDaoImpl extends BaseDao implements DeviceDao {

	@Override
	public int addDevice(Device device) {
		String sql = "INSERT INTO `znjj`.` device_list` (`user_id`, ` device_name`, `device_stat`, `device_type_id`, ` device_online`) VALUES (?, ?, ?, ?, ?);";
		return this.exceuteUpdate(sql, new Object[] { device.getUserId(), device.getDeviceName(),
				device.getDeviceStat(), device.getDeviceType().getDeviceTypeId(), device.getDevice_onLine() });
	}

	@Override
	public int delDeviceById(int id) {
		return this.exceuteUpdate("DELETE FROM `znjj`.` device_list` WHERE `device_id`=?;", new Object[] { id });
	}

	@Override
	public int updateDevice(Device device) {
		String sql = "UPDATE `znjj`.` device_list` SET `user_id`=?, ` device_name`=?, `device_stat`=?, `device_type_id`=?, ` device_online`=? WHERE `device_id`=?;";

		return this.exceuteUpdate(sql, new Object[] { device.getUserId(), device.getDeviceName(),
				device.getDeviceStat(), device.getDeviceType(), device.getDevice_onLine(), device.getDeviceId() });
	}

	@Override
	public ArrayList<Device> findDeviceByUserId(int id) {
		ArrayList<Device> deviceList = new ArrayList<>();
		String sql = "SELECT * FROM znjj.view_device where user_id=?;";
		ResultSet rs = this.execeuteQuary(sql, new Object[] { id });
		try {
			while (rs.next()) {
				Device device = new Device(rs.getInt("device_id"), rs.getInt("user_id"), rs.getString("device_name"),
						rs.getString("device_stat"),
						new DeviceType(rs.getInt("device_type_id"), rs.getString("device_type_name")),
						rs.getInt("device_online"));
				deviceList.add(device);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return deviceList;
	}

}

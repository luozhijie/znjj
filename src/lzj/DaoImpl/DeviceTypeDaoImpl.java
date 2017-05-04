package lzj.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lzj.DAO.BaseDao;
import lzj.DAO.DeviceTypeDao;
import lzj.entity.DeviceType;

public class DeviceTypeDaoImpl extends BaseDao implements DeviceTypeDao {

	@Override
	public int addDeviceType(String deviceType) {
		String sql = "INSERT INTO `znjj`.`device_type` (`device_type_name`) VALUES (?);";
		return this.exceuteUpdate(sql, new Object[] { deviceType });
	}

	@Override
	public int delDeviceTypeById(int id) {
		String sql = "DELETE FROM `znjj`.`device_type` WHERE `device_type_id`=?;";
		return this.exceuteUpdate(sql, new Object[] { id });
	}

	@Override
	public int updateDeviceType(DeviceType deviceType) {
		String sql = "UPDATE `znjj`.`device_type` SET `device_type_name`=? WHERE `device_type_id`=?;";
		return this.exceuteUpdate(sql, new Object[] { deviceType.getDeviceTypeName(), deviceType.getDeviceTypeId() });
	}

	@Override
	public ArrayList<DeviceType> findAllDevicetype() {
		String sql = "SELECT * FROM znjj.device_type;";
		ResultSet rs = this.execeuteQuary(sql, null);
		ArrayList<DeviceType> deviceTypeList = new ArrayList<>();
		try {
			while (rs.next()) {
				DeviceType deviceType = new DeviceType(rs.getInt("device_type_id"), rs.getString("device_type_name"));
				deviceTypeList.add(deviceType);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return deviceTypeList;
	}

}

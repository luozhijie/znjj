package lzj.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lzj.DAO.BaseDao;
import lzj.DAO.GasSensorDao;
import lzj.entity.GasSensor;

public class GasSensorDaoImpl extends BaseDao implements GasSensorDao {

	@Override
	public int addGasSensor(GasSensor gasSensor) {
		String sql = "INSERT INTO `znjj`.`gas_sensor_list` (`deviceId`) VALUES (?);";
		return this.exceuteUpdate(sql, new Object[] { gasSensor.getDeviceId() });
	}

	@Override
	public int addGasSensorByDeviceId(int deviceId) {
		String sql = "INSERT INTO `znjj`.`gas_sensor_list` (`deviceId`) VALUES (?);";
		return this.exceuteUpdate(sql, new Object[] { deviceId });
	}

	@Override
	public int delGasSensorByGid(int gid) {
		String sql = "DELETE FROM `znjj`.`gas_sensor_list` WHERE `gid`=?;";
		return this.exceuteUpdate(sql, new Object[] { gid });
	}

	@Override
	public int updateGasSensor(GasSensor gasSensor) {
		String sql = "UPDATE `znjj`.`gas_sensor_list` SET `deviceId`=?, `time`=?, `ischeck`=? WHERE `gid`=?;";
		return this.exceuteUpdate(sql, new Object[] { gasSensor.getDeviceId(), gasSensor.getTime(),
				gasSensor.getIscheck(), gasSensor.getGid() });
	}

	@Override
	public int updateGasSensorIsCheckByGid(int gid) {
		String sql = "UPDATE `znjj`.`gas_sensor_list` SET `ischeck`='1' WHERE `gid`=?;";
		return this.exceuteUpdate(sql, new Object[] { gid });
	}

	@Override
	public List<GasSensor> findGasSensorByDeviceId(int deviceId) {
		String sql = "SELECT * FROM znjj.gas_sensor_list where deviceid = ?;";
		ResultSet rs = this.execeuteQuary(sql, new Object[] { deviceId });
		List<GasSensor> gasSensorList = new ArrayList<>();
		try {
			while (rs.next()) {
				GasSensor gasSensor = new GasSensor(rs.getInt("gid"), rs.getInt("deviceId"), rs.getString("time"),
						rs.getInt("ischeck"));
				gasSensorList.add(gasSensor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gasSensorList.isEmpty() ? null : gasSensorList;
	}

}

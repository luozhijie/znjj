package lzj.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lzj.DAO.BaseDao;
import lzj.DAO.TempDao;
import lzj.entity.Temp;

public class TempDaoImpl extends BaseDao implements TempDao {

	@Override
	public int addTemp(Temp temp) {
		String sql = "INSERT INTO `znjj`.`temp_list` (`device_id`, `temperature`, `humidity`) VALUES (?, ?, ?);";
		return this.exceuteUpdate(sql, new Object[] { temp.getDeviceId(), temp.getTemperature(), temp.getHumidity() });
	}

	@Override
	public int delTemp(Temp temp) {
		String sql = "DELETE FROM `znjj`.`temp_list` WHERE `temp_id`=?;";
		return this.exceuteUpdate(sql, new Object[] { temp.getTempId() });
	}

	@Override
	public int updateTemp(Temp temp) {
		String sql = "UPDATE `znjj`.`temp_list` SET `device_id`=?, `time`=now(), `temperature`=?, `humidity`=? WHERE `temp_id`=?;";
		return this.exceuteUpdate(sql,
				new Object[] { temp.getDeviceId(), temp.getTemperature(), temp.getHumidity(), temp.getTempId() });
	}

	@Override
	public List<Temp> findTempByDeviceId(int deviceId) {
		String sql = "SELECT * FROM znjj.temp_list where device_id=?;";
		ResultSet rs = this.execeuteQuary(sql, new Object[] { deviceId });
		List<Temp> tempList = new ArrayList<>();
		try {
			while (rs.next()) {
				Temp temp = new Temp(rs.getInt("temp_id"), rs.getInt("device_id"), rs.getString("time"),
						rs.getFloat("temperature"), rs.getFloat("humidity"));
				tempList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempList.isEmpty() ? null : tempList;
	}

	@Override
	public List<Temp> findTempByDeviceIdAndLimit(int deviceId, int limit) {

		String sql = "SELECT * FROM znjj.temp_list where device_id=? limit ?;";
		ResultSet rs = this.execeuteQuary(sql, new Object[] { deviceId, limit });
		List<Temp> tempList = new ArrayList<>();
		try {
			while (rs.next()) {
				Temp temp = new Temp(rs.getInt("temp_id"), rs.getInt("device_id"), rs.getString("time"),
						rs.getFloat("temperature"), rs.getFloat("humidity"));
				tempList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempList.isEmpty() ? null : tempList;
	}

}

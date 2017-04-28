package lzj.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import lzj.DAO.BaseDao;
import lzj.DAO.TeleControlDao;
import lzj.entity.TeleControl;
import lzj.entity.TeleControlType;

public class TeleControlDaoImpl extends BaseDao implements TeleControlDao {

	@Override
	public int addTeleControl(TeleControl teleControl) {
		String sql = "INSERT INTO `znjj`.`telecontrol_list` (`telecontrol_key`, `telecontrol_type`, `telecontrol_tname`, `telecontrol_device_id`) VALUES (?, ?, ?, ?);";
		return this.exceuteUpdate(sql,
				new Object[] { teleControl.getTeleControlKey(), teleControl.getTeleControlType().getTeleControlTypeId(),
						teleControl.getTeleControlTname(), teleControl.getTelecontrolDeviceId() });
	}

	@Override
	public int delTeleControlById(int id) {
		return this.exceuteUpdate("DELETE FROM `znjj`.`telecontrol_list` WHERE `telecontrol_id`=?;",
				new Object[] { id });
	}

	@Override
	public int updateTeleControl(TeleControl teleControl) {
		String sql = "UPDATE `znjj`.`telecontrol_list` SET `telecontrol_key`=?, `telecontrol_type`=?, `telecontrol_tname`=?, `telecontrol_device_id`=? WHERE `telecontrol_id`=?;";
		return this.exceuteUpdate(sql,
				new Object[] { teleControl.getTeleControlKey(), teleControl.getTeleControlType().getTeleControlTypeId(),
						teleControl.getTeleControlTname(), teleControl.getTelecontrolDeviceId(),
						teleControl.getTeleControlId() });
	}

	@Override
	public ArrayList<TeleControl> findTeleControlByDeviceId(int id) {
		String sql = "SELECT * FROM znjj.view_telecontrol where telecontrol_device_id=?;";
		ArrayList<TeleControl> teleControlList = new ArrayList<>();
		ResultSet rs = this.execeuteQuary(sql, new Object[] { id });
		try {
			while (rs.next()) {
				TeleControl teleControl = new TeleControl();
				teleControl.setTelecontrolDeviceId(rs.getInt("telecontrol_device_id"));
				teleControl.setTeleControlId(rs.getInt("telecontrol_id"));
				teleControl.setTeleControlKey(rs.getString("telecontrol_key"));
				teleControl.setTeleControlTname(rs.getString("telecontrol_tname"));
				teleControl.setTeleControlType(
						new TeleControlType(rs.getInt("telecontrol_type"), rs.getString("telecontrol_type_name")));
				teleControlList.add(teleControl);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return teleControlList;
	}

}

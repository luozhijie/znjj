package lzj.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import lzj.DAO.BaseDao;
import lzj.DAO.TeleControlTypeDao;
import lzj.entity.TeleControlType;

public class TeleControlTypeDaoImpl extends BaseDao implements TeleControlTypeDao {

	@Override
	public int addTeleControlType(TeleControlType teleControlType) {
		String sql = "INSERT INTO `znjj`.`telecontrol_type` (`telecontrol_type_name`) VALUES (?);";
		return this.exceuteUpdate(sql, new Object[] { teleControlType.getTeltControlTypeName() });
	}

	@Override
	public int delTeleControlTypeById(int id) {
		String sql = "DELETE FROM `znjj`.`telecontrol_type` WHERE `telecontrol_type_id`=?;";
		return this.exceuteUpdate(sql, new Object[] { id });
	}

	@Override
	public int updateTeleControlType(TeleControlType teleControlType) {
		String sql = "UPDATE `znjj`.`telecontrol_type` SET `telecontrol_type_name`=? WHERE `telecontrol_type_id`=?;";
		return this.exceuteUpdate(sql,
				new Object[] { teleControlType.getTeltControlTypeName(), teleControlType.getTeleControlTypeId() });
	}

	@Override
	public ArrayList<TeleControlType> findAllTeleControlType() {
		String sql = "SELECT * FROM znjj.telecontrol_type;";
		ArrayList<TeleControlType> teleControlTypeList = new ArrayList<>();
		ResultSet rs = this.execeuteQuary(sql, null);
		try {
			while (rs.next()) {
				TeleControlType teleControlType = new TeleControlType(rs.getInt("telecontrol_type_id"),
						rs.getString("telecontrol_type_name"));
				teleControlTypeList.add(teleControlType);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return teleControlTypeList;
	}

}

package lzj.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lzj.DAO.BaseDao;
import lzj.DAO.UserTypeDao;
import lzj.entity.UserType;

public class UserTypeDaoImpl extends BaseDao implements UserTypeDao {

	@Override
	public int addUserType(UserType userType) {
		String sql = "INSERT INTO `znjj`.`user_type` (`user_type_name`) VALUES (?);";
		return this.exceuteUpdate(sql, new Object[] { userType });
	}

	@Override
	public int delUserTypeById(int id) {
		String sql = "DELETE FROM `znjj`.`user_type` WHERE `user_type_id`=?;";
		return this.exceuteUpdate(sql, new Object[] { id });
	}

	@Override
	public int updateUserType(UserType userType) {
		String sql = "UPDATE `znjj`.`user_type` SET `user_type_name`=? WHERE `user_type_id`=?;";
		return this.exceuteUpdate(sql, new Object[] { userType.getUserTypeName(), userType.getUserTypeId() });
	}

	@Override
	public ArrayList<UserType> findAllUserType() {
		String sql = "SELECT * FROM znjj.user_type;";
		ArrayList<UserType> userTypeList = new ArrayList<>();
		ResultSet rs = this.execeuteQuary(sql, null);
		try {
			while (rs.next()) {
				UserType userType = new UserType(rs.getInt("user_type_id"), rs.getString("user_type_name"));
				userTypeList.add(userType);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return userTypeList;
	}

}

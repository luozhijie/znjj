package lzj.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import lzj.DAO.BaseDao;
import lzj.DAO.DeviceDao;
import lzj.DAO.TeleControlDao;
import lzj.DAO.UserDao;
import lzj.entity.Device;
import lzj.entity.TeleControl;
import lzj.entity.TeleControlType;
import lzj.entity.User;
import lzj.entity.UserType;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public int addUser(User user) {
		String sql = "INSERT INTO `znjj`.`user_list` (`user_name`, `user_password`, `user_type`) VALUES (?, ?, ?);";
		Object[] o = new Object[] { user.getUserName(), user.getUserPassWord(), user.getUserType().getUserTypeId() };
		return this.exceuteUpdate(sql, o);
	}

	@Override
	public int delUserById(int id) {
		String sql = "DELETE FROM `znjj`.`user_list` WHERE `user_id`=?;";
		return this.exceuteUpdate(sql, new Object[] { id });
	}

	@Override
	public int updateUser(User user) {
		String sql = "UPDATE `znjj`.`user_list` SET `user_name`=?, `user_password`=?, `user_type`=? WHERE `user_id`=?;";
		return this.exceuteUpdate(sql, new Object[] { user.getUserName(), user.getUserPassWord(),
				user.getUserType().getUserTypeId(), user.getUserId() });
	}

	@Override
	public User findUserById(int id) {
		DeviceDao deviceDao = new DeviceDaoImpl();
		TeleControlDao teleControlDao = new TeleControlDaoImpl();
		User user = null;
		String sql = "SELECT * FROM znjj.view_user_list where user_id=?;";
		ResultSet rs = this.execeuteQuary(sql, new Object[] { id });
		ArrayList<TeleControl> teleControlList = new ArrayList<>();
		try {
			if (rs.next()) {
				ArrayList<Device> deviceList = deviceDao.findDeviceByUserId(rs.getInt("user_id"));
				for (Device device : deviceList) {
					if (device.getDeviceType().getDeviceTypeId() == 1) {
						TeleControl teleControl = teleControlDao.findTeleControlByDeviceId(device.getDeviceId()).get(0);
						teleControlList.add(teleControl);
					}
				}
			}
			user = new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("user_password"),
					new UserType(rs.getInt("user_type"), rs.getString("user_type_name")),
					deviceDao.findDeviceByUserId(rs.getInt("user_id")), teleControlList);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return user;
	}

	@Override
	public ArrayList<User> findAllUser() {
		DeviceDao deviceDao = new DeviceDaoImpl();
		TeleControlDao teleControlDao = new TeleControlDaoImpl();
		String sql = "SELECT * FROM znjj.view_user_list;";
		ResultSet rs = this.execeuteQuary(sql, null);
		ArrayList<TeleControl> teleControlList = new ArrayList<>();
		ArrayList<User> userList = new ArrayList<>();
		try {
			while (rs.next()) {
				ArrayList<Device> deviceList = deviceDao.findDeviceByUserId(rs.getInt("user_id"));
				for (Device device : deviceList) {
					if (device.getDeviceType().getDeviceTypeId() == 1) {
						TeleControl teleControl = teleControlDao.findTeleControlByDeviceId(device.getDeviceId()).get(0);
						teleControlList.add(teleControl);
					}
				}
				User user = new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("user_password"),
						new UserType(rs.getInt("user_type"), rs.getString("user_type_name")),
						deviceDao.findDeviceByUserId(rs.getInt("user_id")), teleControlList);
				userList.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return userList;
	}

	@Override
	public ArrayList<User> findUserByPage(int page) {
		return null;
	}

	@Override
	public User findUserByUserNameAndPassWord(String username, String password) {
		DeviceDao deviceDao = new DeviceDaoImpl();
		TeleControlDao teleControlDao = new TeleControlDaoImpl();
		User user = null;
		String sql = "SELECT * FROM znjj.view_user_list where user_name=? and user_password=?;";
		ResultSet rs = this.execeuteQuary(sql, new Object[] { username, password });
		ArrayList<TeleControl> teleControlList = new ArrayList<>();
		try {
			if (rs.next()) {
				ArrayList<Device> deviceList = deviceDao.findDeviceByUserId(rs.getInt("user_id"));
				for (Device device : deviceList) {
					if (device.getDeviceType().getDeviceTypeId() == 1) {
						TeleControl teleControl = teleControlDao.findTeleControlByDeviceId(device.getDeviceId()).get(0);
						teleControlList.add(teleControl);
					}
				}
			}
			user = new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("user_password"),
					new UserType(rs.getInt("user_type"), rs.getString("user_type_name")),
					deviceDao.findDeviceByUserId(rs.getInt("user_id")), teleControlList);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return user;
	}

}

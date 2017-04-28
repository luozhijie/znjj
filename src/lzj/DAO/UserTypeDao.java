package lzj.DAO;

import java.util.ArrayList;

import lzj.entity.UserType;

public interface UserTypeDao {
	public int addUserType(UserType userType);

	public int delUserTypeById(int id);

	public int updateUserType(UserType userType);

	public ArrayList<UserType> findAllUserType();
}

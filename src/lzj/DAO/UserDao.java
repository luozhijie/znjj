package lzj.DAO;

import java.util.ArrayList;

import lzj.entity.User;

public interface UserDao {
	public int addUser(User user);

	public int delUserById(int id);

	public int updateUser(User user);

	public User findUserById(int id);

	public ArrayList<User> findAllUser();

	public ArrayList<User> findUserByPage(int page);
	
	public User findUserByUserNameAndPassWord(String username,String password);
}

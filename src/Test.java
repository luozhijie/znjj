import java.util.ArrayList;

import lzj.DAO.UserDao;
import lzj.DaoImpl.UserDaoImpl;
import lzj.entity.User;

public class Test {

	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		ArrayList<User> userList = userDao.findAllUser();
		for (User user : userList) {
			System.out.println(user.toString());
		}
	}

}

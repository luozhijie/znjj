package lzj.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import lzj.DAO.DeviceDao;
import lzj.DAO.UserDao;
import lzj.DaoImpl.DeviceDaoImpl;
import lzj.DaoImpl.UserDaoImpl;
import lzj.entity.User;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/ListenService")
public class ListenService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ListenService() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDao userDao = new UserDaoImpl();
		User user = userDao.findUserByUserNameAndPassWord(username, password);
		DeviceDao deviceDao = new DeviceDaoImpl();
		deviceDao.flashOnlineTime(user.getDeviceList());
		request.setAttribute("userObj", user);
		Gson gson = new Gson();
		String info = gson.toJson(user);
		response.getWriter().print(info);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

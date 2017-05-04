package lzj.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lzj.DAO.DeviceDao;
import lzj.DAO.UserDao;
import lzj.DaoImpl.DeviceDaoImpl;
import lzj.DaoImpl.UserDaoImpl;
import lzj.entity.Device;
import lzj.entity.DeviceType;
import lzj.entity.User;

/**
 * Servlet implementation class ActionServlet
 * 
 * @注册
 * @登录
 */
@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ActionServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String stat = request.getParameter("stat");
		if (stat.equals("login")) {
			// 登录处理动作
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			UserDao userDao = new UserDaoImpl();
			User user = userDao.findUserByUserNameAndPassWord(username, password);
			request.getSession().setAttribute("userObj", user);
			if (user != null) {
				response.sendRedirect("Index.jsp");
			}
		}
		if (stat.equals("register")) {
			// 注册处理动作
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			UserDao userDao = new UserDaoImpl();
			User user = new User();
			user.setUserName(username);
			user.setUserPassWord(password);
			userDao.addUser(user);
			user = userDao.findUserByUserNameAndPassWord(username, password);
			request.setAttribute("userObj", user);
			if (user != null) {
				response.sendRedirect("Index.jsp");
			}
		}
		if (stat.equals("addDevice")) {
			// 添加设备
			String deviceName = request.getParameter("deviceName");
			int deviceTypeId = Integer.valueOf(request.getParameter("deviceTypeId"));
			int gpio = Integer.valueOf(request.getParameter("gpio"));
			System.out.println(deviceName + "," + deviceTypeId + "," + gpio);
			Device device = new Device();
			device.setDeviceName(deviceName);
			device.setDeviceType(new DeviceType(deviceTypeId, null));
			device.setDevice_gpio(gpio);
			device.setUserId(((User) request.getSession().getAttribute("userObj")).getUserId());
			DeviceDao deviceDao = new DeviceDaoImpl();
			deviceDao.addDevice(device);
		}
	}
}

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
 * @添加设备
 * @刷新用户信息
 * @控制开关
 */
@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao = new UserDaoImpl();

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
		String stat = request.getParameter("stat");
		System.out.println(stat);
		if (stat.equals("flash")) {
			// 刷新用户信息
			this.flash(request, response);
		}
		if (stat.equals("onoff")) {
			// 开关控制
			int isoff = Integer.valueOf(request.getParameter("isoff"));
			int deviceId = Integer.valueOf(request.getParameter("deviceId"));
			System.out.println(isoff + "," + deviceId);
			DeviceDao deviceDao = new DeviceDaoImpl();
			switch (isoff) {
			case 1:
				deviceDao.statChange(isoff + "", deviceId);
				break;

			default:
				deviceDao.statChange("0", deviceId);
				break;
			}
			// 刷新用户信息
			this.flash(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String stat = request.getParameter("stat");
		System.out.println(stat);
		if (stat.equals("login")) {
			// 登录处理动作
			String username = request.getParameter("username");
			String password = request.getParameter("password");

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

	@SuppressWarnings("unused")
	private void flash(HttpServletRequest request, HttpServletResponse response) {
		User user = (User) request.getSession().getAttribute("userObj");
		user = userDao.findUserById(user.getUserId());
		request.getSession().setAttribute("userObj", user);
	}
}

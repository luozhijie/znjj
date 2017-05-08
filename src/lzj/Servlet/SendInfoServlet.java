package lzj.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lzj.DAO.TempDao;
import lzj.DaoImpl.TempDaoImpl;
import lzj.entity.Temp;

/**
 * Servlet implementation class SendInfoServlet
 */
@WebServlet("/SendInfoServlet")
public class SendInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SendInfoServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String stat = request.getParameter("stat");
		if (stat.equals("temp")) {
			int deviceId = Integer.valueOf(request.getParameter("deviceId"));
			float temperature = Float.valueOf(request.getParameter("temperature"));
			float humidity = Float.valueOf(request.getParameter("humidity"));
			TempDao tempDao = new TempDaoImpl();
			tempDao.addTemp(new Temp(0, deviceId, null, temperature, humidity));
		}
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

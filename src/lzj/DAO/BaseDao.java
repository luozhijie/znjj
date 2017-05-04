package lzj.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	// 驱动程序名
	String driver = "com.mysql.jdbc.Driver";
	// URL指向要访问的数据库名news
	String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf-8&useSSL=true";
	// MySQL配置时的用户名
	String user = "root";
	// MySQL配置时的密码
	String password = "luozhijie";
	protected Connection conn = null;
	protected ResultSet rs = null;

	PreparedStatement pstmt = null;

	public Connection getConnection() {
		if (conn == null) {
			// 1.加载驱动
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			// 2.建立连接

			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;

	}

	public void closeAll(Connection conn, ResultSet rs, Statement st) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public int exceuteUpdate(String prearedSql, Object[] param) {
		PreparedStatement pstmt = null;
		int num = 0;
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(prearedSql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					pstmt.setObject(i + 1, param[i]);// 为预编译sql设置参数
				}
			}
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return num;
	}

	public ResultSet execeuteQuary(String sql, Object[] p) {
		try {
			conn = this.getConnection();
			pstmt = conn.prepareStatement(sql);
			if (p != null) {
				for (int i = 0; i < p.length; i++) {
					pstmt.setObject(i + 1, p[i]);
				}
			}
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;

	}

	public int exceuteInsert(String sql, Object[] paramters) {
		int result = 0;
		conn = this.getConnection();
		try {
			pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			if (paramters != null) {
				for (int i = 0; i < paramters.length; i++) {
					pstmt.setObject(i + 1, paramters[i]);
				}
			}
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// closeAll();
		}
		return result;
	}

	public void closeAll() {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
				pstmt = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
				rs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

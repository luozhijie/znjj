package lzj.DAO;

import java.util.ArrayList;

import lzj.entity.TeleControl;

public interface TeleControlDao {
	public int addTeleControl(TeleControl teleControl);

	public int delTeleControlById(int id);

	public int updateTeleControl(TeleControl teleControl);

	public ArrayList<TeleControl> findTeleControlByDeviceId(int id);
}

package lzj.DAO;

import java.util.ArrayList;

import lzj.entity.TeleControlType;

public interface TeleControlTypeDao {
	public int addTeleControlType(TeleControlType teleControlType);

	public int delTeleControlTypeById(int id);

	public int updateTeleControlType(TeleControlType teleControlType);

	public ArrayList<TeleControlType> findAllTeleControlType();
}

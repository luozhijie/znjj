package lzj.DAO;

import java.util.List;

import lzj.entity.Temp;

public interface TempDao {
	public int addTemp(Temp temp);

	public int delTemp(Temp temp);

	public int updateTemp(Temp temp);

	public List<Temp> findTempByDeviceId(int deviceId);
	
	public List<Temp> findTempByDeviceIdAndLimit(int deviceId,int limit);
}

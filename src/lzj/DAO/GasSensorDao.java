package lzj.DAO;

import java.util.List;

import lzj.entity.GasSensor;

public interface GasSensorDao {
	public int addGasSensor(GasSensor gasSensor);
	
	public int addGasSensorByDeviceId(int deviceId);

	public int delGasSensorByGid(int gid);

	public int updateGasSensor(GasSensor gasSensor);

	public int updateGasSensorIsCheckByGid(int gid);
	
	public List<GasSensor> findGasSensorByDeviceId(int deviceId);
}

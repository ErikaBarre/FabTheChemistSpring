package fab.the.chemist.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

	@Inject
	CdiDao cdiDao;

	public CdiDao getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(CdiDao cdiDao) {
		this.cdiDao = cdiDao;
	}
	
	public int findGreatest() {
		int greatTest = Integer.MIN_VALUE;
		int[] datas = cdiDao.getData();
		for(int data : datas) {
			if(data >greatTest) {
				greatTest = data;
			}
		}
		return greatTest;
	}
	
}

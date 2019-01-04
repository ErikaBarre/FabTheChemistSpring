package fab.the.chemist.spring.cdi;

import javax.inject.Named;

@Named
public class CdiDao {

	public int[] getData() {
		return new int[] {5,8,89};
	}
	
}

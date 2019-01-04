package fab.the.chemist.spring.mockito;

public class BusinessImpl {

	private DataService dataService;
	
	public BusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findthegreatestvalue() {
		int[] data =dataService.retrieveAll();
		int greater = Integer.MIN_VALUE;
		for(int value : data) {
			if(value > greater) {
				greater = value;
			}
		}
		return greater;
		
	}
	
	
	
}


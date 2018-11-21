package fab.the.chemist.spring.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quik")
public class QuickSortAlgorthimImpl implements ISortAlgorthim{

	public int[] sort(int[] numbers) {
				
		return numbers; 
	}
	
}

package fab.the.chemist.spring.basics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("brol")
//@Primary   //à la place on peut utliser "private ISortAlgorthim sortAlgorthimImpl;" (identifiant du nom de cette classe @primary
public class SortAlgorthimImpl implements ISortAlgorthim{

	public int[] sort(int[] numbers) {

		
		
		return numbers; 
	}
	
}

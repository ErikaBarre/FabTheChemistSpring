package fab.the.chemist.spring.basics;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//@Autowired
	//private ISortAlgorthim iSortAlgorthim;
	
	//à la place d'utliser l'annotation @primaty dans SortAlgorthimImpl , on peut placer l'identifiant du meme nom de la classe à la place
	//@Autowired
	//private ISortAlgorthim sortAlgorthimImpl;
	
//	@Autowired //si sortAlgorthimImpl est @Primary alors c'est lui qui est prioritaire et "quickSortAlgorthimImpl" devient juste un identifiant simple 
//	private ISortAlgorthim quickSortAlgorthimImpl;
	
	//technique avec @qualifier (pas de @primay)
	@Autowired
	@Qualifier("brol")
	private ISortAlgorthim iSortAlgorthim;
	
	//@Autowired //(injection par constructeur)
//	public BinarySearchImpl(ISortAlgorthim iSortAlgorthim) {
//		this.iSortAlgorthim = iSortAlgorthim;
//	}
	
	//@Autowired //(injection par setter)
//	public void setISortAlgorthim (ISortAlgorthim iSortAlgorthim) {
//		this.iSortAlgorthim = iSortAlgorthim;
//	}
	
	public int binarySearch(int[] numbers,  int numberToSearch) {
		
		//SortAlgorthimImpl sortAlgorthim = new SortAlgorthimImpl();
		//int[] sortedArray = sortAlgorthim.sort(numbers);
		
		int[] sortedArray = iSortAlgorthim.sort(numbers);
		
		//int[] sortedArray = sortAlgorthimImpl.sort(numbers);	
		
		//int[] sortedArray = quickSortAlgorthimImpl.sort(numbers);
		
		return 3;
	}
	
	//la méthode suivante sera exécutée automatiquement que la classe est instanciée et que les variables autowired sont injectees
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("PostConstruct");
	}
	
	//appeler juste avant que le bean soit remove du contexte
	//à l'air de fonctionner si le scope est singleton
	@PreDestroy
	public void preDestroyx() {
		LOGGER.info("PreDestroy");
	} 
}

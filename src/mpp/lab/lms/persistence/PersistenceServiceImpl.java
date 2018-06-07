package mpp.lab.lms.persistence;

public class PersistenceServiceImpl implements PersistenceService {

	@Override
	public void persistObject(Object o) {
		System.out.println(o.toString());		
	}

}

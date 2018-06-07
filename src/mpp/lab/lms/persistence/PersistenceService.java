package mpp.lab.lms.persistence;

public interface PersistenceService {
	void persistObject(Object o);
	Object getObject(Object o);
}

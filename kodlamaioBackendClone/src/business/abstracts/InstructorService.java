package business.abstracts;

import java.util.List;

import entities.concretes.Instructor;

public interface InstructorService {
	
	void add(Instructor �nstructor);
	
	void remove(Instructor �nstructor);
	
	List<Instructor>getAll();
	

}

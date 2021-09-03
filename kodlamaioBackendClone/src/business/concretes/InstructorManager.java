package business.concretes;

import java.util.List;

import business.abstracts.InstructorService;
import dataAccess.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class InstructorManager implements InstructorService {
    InstructorDao �nstructorDao;
	
	public InstructorManager(InstructorDao instructorDao) {
		super();
		�nstructorDao = instructorDao;
	}

	@Override
	public void add(Instructor instructor) {
		this.�nstructorDao.add(instructor);
		
	}

	@Override
	public void remove(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return this.�nstructorDao.getAll();
	}

}

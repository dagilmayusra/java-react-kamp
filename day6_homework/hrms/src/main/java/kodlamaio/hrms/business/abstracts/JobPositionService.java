package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
	JobPosition getByName(String name);
	JobPosition add(JobPosition jobPosition);
}

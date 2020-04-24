package controlWork2.university;

public class Rector {
	
	private InstituteWorker instituteWorker;

	public Rector(InstituteWorker instituteWorker) {
		this.instituteWorker = instituteWorker;
	}

	public InstituteWorker getInstituteWorker() {
		return instituteWorker;
	}

	public void setInstituteWorker(InstituteWorker instituteWorker) {
		this.instituteWorker = instituteWorker;
	}
	
	void work() {

		instituteWorker.work();
	}

}

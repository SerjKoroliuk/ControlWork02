package controlWork2.university;

public class MainApp {

	public static void main(String[] args) {



		Rector rector = new Rector(new ViceRectorForAcademicAffairs());
		rector.work();
		rector = new Rector(new ViceRectorForHumanResources());
		rector.work();
		rector = new Rector(new ViceRectorForScience());
		rector.work();
	}

}

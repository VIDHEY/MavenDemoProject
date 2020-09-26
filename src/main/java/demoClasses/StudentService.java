package demoClasses;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

	List<Student> students = new ArrayList<Student>();
	
	public StudentService() {
		students.add(new Student("Jay", 98, 23));
		students.add(new Student("Rajesh", 76, 24));
		students.add(new Student("Sima", 93, 21));
	}
	
	public int countStudents()
	{
		return students.size();
	}
	public int totalScore()
	{
		int sum = 0;
		for(int i=0;i<students.size();i++)
		{
			sum+=students.get(i).getMarks();
		}
		return sum;
	}
}

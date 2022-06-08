package entities;

public class Grade {
	
	//attributes
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	//methodes
	public double finalGrade()
	{
		return grade1 + grade2 + grade3;
	}
	
	public String toString()
	{
		if(finalGrade() >= 60.0)
		{
			return "FINAL GRADE = "
					+ String.format("%.2f", finalGrade())
					+ "\nPASS";
		}
		
		return "FINAL GRADE = "
		+ String.format("%.2f", finalGrade())
		+ "\nFAILED\nMISSING " 
		+ String.format("%.2f", (60 - finalGrade()))
		+ " POINTS";
	}
	
}

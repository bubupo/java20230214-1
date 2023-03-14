package ch16.exercise09;

public class Exercise09 {
	double englishAvg = avg(S -> s.getEnglishScore());
	double englishAvg = avg(Student :: getEnglishScore);
	
	double mathAvg = avg(S -> s.getMathScore());
	double mathAvg  = avg(Student :: getMathScore);	
	
}

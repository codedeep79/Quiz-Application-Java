package Model;

public interface IResult {
	void showResult();
	double showPercentage(int correctAnswer, int totalQuestion);
	String showPerformance(double percentage);
}

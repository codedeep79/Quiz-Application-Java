package Model;

public class Result implements IResult {

	private int countTotal = 0;
	private int countCorrect = 0;
	private int countWrong = 0;
	
	
	public Result(int countTotal, int countCorrect, int countWrong) {
		this.countTotal = countTotal;
		this.countCorrect = countCorrect;
		this.countWrong = countWrong;
	}

	@Override
	public void showResult() {
		System.out.println("Your Result: ");
		System.out.println("Total Question: " + countTotal);
		System.out.println("Correct Question: " + countCorrect);
		System.out.println("Wrong Question: " + countWrong);
		System.out.println("Percentage: " + showPercentage(countCorrect, countTotal));
		System.out.println("Overall Performance: " + showPerformance(showPercentage(countCorrect, countTotal)));
	}

	@Override
	public double showPercentage(int correctAnswer, int totalQuestion) {
		return ((double) countCorrect / countTotal) * 100;
	}

	@Override
	public String showPerformance(double percentage) {
		String performance = "";
		if (percentage > 60){
			performance = "Good";
		}
		else if(percentage < 40)
		{
			performance = "Poor";
		}
		else
			performance = "Average";
		return performance;
	}

}

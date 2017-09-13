package Model;

public class Question {
	private String question;
	private String option1, option2, option3, option4;
	private Answer answer;
	
	

	public Question(String question, String option1, 
			String option2, String option3, String option4, Answer answer) {
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return convertToUTF8(question.trim());
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return convertToUTF8(option1);
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return convertToUTF8(option2);
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return convertToUTF8(option3);
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return convertToUTF8(option4);
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}
	
	public static String convertToUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("UTF-8"), "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
    }
	
	
}

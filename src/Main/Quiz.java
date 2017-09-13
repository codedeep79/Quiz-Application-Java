package Main;

import java.util.Scanner;

import Model.Answer;
import Model.IResult;
import Model.Question;
import Model.Result;

public class Quiz {
	void begin(){
		Question question1 	
							= new Question("Tên tiếng Anh đầy đủ của ASEAN là gì?", "Association of Southeast Asian Nations",
								"Association of South and East Asian Nations", "Assembly of Southeast Asian Nations ", 
								"Alliance of Southeast Asian Nations", new Answer("Association of Southeast Asian Nations"));
		Question question2 	
							= new Question("Các nước muốn gia nhập vào ASEAN phải thỏa mãn tất cả các tiêu chí, trừ tiêu chí nào sau đây",
								"Có vị trí nằm trong khu vực Đông Nam Á ", "Được tất cả các nước thành viên ASEAN công nhận", 
								"Có thể chế phù hợp", "Chấp nhận sự ràng buộc và tuân thủ Hiến chương ", new Answer("Có thể chế phù hợp"));
		Question question3 	
							= new Question("ASEAN không nhằm đạt được mục tiêu nào sau đây: ", "Duy trì hòa bình, an ninh, ổn định khu vực", 
								"Xây dựng một thị trường chung và cơ sở sản xuất duy nhất", "Hình thành một khối phòng thủ chung", 
								"Nâng cao phúc lợi và đời sống của người dân ASEAN", new Answer("Hình thành một khối phòng thủ chung"));
		Question question4 	
							= new Question("Các quốc gia thành viên của ASEAN: ", "Có quyền và nghĩa vụ bình đẳng", 
								"Có quyền bình đẳng và nghĩa vụ khác nhau tùy thuộc vào mức độ phát triển kinh tế của mỗi nước", 
								"Có quyền và nghĩa vụ khác nhau tùy thuộc vào mức độ phát triển kinh tế của mỗi nước. ",
								"Có quyền và nghĩa vụ khác nhau tùy thuộc vào thời điểm gia nhập ASEAN.", new Answer("Có quyền và nghĩa vụ bình đẳng"));
		Question question5 	
							= new Question("Trong biểu tượng của ASEAN, mười bó lúa tượng trưng cho:", "10 quốc gia thành viên ASEAN", 
								"Ưu tiên của ASEAN về hợp tác nông nghiệp", "Trọng tâm hợp tác của ASEAN là về sản xuất lúa gạo", 
								"10 mục tiêu hợp tác chính của ASEAN", new Answer("10 quốc gia thành viên ASEAN"));
		Question question6 	
							= new Question("Khu vực ASEAN có khoảng bao nhiêu triệu người?", "300", "400", "500", "600", new Answer("600"));
		Question question7 	
							= new Question("Năm 1967, 5 quốc gia nào đã tuyên bố thành lập Hiệp hội các quốc gia Đông Nam Á?", "Indonesia, Malaysia, Philippines, Singapore, Thái Lan", 
								"Indonesia, Malaysia, Brunei, Singapore, Thái Lan", "Indonesia, Malaysia, Brunei, Singapore, Myanmar", 
								"Indonesia, Malaysia, Brunei, Myanmar, Philippines", new Answer("Indonesia, Malaysia, Philippines, Singapore, Thái Lan"));
		Question question8 	
							= new Question("Tổng thư ký ASEAN nhiệm kỳ 2013-2017 là người quốc gia nào?", "Việt Nam", "Indonesia", "Thái Lan", "Myanmar", new Answer("Việt Nam"));
		Question question9 	
							= new Question("Hiệp hội các quốc gia Đông Nam Á (ASEAN) được thành lập vào ngày tháng năm nào?", "8/8/1967", "8/8/1968", "9/8/1967", "8/9/1967", new Answer("8/8/1967"));
		Question question10 
							= new Question(" Việt Nam gia nhập ASEAN vào ngày tháng năm nào và là thành viên gia nhập thứ mấy trong các quốc gia ASEAN?",
								"28/8/1995, thành viên gia nhập thứ 10", "27/8/1996, thành viên gia nhập thứ 9", "27/8/1995, thành viên gia nhập thứ 8", 
								"28/7/1995, thành viên gia nhập thứ 7", new Answer("28/7/1995, thành viên gia nhập thứ 7"));
	
		Question questionArr[] = {question1, question2, question3, question4,
				question5, question6, question7, question8, question9, question10};
		
		int countTotal = 0;
		int countCorrect = 0;
		int countWrong = 0;
		
		for(Question question : questionArr){
			System.out.println(question.getQuestion());
			System.out.println("A. " + question.getOption1());
			System.out.println("B. " + question.getOption2());
			System.out.println("C. " + question.getOption3());
			System.out.println("D. " + question.getOption4());
			System.out.println("Enter An Option: ");
			
			Scanner scanner = new Scanner(System.in);
			char option = scanner.next().charAt(0);
			String answer = "";
			
			switch (option){
				case 'A': 
					answer = question.getOption1();
					break;
				case 'B': 
					answer = question.getOption2();
					break;
				case 'C': 
					answer = question.getOption3();
					break;
				case 'D': 
					answer = question.getOption4();
					break;
				default: break;
			}
			if (answer.equals(question.getAnswer().getAnswer()))
			{
				System.out.println("===================================================================");
				System.out.println("======================== Correct Answer =====================");
				System.out.println("===================================================================");
				++countCorrect;
			}
			else
			{
				System.out.println("===================================================================");
				System.out.println("======================== Wrong Answer =====================");
				System.out.println("===================================================================");
				++countWrong;
			}
			
			System.out.println("===================================================================");
			++countTotal;
		}
		
		IResult result = new Result(countTotal, countCorrect, countWrong);
		result.showResult();
		
	}
}

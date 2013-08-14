package in.abc.test;

import in.abc.model.Blanks;
import in.abc.model.Mcq;
import in.abc.model.Question;
import in.abc.model.Scq;

public class TestOne {

	public static void main(String[] args) {
		Question questions[] = new Question[5];
		
		questions[0] = new Scq("What is OS", "a1", "Operation System", "A3", "Operating System", 4);
		questions[1]= new Mcq("Name the fav hero", "A","B", "C", "D", new int[]{1,0,0,1});
		questions[2] = new Scq("What is P", "p1", "p2 System", "p3", "p4", 1);
		questions[3] = new Blanks("What is conditional _________", "help");
		questions[4]= new Mcq("How to ...", "A1","B1", "C1", "D1", new int[]{0,1,1,1});
		
		for(Question q: questions){
			q.render();
		}
		
		System.out.println("**** Result ***** ");
		int c=0;
		for(Question q: questions){
			 System.out.println(q.getText() + " " +  ( q.isCorrect() ? "Correct" : "Incorrect") );
			 if(q.isCorrect())
				 c++;
		}
		System.out.println("\nTotal correct : " + c);

	}

}

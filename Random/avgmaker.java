import java.util.Scanner;
public class apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade = 0;
		int average;
		int gradeNum = 0;
		System.out.println("How many grades are you entering?");
		gradeNum = input.nextInt();
		for  (int counter = 1; counter <= gradeNum; counter++) {
			System.out.print("Enter grade " + counter + ":  ");
			grade = input.nextInt();
			total = total + grade;
		}
		average = total/gradeNum;
		System.out.println("Your average is " + average);
	}
}
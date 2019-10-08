import java.util.Scanner;
public class Grade1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int witotal=0;
		double totalwigi=0;
		for (int i=0;i<=2;i++) {
			System.out.println("Enter credit hours");
			int wi;
			wi= sc.nextInt();
			System.out.println(wi);
			
			System.out.println("Enter grade");
			
			String grade=sc.next();
			System.out.println(grade);
			
			if( grade.equals("A+")) {
				
				totalwigi=totalwigi+wi*4.5;
				witotal=witotal+wi;
			}
			else if(grade.equals("A")){
				totalwigi=totalwigi+wi*4.25;
				witotal=witotal+wi;
			}
			else if(grade.equals("A-")){
				totalwigi=totalwigi+wi*4.0;
				witotal=witotal+wi;
			}else if(grade.equals("B+")){
				totalwigi=totalwigi+wi*3.5;
				witotal=witotal+wi;
			}else if(grade.equals("B")){
				totalwigi=totalwigi+wi*3.0;
				witotal=witotal+wi;
			}
			else if(grade.equals("C+")){
				totalwigi=totalwigi+wi*2.5;
				witotal=witotal+wi;
			}
			else if(grade.equals("C")){
				totalwigi=totalwigi+wi*2.0;
				witotal=witotal+wi;
			}
			else if(grade.equals("D")){
				totalwigi=totalwigi+wi*1.0;
				witotal=witotal+wi;
			}
			else {
				totalwigi=totalwigi+wi*0.0;
				witotal=witotal+wi;
				
			}
		}
		
		System.out.println("GPA for five courses:");
		
		double gpa=totalwigi/witotal;
		
		System.out.println(gpa);
		
		
		
		
	}
}

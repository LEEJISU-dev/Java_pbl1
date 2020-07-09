
import java.util.Scanner;


public class info {

	public static void main(String[] args) {
		System.out.println("제작자"); 
        System.out.println("이름 : "+main.getName()+", 학과 : "+main.getDep()+", 학번 : "+main.getNum());//private
		System.out.println();
		System.out.println("[대학 관리 시스템]");
		System.out.println();
	    System.out.println("==================================================================");
		System.out.println("1. 교수 관리 | 2. 직원 관리| 3. 학생 관리 | 4. 학과 관리 | 5. 교과목 관리  | 0. 초기화면");
		System.out.println("==================================================================");
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		int select = scan.nextInt();
        switch(select)
        {
          case 1 : 
        	professor.pro(); 
        	break; 
          case 2 :
          	staff.sta();
          	break; 
          case 3 :
          	student.stu();
          	break;
          case 4 : 
          	major.ma();
          	break;
          case 5 :
          	subject.sub();
          	break; 
          case 0 :
          	System.out.println("프로그램을 종료합니다."); 
          	System.exit(0); 
        } 
		
		
	}

}

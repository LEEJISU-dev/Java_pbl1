import java.util.Scanner;

import pbl.clear;

import java.util.HashMap;
public class student extends person {
	
	 public static HashMap<String, student>map = new HashMap<String, student>();
	 public static student st = new student();
	 String sub;
	 double grade;
	    
   public student(String name, int id, String num, String email, String les, int pay, String sub, double grade){
	        super(num, id, email, name, les, pay);
	    	this.sub=sub;
	    	this.grade=grade;
	    }
   
   public student(){
	   
   }
   public String toString(){
       StringBuffer buf = new StringBuffer();
       buf.append(name).append(" ").append(id).append(" ").append(num).append(" ").append(email).append(" ").
       append(les).append(" ").append(pay).append(" ").append(sub).append(" ").append(grade).append(" ");
   	return buf.toString();
   }
   
	public static void stu(){
		if(map.size()==0){
			map.put("구경민", new student("구경민",20120786, "01026598248","rudals@naver.com","컴퓨터공학과", 210,"HCI",3.0));
			map.put("권혁범", new student("권혁범",20141175, "01078965432","gurqja@naver.com","컴퓨터공학과", 130,"HCI",3.4));
			map.put("김서희", new student("김서희",20130395, "01052583659","tigml@naver.com","컴퓨터공학과", 50,"HCI",3.8));
			map.put("두지수", new student("두지수",20140632, "01029536598","doo@naver.com","컴퓨터공학과", 100,"HCI",4.2));
			map.put("모진섭", new student("모진섭",20130752, "01084589965","singha@naver.com","컴퓨터공학과", 60,"HCI",2.8));
			map.put("문혜인", new student("문혜인",20140597, "01026598745","heain@naver.com","컴퓨터공학과", 250,"HCI",3.5));
			map.put("박기범", new student("박기범",20120781, "01058479532","riqjack@naver.com","컴퓨터공학과", 150,"HCI",4.5));
			map.put("박도현", new student("박도현",20113117, "01059874562","cvdwe@naver.com","컴퓨터공학과", 145,"HCI",3.6));
			map.put("박승수", new student("박승수",20120778, "01089532652","wojuro@naver.com","컴퓨터공학과", 80,"HCI",2.5));
			map.put("박종원", new student("박종원",20130732, "01032959783","llone@naver.com","컴퓨터공학과", 200,"HCI",4.1));
			}
		
		System.out.println();
		System.out.println("[학생 관리] ");
		System.out.println();
	    System.out.println("=============================================================================");
		System.out.println("1. 정보입력 | 2. 정보 삭제 | 3. 정보 확인 및 수정 | 4. 정보 검색 | 5. 전체 학생 확인  | 0. 초기화면");
		System.out.println("==============================================================================");
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		int select = scan.nextInt();
        switch(select)
        {
          case 1 : 
        	st.add(); 
        	break; 
          case 2 :
        	st.del();
          	break; 
          case 3 :
        	st.fix();
          	break;
          case 4 : 
        	st.search();
          	break;
          case 5 :
        	st.print();
          	break; 
          case 0 :
          	System.out.println("초기메뉴로 돌아갑니다."); 
          	info.main(null); 
        } 
	}

	public   void add(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. 학생 정보 입력");
		System.out.println();
		System.out.println("다음을 순서대로 입력하세요");
		System.out.println(" 이름 | 학번 | 전화번호 | 이메일 | 소속학과 | 장학금내역  | 수강과목 | 성적 |");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학번 : ");
		int id = sc.nextInt();
		System.out.print("전화번호 : ");
		String num = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("소속학과 : ");
		String les = sc.next();
		System.out.print("장학금내역 : ");
		int pay = sc.nextInt();
		System.out.print("수강과목: ");
		String sub = sc.next();
		System.out.print("성적 : ");
		double grade = sc.nextDouble();
		
		map.put(name, new student(name, id, num, email, les, pay, sub, grade));
		
		System.out.println("입력되었습니다.");
		
		 System.out.println("======================================"); 
         System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		
         		stu();
         		break; 
   }	 
	}
	public   void del(){
		 
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("2. 학생 정보 삭제");
		System.out.println();
		System.out.println("삭제할 학생의 이름을 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		map.remove(name);
		System.out.println(name +"학생의 정보는 삭제되었습니다.");
	
		 System.out.println("======================================"); 
         System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		
         		stu();
         		break; 
   }
	}
	public   void fix(){
		 
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("4. 학생 정보 검색");
		System.out.println();
		System.out.println("검색할 학생의 이름을 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name +"학생의 정보입니다.");
		System.out.println(map.get(name));
		
		System.out.println("수정할 데이터를 다음 순서대로 입력하세요");
		System.out.println();
		System.out.println(" 이름 | 학번 | 전화번호 | 이메일 | 소속학과 | 장학금내역  | 수강과목 | 성적 |");
		
		System.out.print("학번 : ");
		int id = sc.nextInt();
		System.out.print("전화번호 : ");
		String num = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("소속학과 : ");
		String les = sc.next();
		System.out.print("장학금내역 : ");
		int pay = sc.nextInt();
		System.out.print("수강과목: ");
		String sub = sc.next();
		System.out.print("성적 : ");
		double grade = sc.nextDouble();
		
        map.put(name, new student(name, id, num, email, les, pay, sub, grade));
		
		System.out.println("수정되었습니다.");
	
		 System.out.println("======================================"); 
         System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		
         		stu();
         		break; 
   }
	}
	public   void search(){
		 
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("4. 학생 정보 검색");
		System.out.println();
		System.out.println("검색할 학생의 이름을 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name +"학생의 정보입니다.");
		
		System.out.println(map.get(name));
		
		 System.out.println("======================================"); 
         System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		
         		stu();
         		break; 
   }
	}
	public   void print(){
		 
		System.out.println();
		System.out.println("5. 전체 학생 확인");
		System.out.println();
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		
		 System.out.println("======================================"); 
         System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		
         		stu();
         		break; 
   }
	}

}

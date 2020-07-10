import java.util.Scanner;
import pbl.clear;
import java.util.HashMap;

public class professor extends person{
	public static HashMap<String, professor>map = new HashMap<String, professor>();
	public static professor p = new professor();

	String maj;
	String rank;
	int date=0;
    
	public professor(String name, int id, String num, String email, String les, int pay, String maj, String rank, int date){
		super(name, id, num, email, les, pay);//업캐스팅
		this.maj=maj;
		this.rank=rank;
		this.date=date;
	}
    
	public professor(){
    	
	}

	//오버라이딩
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append(name).append(" ").append(id).append(" ").append(num).append(" ").append(email).append(" ").
		append(les).append(" ").append(pay).append(" ").append(maj).append(" ").append(rank).append(" ").append(date).append(" ");
		return buf.toString();
	}

	public static void pro(){
		/* 정보저장 */
		if(map.size()==0){
			map.put("최의인", new professor("최의인",12345, "0426297981","eichol@hnu.kr","컴퓨터공학과", 300, "데이터베이스","교수",00000000));
			map.put("이상구", new professor("이상구",23456, "0426297551","sglee@hnu.kr","컴퓨터공학과", 300, "컴퓨터구조 및 퍼지이론","교수",00000000));
			map.put("박우전", new professor("박우전",34567, "0426297547","woojunpark@gmail.com","컴퓨터공학과", 300, "프로그래밍언어","교수",00000000));
			map.put("이강수", new professor("이강수",45678, "0426297549","gslee@hnu.kr","컴퓨터공학과", 300, "소프트웨어공학","교수",00000000));
			map.put("이극", new professor("이 극",56789, "0426297550","leegeuk@hnu.kr","컴퓨터공학과", 300, "정보보호 및 인공지능","교수",00000000));
			map.put("이재광", new professor("이재광",67890, "0426297559","jklee@hnu.kr","컴퓨터공학과", 300, "컴퓨터네트워크","교수",00000000));
			map.put("소우영", new professor("소우영",78901, "0426297657","wsoh@hnu.kr","컴퓨터공학과", 300, "뉴럴네트윅인공지능","교수",00000000));
			map.put("류성한", new professor("류성한",89012, "0426298531","ktkim@hnu.kr","정보통신공학과", 300, "공학소프트웨어","부교수",00000000));
			map.put("박대철", new professor("박대철",90123, "0426297571","deachul@hnu.kr","정보통신공학과", 300, "미디어정보처리","교수",00000000));
			map.put("박성우", new professor("박성우",01234, "0426297398","swpark@hnu.kr","정보통신공학과", 300, "컴퓨터통신망","교수",00000000));
		}
		
		System.out.println();
		System.out.println("[교수 관리] ");
		System.out.println();
		System.out.println("=============================================================================");
		System.out.println("1. 정보입력 | 2. 정보 삭제 | 3. 정보 확인 및 수정 | 4. 정보 검색 | 5. 전체 교수 확인  | 0. 초기화면");
		System.out.println("==============================================================================");
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		int select = scan.nextInt();
		switch(select) {
         		case 1 : 
				p.add(); 
				break; 
			case 2 :
				p.del();
				break; 
			case 3 :
				p.fix();
				break;
			case 4 : 
				p.search();
				break;
			case 5 :
				p.print();
				break; 
			case 0 :
				System.out.println("초기메뉴로 돌아갑니다."); 
				info.main(null); 
		} 
	}
	
	/* 교수 정보 입력 */
	public void add(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. 교수 정보 입력");
		System.out.println();
		System.out.println("다음을 순서대로 입력하세요");
		System.out.println(" 이름 |사번 | 전화번호 | 이메일 | 학과 | 월급 | 강의과목 | 직급 | 입사일 |");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("사번 : ");
		int id = sc.nextInt();
		System.out.print("전화번호 : ");
		String num = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("학과 : ");
		String les = sc.next();
		System.out.print("월급 : ");
		int pay = sc.nextInt();
		System.out.print("강의 과목 : ");
		String maj = sc.next();
		System.out.print("직급: ");
		String rank = sc.next();
		System.out.print("입사일 : ");
		int date = sc.nextInt();
		
		map.put(name, new professor(name, id, num, email, les, pay, maj, rank, date));
		
		System.out.println("입력되었습니다.");
		
		 System.out.println("======================================"); 
		 System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		 System.out.print(">>");
		 Scanner scanner = new Scanner(System.in);
		 String prin = scanner.nextLine();
		 switch(prin) {
			case "q" : 
				pro();
				break; 
		 }
		
	}
	
	/* 교수 정보 삭제 */
	public void del(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("2. 교수 정보 삭제");
		System.out.println();
		System.out.println("삭제할 교수의 이름을 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		map.remove(name);
		System.out.println(name +"교수님의 정보는 삭제되었습니다.");
		
		 System.out.println("======================================"); 
		 System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		 System.out.print(">>");
		 Scanner scanner = new Scanner(System.in);
		 String prin = scanner.nextLine();
		 switch(prin) {
			case "q" : 
				pro();
				break; 
		 }
	}
	
	/* 교수 정보 수정 */
	public void fix(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("3. 교수 정보 확인 및 수정 ");
		System.out.println();
		System.out.println("확인 및 수정할 교수의 이름을 입력하세요");
		String name = sc.nextLine();
		
		/* 교수 정보 확인 */
		System.out.println(name +"교수님의 정보입니다.");
		System.out.println(map.get(name));
		
		System.out.println("수정할 데이터를 다음 순서대로 입력하세요");
		System.out.println();
		System.out.println(" 사번 | 전화번호 | 이메일 | 학과 | 월급 | 강의과목 | 직급 | 입사일 |");

		System.out.print("사번 : ");
		int id = sc.nextInt();
		System.out.print("전화번호 : ");
		String num = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("학과 : ");
		String les = sc.next();
		System.out.print("월급 : ");
		int pay = sc.nextInt();
		System.out.print("강의 과목 : ");
		String maj = sc.next();
		System.out.print("직급: ");
		String rank = sc.next();
		System.out.print("입사일 : ");
		int date = sc.nextInt();
		
		map.put(name, new professor(name, id, num, email, les, pay, maj, rank, date));
		
		System.out.println("수정되었습니다.");
		
		 System.out.println("======================================"); 
		 System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		 System.out.print(">>");
		 Scanner scanner = new Scanner(System.in);
		 String prin = scanner.nextLine();
		 switch(prin) {
			case "q" : 
				pro();
				break; 
		 }
	}
	
	/* 교수 정보 검색 */
	public   void search(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("4. 교수 정보 검색");
		System.out.println();
		System.out.println("검색할 교수의 이름을 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name +"교수님의 정보입니다.");
		System.out.println(map.get(name));
	
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) {
			case "q" : 
				pro();
				break; 
     		}
	}
	
	/* 전체 교수 확인 */
	public   void print(){
		System.out.println();
		System.out.println("5. 전체 교수 확인");
		System.out.println();
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) {
			case "q" : 
				pro();
				break; 
		}
	}
}

import java.util.Scanner;
import java.util.HashMap;

/* 직원 관리 */
public class staff extends person{
	public static HashMap<String, staff>map = new HashMap<String, staff>(); 
	public static staff s = new staff();
	String rank;
	int date=0;
	    
	public staff(String name, int id, String num, String email, String les, int pay, String rank, int date){
		super(num, id, email, name, les, pay);
	    	this.rank=rank;
	    	this.date=date;
	}
    
	public staff(){
    	
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append(name).append(" ").append(id).append(" ").append(num).append(" ").append(email).append(" ").
		append(les).append(" ").append(pay).append(" ").append(rank).append(" ").append(date).append(" ");
		return buf.toString();
	}
	
	/* 직원 정보 저장 */
	public static void sta(){
		if(map.size()==0){
			map.put("박준용", new staff("박준용",25892, "01026598248","wnsdlf@naver.com","학사관리", 250,"직원",00000));
			map.put("박준일", new staff("박준일",25986, "01048652185","soria@naver.com","학사관리", 250,"직원",00000));
			map.put("박헤미", new staff("박헤미",65986, "01059824859","hyee@naver.com","학생복지", 250,"직원",00000));
			map.put("백정렬", new staff("백정렬",78956, "01065982428","madsd@naver.com","경리", 250,"직원",00000));
			map.put("송인규", new staff("송인규",30786, "01056598276","zening@naver.com","경리", 250,"직원",00000));
			map.put("신승우", new staff("신승우",80786, "01019824825","luenrn@naver.com","학사관리", 250,"직원",00000));
			map.put("심우식", new staff("심우식",60786, "01076598241","woosick@naver.com","경리", 250,"직원",00000));
			map.put("양현동", new staff("양현동",80786, "01036298562","kjusw@naver.com","학생복지", 250,"직원",00000));
			map.put("오은화", new staff("오은화",30786, "01025436948","oeh@naver.com","학생복지", 250,"직원",00000));
			map.put("오진영", new staff("오진영",60786, "01019598248","ows@naver.com","학사관리", 250,"직원",00000));
		}
		
		System.out.println();
		System.out.println("[직원 관리] ");
		System.out.println();
		System.out.println("=============================================================================");
		System.out.println("1. 정보입력 | 2. 정보 삭제 | 3. 정보 확인 및 수정 | 4. 정보 검색 | 5. 전체 직원 확인  | 0. 초기화면");
		System.out.println("==============================================================================");
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		int select = scan.nextInt();
		switch(select){
			case 1 : 
				s.add(); 
				break; 
			case 2 :
				s.del();
				break; 
			case 3 :
				s.fix();
				break;
			case 4 : 
				s.search();
				break;
			case 5 :
				s.print();
				break; 
			case 0 :
				System.out.println("초기메뉴로 돌아갑니다."); 
				info.main(null); 
		} 
	}

	/* 직원 정보 입력 */
	public void add(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. 직원 정보 입력");
		System.out.println();
		System.out.println("다음을 순서대로 입력하세요");
		System.out.println(" 이름 |사번 | 전화번호 | 이메일 | 소속부서 | 월급  | 직급 | 입사일 |");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("사번 : ");
		int id = sc.nextInt();
		System.out.print("전화번호 : ");
		String num = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("소속부서 : ");
		String les = sc.next();
		System.out.print("월급 : ");
		int pay = sc.nextInt();
		System.out.print("직급: ");
		String rank = sc.next();
		System.out.print("입사일 : ");
		int date = sc.nextInt();
		
		map.put(name, new staff(name, id, num, email, les, pay, rank, date));
		
		System.out.println("입력되었습니다.");
		
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) {
         	case "q" : 
         		sta();
         		break; 
		}
	}
	
	/* 직원 정보 삭제 */
	public void del(){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("2. 직원 정보 삭제");
		System.out.println();
		System.out.println("삭제할 직원의 이름을 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		map.remove(name);
		System.out.println(name +"직원의 정보는 삭제되었습니다.");
		
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) {
         		case "q" : 
         			sta();
         			break; 
		}
	}
	
	/* 직원 정보 수정 */
	public void fix(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("3. 직원 정보 확인 및 삭제");
		System.out.println();
		System.out.println("수정할 직원의 이름을 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name +"직원의 정보입니다.");
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
		System.out.print("소속부서 : ");
		String les = sc.next();
		System.out.print("월급 : ");
		int pay = sc.nextInt();
		System.out.print("직급: ");
		String rank = sc.next();
		System.out.print("입사일 : ");
		int date = sc.nextInt();
		
		map.put(name, new staff(name, id, num, email, les, pay, rank, date));
		
		System.out.println("수정되었습니다");
		
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) {
			case "q" : 
				sta();
				break; 
		}
	}
	
	/* 직원 정보 검색 */
	public   void search(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("4. 직원 정보 검색");
		System.out.println();
		System.out.println("검색할 직원의 이름을 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name +"직원의 정보입니다.");
		System.out.println(map.get(name));
	
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) {
			case "q" : 
				sta();
				break; 
		}
	}
	
	/* 직원 정보 출력 */
	public void print(){ 
		System.out.println();
		System.out.println("5. 전체 직원 확인");
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
				sta();
				break; 
		}
	}
}

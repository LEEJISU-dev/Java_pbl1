import java.util.Scanner;
import java.util.HashMap;

/* 학과 정보 관련 처리 */
public class major {
	
	public static HashMap<String, major>map = new HashMap<String, major>();
	
	String name;	//학과 이름
	String add;	//주소
    	String num;	//전화번호
    	String ass;	//조교명
    	String dean;	//학과장
    	String email;	//이메일
    	String url;	//홈페이지
    
	public major(String name, String add, String num, String ass, String dean, String email, String url){
		this.name=name;
		this.add=add;
		this.num=num;
		this.ass=ass;
		this.dean=dean;
		this.email=email;
		this.url=url;
	}
    
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append(name).append(" ").append(add).append(" ").append(num).append(" ").append(ass).append(" ")
		.append(dean).append(" ").append(email).append(" ").append(url).append(" ");
		return buf.toString();
	}
    
	public static void ma(){
		if(map.size()==0){
			map.put("컴퓨터공학과", new major("컴퓨터공학과","90212","0426297544","변지은","최의인","hnu.kr","http://ce.hannam.ac.kr "));
			map.put("정보통신공학과", new major("정보통신공학과","90417","0426297567","김수인","류성한","hnu.kr","http://ice.hannam.ac.kr "));
			map.put("멀티미디어학과", new major("멀티미디어학과","90603","0426298271","이수현","박병주","hnu.kr","http://multimedia.hnu.ac.kr "));
			map.put("기계공학과", new major("기계공학과","90113","0426298057","이효욱","박문식","hnu.kr","http://me.hannam.ac.kr "));
			map.put("건축공학과", new major("건축공학과","90509","0426298154","윤지향","김건하","hnu.kr","http://ace.hnu.ac.kr "));
			map.put("전자공학과", new major("전자공학과","90212","0426297544","김민경","최인식","hnu.kr","http://ee.hannam.ac.kr"));
			map.put("건축학과", new major("건축학과","60301","0426297996","권미소","신현준","hnu.kr","http://archi.hannam.ac.kr "));
			map.put("산업경영공학과", new major("산업경영공학과","90403","0426297989","윤다솜","김종수","hnu.kr","http://ime.hannam.ac.kr "));
			map.put("광센서공학과", new major("광센서공학과","60107","0426297455","신민정","남충희","hnu.kr","http://pns.hannam.ac.kr "));
			map.put("건설시스템공학과", new major("건설시스템공학과","90104","0426297557","안영은","김건하","hnu.kr","http://civil.hannam.ac.kr "));
			
		}
		
		System.out.println();
		System.out.println("[학과 관리] ");
		System.out.println();
	    	System.out.println("=============================================================================");
		System.out.println("1. 정보입력 | 2. 정보 삭제 | 3. 정보 확인 및 수정 | 4. 정보 검색 | 5. 전체 학과 확인  | 0. 초기화면");
		System.out.println("==============================================================================");
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		int select = scan.nextInt();
        	switch(select)
        	{
			case 1 : 
				add(); 
				break; 
			case 2 :
				del();
				break; 
			case 3 :
				fix();
				break;
			case 4 : 
				search();
				break;
			case 5 :
				print();
				break; 
			case 0 :
				System.out.println("초기메뉴로 돌아갑니다."); 
				info.main(null); 
        	} 
	}
	
	/* 학과 정보 입력 */
	public static void add(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. 학과 정보 입력");
		System.out.println();
		System.out.println("다음을 순서대로 입력하세요");
		System.out.println(" 학과명 | 주소 | 전화번호 | 조교명 | 학과장 | 이메일 | 웹사이트 |");
		System.out.print("학과명 : ");
		String name = sc.next();
		System.out.print("주소: ");
		String add = sc.next();
		System.out.print("전화번호 : ");
		int num = sc.nextInt();
		System.out.print("조교명 : ");
		String ass = sc.next();
		System.out.print("학과장 : ");
		String dean = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("웹사이트 : ");
		String url = sc.next();
		
		System.out.println("입력되었습니다.");
	
		System.out.println("======================================"); 
        	System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
        	System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) 
		{
			case "q" : 
				ma();
				break; 
		}
	}
	
	/* 학과 정보 삭제 */
	public static void del(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("2. 학과 정보 삭제");
		System.out.println();
		System.out.println("삭제할 학과를 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		map.remove(name);
		System.out.println(name +"는(은) 삭제되었습니다.");
	
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) 
		{
			case "q" : 
				ma();
				break; 
		}
	}
	
	/* 학과 정보  */
	public static void fix(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("3. 학과 정보 확인 및 수정");
		System.out.println();
		System.out.println("수정할 학과를 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name +"의 정보입니다.");
		System.out.println(map.get(name));
		
		System.out.println("수정할 데이터를 다음 순서대로 입력하세요");
		System.out.println();
		System.out.println(" 주소 | 전화번호 | 조교명 | 학과장 | 이메일 | 웹사이트 |");
		
		System.out.print("주소: ");
		String add = sc.next();
		System.out.print("전화번호 : ");
		int num = sc.nextInt();
		System.out.print("조교명 : ");
		String ass = sc.next();
		System.out.print("학과장 : ");
		String dean = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("웹사이트 : ");
		String url = sc.next();
		
		
		System.out.println("수정되었습니다.");
	    
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) 
		{
			case "q" : 
				ma();
				break; 
		}
	}
	
	/* 학과 정보 검색 */
	public static void search(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("4. 학과 정보 검색");
		System.out.println();
		System.out.println("검색할 학과를 입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name +"의 정보입니다.");
		System.out.println(map.get(name));
		
		System.out.println("======================================"); 
		System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		String prin = scanner.nextLine();
		switch(prin) 
		{
			case "q" : 
				ma();
				break; 
		}
	}
	/* 전체 학과 확인 */
	public static void print(){
		
		System.out.println();
		System.out.println("5. 전체 학과 확인");
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
				ma();
				break; 
		}
	}


}

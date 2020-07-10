import java.util.Scanner;
import pbl.sub;
import java.util.HashMap;

/* 과목 관리 */
public class subject {
	public static HashMap<Integer, subject>map = new HashMap<Integer, subject>();
    String sub;	//교과목명
    int num;	//학수번호
	
    public subject(int num, String sub){
    	this.num=num;
    	this.sub=sub;
    }
    public String toString(){
        StringBuffer buf = new StringBuffer();
        buf.append(num).append(" ").append(sub).append(" ");
    	return buf.toString();
    }
	public static void sub(){
		if(map.size()==0){
			map.put(98765, new subject(98765,"컴퓨터구조"));
			map.put(87654, new subject(87654,"컴퓨터네트워크"));
			map.put(76543, new subject(76543,"HCI"));
			map.put(65432, new subject(65432,"사이버문화"));
			map.put(54321, new subject(54321,"웹프로그래밍"));
			map.put(43210, new subject(43210,"컴퓨터보안"));
		}
		System.out.println();
		System.out.println("[교과목 관리] ");
		System.out.println();
	    System.out.println("=============================================================================");
		System.out.println("1. 정보입력 | 2. 정보 삭제 | 3. 정보 확인 및 수정 | 4. 정보 검색 | 5. 전체 교과목 확인  | 0. 초기화면");
		System.out.println("==============================================================================");
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		int select = scan.nextInt();
        switch(select){
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

	/* 교과목 정보 입력 */
	public static void add(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. 교과목 정보 입력");
		System.out.println();
		System.out.println("다음을 순서대로 입력하세요");
		System.out.println(" 학수번호 | 교과목명 |");
		System.out.print("학수번호 : ");
		int num = sc.nextInt();
		System.out.print("교과목명 : ");
		String sub = sc.next();
		
		
		map.put(num, new subject(num, sub));
		
		System.out.println("입력되었습니다.");
	
		System.out.println("======================================"); 
        System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) {
        	case "q" : 
        		sub();
        		break; 
		}
	}
	
	/* 교과목 정보 삭제 */
	public static void del(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("2. 교과목 정보 삭제");
		System.out.println();
		System.out.println("삭제할 교과목의 학수번호를 입력하세요");
		System.out.println("학수번호 : ");
		int num = sc.nextInt();
		
		map.remove(num);
		System.out.println(num +"는(은) 삭제되었습니다.");
	
		System.out.println("======================================"); 
        System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) {
        	case "q" : 
        		sub();
        		break; 
		}
	}
	
	/* 교과목 정보 수정 */
	public static void fix(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("3. 교과목 정보 확인 및 수정");
		System.out.println();
		System.out.println("수정할 교과목의 학수번호를 입력하세요");
		System.out.println("학수번호: ");
		int num = sc.nextInt();
		
		System.out.println(num +"의 정보입니다.");
		System.out.println(map.get(num));

		
		System.out.println("수정할 데이터를 다음 순서대로 입력하세요");
		System.out.println();
		System.out.println("| 교과목명 |");
		
		System.out.print("교과목명 : ");
		String sub = sc.next();
		
		map.put(num, new subject(num, sub));
		
		System.out.println("수정되었습니다.");
	    
		System.out.println("======================================"); 
        System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) {
        	case "q" : 
        		sub();
        		break; 
		}
	}
	
	/* 교과목 정보 검색 */
	public static void search(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("4. 교과목 정보 검색");
		System.out.println();
		System.out.println("검색할 교과목의 학수번호를 입력하세요");
		System.out.println("학수번호 : ");
		int num = sc.nextInt();
		
		System.out.println(num +"의 정보입니다.");
		System.out.println(map.get(num));
		
		System.out.println("======================================"); 
        System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) {
        	case "q" : 
        		sub();
        		break; 
		}
	}
	
	/* 전체 학과 확인 */
	public static void print(){
		System.out.println();
		System.out.println("5. 전체 학과 확인");
		System.out.println();
		for(int key : map.keySet()){
			System.out.println(map.get(key));
		}
		
		System.out.println("======================================"); 
        System.out.println("상위메뉴로 돌아가려면 q를 입력하세요.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) {
        	case "q" : 
        		sub();
        		break; 
		}
	}

}

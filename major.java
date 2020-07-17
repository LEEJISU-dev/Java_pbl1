import java.util.Scanner;
import java.util.HashMap;

public class major {
	
	public static HashMap<String, major>map = new HashMap<String, major>();
	
	String name;
	String add;
    String num;
    String ass;
    String dean;
    String email;
    String url;
    
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
			map.put("��ǻ�Ͱ��а�", new major("��ǻ�Ͱ��а�","90212","0426297544","������","������","hnu.kr","http://ce.hannam.ac.kr "));
			map.put("������Ű��а�", new major("������Ű��а�","90417","0426297567","�����","������","hnu.kr","http://ice.hannam.ac.kr "));
			map.put("��Ƽ�̵���а�", new major("��Ƽ�̵���а�","90603","0426298271","�̼���","�ں���","hnu.kr","http://multimedia.hnu.ac.kr "));
			map.put("�����а�", new major("�����а�","90113","0426298057","��ȿ��","�ڹ���","hnu.kr","http://me.hannam.ac.kr "));
			map.put("������а�", new major("������а�","90509","0426298154","������","�����","hnu.kr","http://ace.hnu.ac.kr "));
			map.put("���ڰ��а�", new major("���ڰ��а�","90212","0426297544","��ΰ�","���ν�","hnu.kr","http://ee.hannam.ac.kr"));
			map.put("�����а�", new major("�����а�","60301","0426297996","�ǹ̼�","������","hnu.kr","http://archi.hannam.ac.kr "));
			map.put("����濵���а�", new major("����濵���а�","90403","0426297989","���ټ�","������","hnu.kr","http://ime.hannam.ac.kr "));
			map.put("���������а�", new major("���������а�","60107","0426297455","�Ź���","������","hnu.kr","http://pns.hannam.ac.kr "));
			map.put("�Ǽ��ý��۰��а�", new major("�Ǽ��ý��۰��а�","90104","0426297557","�ȿ���","�����","hnu.kr","http://civil.hannam.ac.kr "));
			
		}
		
		System.out.println();
		System.out.println("[�а� ����] ");
		System.out.println();
	    System.out.println("=============================================================================");
		System.out.println("1. �����Է� | 2. ���� ���� | 3. ���� Ȯ�� �� ���� | 4. ���� �˻� | 5. ��ü �а� Ȯ��  | 0. �ʱ�ȭ��");
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
          	System.out.println("�ʱ�޴��� ���ư��ϴ�."); 
          	info.main(null); 
        } 
	}

	public static void add(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. �а� ���� �Է�");
		System.out.println();
		System.out.println("������ ������� �Է��ϼ���");
		System.out.println(" �а��� | �ּ� | ��ȭ��ȣ | ������ | �а��� | �̸��� | ������Ʈ |");
		System.out.print("�а��� : ");
		String name = sc.next();
		System.out.print("�ּ�: ");
		String add = sc.next();
		System.out.print("��ȭ��ȣ : ");
		int num = sc.nextInt();
		System.out.print("������ : ");
		String ass = sc.next();
		System.out.print("�а��� : ");
		String dean = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("������Ʈ : ");
		String url = sc.next();
		
		System.out.println("�ԷµǾ����ϴ�.");
	
		System.out.println("======================================"); 
        System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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
	
	public static void del(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("2. �а� ���� ����");
		System.out.println();
		System.out.println("������ �а��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		map.remove(name);
		System.out.println(name +"��(��) �����Ǿ����ϴ�.");
	
		System.out.println("======================================"); 
        System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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
	
	public static void fix(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("3. �а� ���� Ȯ�� �� ����");
		System.out.println();
		System.out.println("������ �а��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println(name +"�� �����Դϴ�.");
		System.out.println(map.get(name));
		
		System.out.println("������ �����͸� ���� ������� �Է��ϼ���");
		System.out.println();
		System.out.println(" �ּ� | ��ȭ��ȣ | ������ | �а��� | �̸��� | ������Ʈ |");
		
		System.out.print("�ּ�: ");
		String add = sc.next();
		System.out.print("��ȭ��ȣ : ");
		int num = sc.nextInt();
		System.out.print("������ : ");
		String ass = sc.next();
		System.out.print("�а��� : ");
		String dean = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("������Ʈ : ");
		String url = sc.next();
		
		
		System.out.println("�����Ǿ����ϴ�.");
	    
		System.out.println("======================================"); 
        System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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
	public static void search(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("4. �а� ���� �˻�");
		System.out.println();
		System.out.println("�˻��� �а��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println(name +"�� �����Դϴ�.");
		System.out.println(map.get(name));
		
		System.out.println("======================================"); 
        System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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
	public static void print(){
		
		System.out.println();
		System.out.println("5. ��ü �а� Ȯ��");
		System.out.println();
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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

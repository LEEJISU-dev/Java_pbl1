import java.util.Scanner;
import java.util.HashMap;
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
	public static void sta(){
		
		if(map.size()==0){
			map.put("���ؿ�", new staff("���ؿ�",25892, "01026598248","wnsdlf@naver.com","�л����", 250,"����",00000));
			map.put("������", new staff("������",25986, "01048652185","soria@naver.com","�л����", 250,"����",00000));
			map.put("�����", new staff("�����",65986, "01059824859","hyee@naver.com","�л�����", 250,"����",00000));
			map.put("������", new staff("������",78956, "01065982428","madsd@naver.com","�渮", 250,"����",00000));
			map.put("���α�", new staff("���α�",30786, "01056598276","zening@naver.com","�渮", 250,"����",00000));
			map.put("�Ž¿�", new staff("�Ž¿�",80786, "01019824825","luenrn@naver.com","�л����", 250,"����",00000));
			map.put("�ɿ��", new staff("�ɿ��",60786, "01076598241","woosick@naver.com","�渮", 250,"����",00000));
			map.put("������", new staff("������",80786, "01036298562","kjusw@naver.com","�л�����", 250,"����",00000));
			map.put("����ȭ", new staff("����ȭ",30786, "01025436948","oeh@naver.com","�л�����", 250,"����",00000));
			map.put("������", new staff("������",60786, "01019598248","ows@naver.com","�л����", 250,"����",00000));
			}
		
		System.out.println();
		System.out.println("[���� ����] ");
		System.out.println();
	    System.out.println("=============================================================================");
		System.out.println("1. �����Է� | 2. ���� ���� | 3. ���� Ȯ�� �� ���� | 4. ���� �˻� | 5. ��ü ���� Ȯ��  | 0. �ʱ�ȭ��");
		System.out.println("==============================================================================");
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		int select = scan.nextInt();
        switch(select)
        {
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
          	System.out.println("�ʱ�޴��� ���ư��ϴ�."); 
          	info.main(null); 
        } 
	}

	public   void add(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. ���� ���� �Է�");
		System.out.println();
		System.out.println("������ ������� �Է��ϼ���");
		System.out.println(" �̸� |��� | ��ȭ��ȣ | �̸��� | �ҼӺμ� | ����  | ���� | �Ի��� |");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("��� : ");
		int id = sc.nextInt();
		System.out.print("��ȭ��ȣ : ");
		String num = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("�ҼӺμ� : ");
		String les = sc.next();
		System.out.print("���� : ");
		int pay = sc.nextInt();
		System.out.print("����: ");
		String rank = sc.next();
		System.out.print("�Ի��� : ");
		int date = sc.nextInt();
		
		map.put(name, new staff(name, id, num, email, les, pay, rank, date));
		
		System.out.println("�ԷµǾ����ϴ�.");
		
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		sta();
         		break; 
   }
	}
	public   void del(){
		 
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("2. ���� ���� ����");
		System.out.println();
		System.out.println("������ ������ �̸��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		map.remove(name);
		System.out.println(name +"������ ������ �����Ǿ����ϴ�.");
		
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		sta();
         		break; 
   }
	}
	
	public   void fix(){
		 
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("3. ���� ���� Ȯ�� �� ����");
		System.out.println();
		System.out.println("������ ������ �̸��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println(name +"������ �����Դϴ�.");
		System.out.println(map.get(name));
		
		System.out.println("������ �����͸� ���� ������� �Է��ϼ���");
		System.out.println();
		System.out.println(" ��� | ��ȭ��ȣ | �̸��� | �а� | ���� | ���ǰ��� | ���� | �Ի��� |");
		
		System.out.print("��� : ");
		int id = sc.nextInt();
		System.out.print("��ȭ��ȣ : ");
		String num = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("�ҼӺμ� : ");
		String les = sc.next();
		System.out.print("���� : ");
		int pay = sc.nextInt();
		System.out.print("����: ");
		String rank = sc.next();
		System.out.print("�Ի��� : ");
		int date = sc.nextInt();
		
		map.put(name, new staff(name, id, num, email, les, pay, rank, date));
		
		System.out.println("�����Ǿ����ϴ�");
		
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		sta();
         		break; 
   }
	}
	public   void search(){
		 
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("4. ���� ���� �˻�");
		System.out.println();
		System.out.println("�˻��� ������ �̸��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println(name +"������ �����Դϴ�.");
		System.out.println(map.get(name));
	
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		sta();
         		break; 
   }
	}
	public   void print(){
		 
		System.out.println();
		System.out.println("5. ��ü ���� Ȯ��");
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
         		sta();
         		break; 
   }
	}
}

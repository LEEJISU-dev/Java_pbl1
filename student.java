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
			map.put("�����", new student("�����",20120786, "01026598248","rudals@naver.com","��ǻ�Ͱ��а�", 210,"HCI",3.0));
			map.put("������", new student("������",20141175, "01078965432","gurqja@naver.com","��ǻ�Ͱ��а�", 130,"HCI",3.4));
			map.put("�輭��", new student("�輭��",20130395, "01052583659","tigml@naver.com","��ǻ�Ͱ��а�", 50,"HCI",3.8));
			map.put("������", new student("������",20140632, "01029536598","doo@naver.com","��ǻ�Ͱ��а�", 100,"HCI",4.2));
			map.put("������", new student("������",20130752, "01084589965","singha@naver.com","��ǻ�Ͱ��а�", 60,"HCI",2.8));
			map.put("������", new student("������",20140597, "01026598745","heain@naver.com","��ǻ�Ͱ��а�", 250,"HCI",3.5));
			map.put("�ڱ��", new student("�ڱ��",20120781, "01058479532","riqjack@naver.com","��ǻ�Ͱ��а�", 150,"HCI",4.5));
			map.put("�ڵ���", new student("�ڵ���",20113117, "01059874562","cvdwe@naver.com","��ǻ�Ͱ��а�", 145,"HCI",3.6));
			map.put("�ڽ¼�", new student("�ڽ¼�",20120778, "01089532652","wojuro@naver.com","��ǻ�Ͱ��а�", 80,"HCI",2.5));
			map.put("������", new student("������",20130732, "01032959783","llone@naver.com","��ǻ�Ͱ��а�", 200,"HCI",4.1));
			}
		
		System.out.println();
		System.out.println("[�л� ����] ");
		System.out.println();
	    System.out.println("=============================================================================");
		System.out.println("1. �����Է� | 2. ���� ���� | 3. ���� Ȯ�� �� ���� | 4. ���� �˻� | 5. ��ü �л� Ȯ��  | 0. �ʱ�ȭ��");
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
          	System.out.println("�ʱ�޴��� ���ư��ϴ�."); 
          	info.main(null); 
        } 
	}

	public   void add(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. �л� ���� �Է�");
		System.out.println();
		System.out.println("������ ������� �Է��ϼ���");
		System.out.println(" �̸� | �й� | ��ȭ��ȣ | �̸��� | �Ҽ��а� | ���бݳ���  | �������� | ���� |");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�й� : ");
		int id = sc.nextInt();
		System.out.print("��ȭ��ȣ : ");
		String num = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("�Ҽ��а� : ");
		String les = sc.next();
		System.out.print("���бݳ��� : ");
		int pay = sc.nextInt();
		System.out.print("��������: ");
		String sub = sc.next();
		System.out.print("���� : ");
		double grade = sc.nextDouble();
		
		map.put(name, new student(name, id, num, email, les, pay, sub, grade));
		
		System.out.println("�ԷµǾ����ϴ�.");
		
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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
		System.out.println("2. �л� ���� ����");
		System.out.println();
		System.out.println("������ �л��� �̸��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		map.remove(name);
		System.out.println(name +"�л��� ������ �����Ǿ����ϴ�.");
	
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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
		System.out.println("4. �л� ���� �˻�");
		System.out.println();
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println(name +"�л��� �����Դϴ�.");
		System.out.println(map.get(name));
		
		System.out.println("������ �����͸� ���� ������� �Է��ϼ���");
		System.out.println();
		System.out.println(" �̸� | �й� | ��ȭ��ȣ | �̸��� | �Ҽ��а� | ���бݳ���  | �������� | ���� |");
		
		System.out.print("�й� : ");
		int id = sc.nextInt();
		System.out.print("��ȭ��ȣ : ");
		String num = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("�Ҽ��а� : ");
		String les = sc.next();
		System.out.print("���бݳ��� : ");
		int pay = sc.nextInt();
		System.out.print("��������: ");
		String sub = sc.next();
		System.out.print("���� : ");
		double grade = sc.nextDouble();
		
        map.put(name, new student(name, id, num, email, les, pay, sub, grade));
		
		System.out.println("�����Ǿ����ϴ�.");
	
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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
		System.out.println("4. �л� ���� �˻�");
		System.out.println();
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println(name +"�л��� �����Դϴ�.");
		
		System.out.println(map.get(name));
		
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
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
		System.out.println("5. ��ü �л� Ȯ��");
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
         		
         		stu();
         		break; 
   }
	}

}

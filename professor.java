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
    	super(name, id, num, email, les, pay);//��ĳ����
    	this.maj=maj;
    	this.rank=rank;
    	this.date=date;
    }
    
    public professor(){
    	
    }
    

    
//�������̵�
	public String toString(){
        StringBuffer buf = new StringBuffer();
        buf.append(name).append(" ").append(id).append(" ").append(num).append(" ").append(email).append(" ").
        append(les).append(" ").append(pay).append(" ").append(maj).append(" ").append(rank).append(" ").append(date).append(" ");
    	return buf.toString();
    }

	public static void pro(){
		
		if(map.size()==0){
		map.put("������", new professor("������",12345, "0426297981","eichol@hnu.kr","��ǻ�Ͱ��а�", 300, "�����ͺ��̽�","����",00000000));
		map.put("�̻�", new professor("�̻�",23456, "0426297551","sglee@hnu.kr","��ǻ�Ͱ��а�", 300, "��ǻ�ͱ��� �� �����̷�","����",00000000));
		map.put("�ڿ���", new professor("�ڿ���",34567, "0426297547","woojunpark@gmail.com","��ǻ�Ͱ��а�", 300, "���α׷��־��","����",00000000));
		map.put("�̰���", new professor("�̰���",45678, "0426297549","gslee@hnu.kr","��ǻ�Ͱ��а�", 300, "����Ʈ�������","����",00000000));
		map.put("�̱�", new professor("�� ��",56789, "0426297550","leegeuk@hnu.kr","��ǻ�Ͱ��а�", 300, "������ȣ �� �ΰ�����","����",00000000));
		map.put("���籤", new professor("���籤",67890, "0426297559","jklee@hnu.kr","��ǻ�Ͱ��а�", 300, "��ǻ�ͳ�Ʈ��ũ","����",00000000));
		map.put("�ҿ쿵", new professor("�ҿ쿵",78901, "0426297657","wsoh@hnu.kr","��ǻ�Ͱ��а�", 300, "������Ʈ���ΰ�����","����",00000000));
		map.put("������", new professor("������",89012, "0426298531","ktkim@hnu.kr","������Ű��а�", 300, "���м���Ʈ����","�α���",00000000));
		map.put("�ڴ�ö", new professor("�ڴ�ö",90123, "0426297571","deachul@hnu.kr","������Ű��а�", 300, "�̵������ó��","����",00000000));
		map.put("�ڼ���", new professor("�ڼ���",01234, "0426297398","swpark@hnu.kr","������Ű��а�", 300, "��ǻ����Ÿ�","����",00000000));
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
          	System.out.println("�ʱ�޴��� ���ư��ϴ�."); 
          	info.main(null); 
        } 
	}

	public void add(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. ���� ���� �Է�");
		System.out.println();
		System.out.println("������ ������� �Է��ϼ���");
		System.out.println(" �̸� |��� | ��ȭ��ȣ | �̸��� | �а� | ���� | ���ǰ��� | ���� | �Ի��� |");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("��� : ");
		int id = sc.nextInt();
		System.out.print("��ȭ��ȣ : ");
		String num = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("�а� : ");
		String les = sc.next();
		System.out.print("���� : ");
		int pay = sc.nextInt();
		System.out.print("���� ���� : ");
		String maj = sc.next();
		System.out.print("����: ");
		String rank = sc.next();
		System.out.print("�Ի��� : ");
		int date = sc.nextInt();
		
		map.put(name, new professor(name, id, num, email, les, pay, maj, rank, date));
		
		System.out.println("�ԷµǾ����ϴ�.");
		
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		pro();
         		break; 
   }
		
	}
	public void del(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("2. ���� ���� ����");
		System.out.println();
		System.out.println("������ ������ �̸��� �Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		map.remove(name);
		System.out.println(name +"�������� ������ �����Ǿ����ϴ�.");
		
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         		
         		pro();
         		break; 
   }
	}
	public void fix(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("3. ���� ���� Ȯ�� �� ���� ");
		System.out.println();
		System.out.println("Ȯ�� �� ������ ������ �̸��� �Է��ϼ���");
		String name = sc.nextLine();
		
		System.out.println(name +"�������� �����Դϴ�.");
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
		System.out.print("�а� : ");
		String les = sc.next();
		System.out.print("���� : ");
		int pay = sc.nextInt();
		System.out.print("���� ���� : ");
		String maj = sc.next();
		System.out.print("����: ");
		String rank = sc.next();
		System.out.print("�Ի��� : ");
		int date = sc.nextInt();
		
		map.put(name, new professor(name, id, num, email, les, pay, maj, rank, date));
		
		System.out.println("�����Ǿ����ϴ�.");
		
		 System.out.println("======================================"); 
         System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
         System.out.print(">>");
         Scanner scanner = new Scanner(System.in);
         String prin = scanner.nextLine();
         switch(prin) 
         {
         	case "q" : 
         	
         		pro();
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
		
		System.out.println(name +"�������� �����Դϴ�.");
		System.out.println(map.get(name));
	
	
	 System.out.println("======================================"); 
     System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
     System.out.print(">>");
     Scanner scanner = new Scanner(System.in);
     String prin = scanner.nextLine();
     switch(prin) 
     {
     	case "q" : 
     	
     		pro();
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
         		
         		pro();
         		break; 
   }
	}

}

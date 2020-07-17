import java.util.Scanner;

import pbl.sub;

import java.util.HashMap;

public class subject {
	public static HashMap<Integer, subject>map = new HashMap<Integer, subject>();
	
    String sub;
    int num;
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
			map.put(98765, new subject(98765,"��ǻ�ͱ���"));
			map.put(87654, new subject(87654,"��ǻ�ͳ�Ʈ��ũ"));
			map.put(76543, new subject(76543,"HCI"));
			map.put(65432, new subject(65432,"���̹���ȭ"));
			map.put(54321, new subject(54321,"�����α׷���"));
			map.put(43210, new subject(43210,"��ǻ�ͺ���"));
		}
		System.out.println();
		System.out.println("[������ ����] ");
		System.out.println();
	    System.out.println("=============================================================================");
		System.out.println("1. �����Է� | 2. ���� ���� | 3. ���� Ȯ�� �� ���� | 4. ���� �˻� | 5. ��ü ������ Ȯ��  | 0. �ʱ�ȭ��");
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
		System.out.println("1. ������ ���� �Է�");
		System.out.println();
		System.out.println("������ ������� �Է��ϼ���");
		System.out.println(" �м���ȣ | ������� |");
		System.out.print("�м���ȣ : ");
		int num = sc.nextInt();
		System.out.print("������� : ");
		String sub = sc.next();
		
		
		map.put(num, new subject(num, sub));
		
		System.out.println("�ԷµǾ����ϴ�.");
	
		System.out.println("======================================"); 
        System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) 
        {
        	case "q" : 
        		sub();
        		break; 
  }
	}
	public static void del(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("2. ������ ���� ����");
		System.out.println();
		System.out.println("������ �������� �м���ȣ�� �Է��ϼ���");
		System.out.println("�м���ȣ : ");
		int num = sc.nextInt();
		
		map.remove(num);
		System.out.println(num +"��(��) �����Ǿ����ϴ�.");
	
		System.out.println("======================================"); 
        System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) 
        {
        	case "q" : 
        		sub();
        		break; 
  }
	}
	public static void fix(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("3. ������ ���� Ȯ�� �� ����");
		System.out.println();
		System.out.println("������ �������� �м���ȣ�� �Է��ϼ���");
		System.out.println("�м���ȣ: ");
		int num = sc.nextInt();
		
		System.out.println(num +"�� �����Դϴ�.");
		System.out.println(map.get(num));

		
		System.out.println("������ �����͸� ���� ������� �Է��ϼ���");
		System.out.println();
		System.out.println("| ������� |");
		
		System.out.print("������� : ");
		String sub = sc.next();
		
		map.put(num, new subject(num, sub));
		
		System.out.println("�����Ǿ����ϴ�.");
	    
		System.out.println("======================================"); 
        System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) 
        {
        	case "q" : 
        		sub();
        		break; 
  }
	}
	public static void search(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("4. ������ ���� �˻�");
		System.out.println();
		System.out.println("�˻��� �������� �м���ȣ�� �Է��ϼ���");
		System.out.println("�м���ȣ : ");
		int num = sc.nextInt();
		
		System.out.println(num +"�� �����Դϴ�.");
		System.out.println(map.get(num));
		
		System.out.println("======================================"); 
        System.out.println("�����޴��� ���ư����� q�� �Է��ϼ���.");
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String prin = scanner.nextLine();
        switch(prin) 
        {
        	case "q" : 
        		sub();
        		break; 
  }
	}
	public static void print(){
		System.out.println();
		System.out.println("5. ��ü �а� Ȯ��");
		System.out.println();
		for(int key : map.keySet()){
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
         		sub();
         		break; 
   }
	}

}

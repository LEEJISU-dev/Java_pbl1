
import java.util.Scanner;


public class info {

	public static void main(String[] args) {
		System.out.println("������"); 
        System.out.println("�̸� : "+main.getName()+", �а� : "+main.getDep()+", �й� : "+main.getNum());//private
		System.out.println();
		System.out.println("[���� ���� �ý���]");
		System.out.println();
	    System.out.println("==================================================================");
		System.out.println("1. ���� ���� | 2. ���� ����| 3. �л� ���� | 4. �а� ���� | 5. ������ ����  | 0. �ʱ�ȭ��");
		System.out.println("==================================================================");
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		int select = scan.nextInt();
        switch(select)
        {
          case 1 : 
        	professor.pro(); 
        	break; 
          case 2 :
          	staff.sta();
          	break; 
          case 3 :
          	student.stu();
          	break;
          case 4 : 
          	major.ma();
          	break;
          case 5 :
          	subject.sub();
          	break; 
          case 0 :
          	System.out.println("���α׷��� �����մϴ�."); 
          	System.exit(0); 
        } 
		
		
	}

}

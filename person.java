
public abstract class person {
	String num;
	int id;
    String email;
    String name;
    String les;
    int pay;
    
    public person(String num, int id, String email, String name, String les, int pay){
    	this.name=name;
    	this.num=num;
    	this.id=id;
    	this.email=email;
    	this.les=les;
    	this.pay=pay;
    }
    //�����ε�
    public person(){
    	
    }

	//abstract Ŭ����
		public abstract void add();
		public abstract void del();
		public abstract void fix();
		public abstract void search();
		public abstract void print();

	}


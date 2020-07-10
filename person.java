
public abstract class person {
	String num;	//이름
	int id;		//학번
	String email;	//이메일
	String name;	//이름
	String les;	//소속학과
	int pay;	//장학금내역
    
    public person(String num, int id, String email, String name, String les, int pay){
    	this.name=name;
    	this.num=num;
    	this.id=id;
    	this.email=email;
    	this.les=les;
    	this.pay=pay;
    }
    //오버로딩
    public person(){
    	
    }

	//abstract 클래스
	public abstract void add();	//정보입력
	public abstract void del();	//정보삭제
	public abstract void fix();	//정보수정
	public abstract void search();	//정보검색
	public abstract void print();	//목록출력

}


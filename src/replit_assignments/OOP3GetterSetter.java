package replit_assignments;

public class OOP3GetterSetter {
/*
 In  Db class we have two attributes/instance variables with the private visibility. 
 meaning they cannot be accessed outside of the class.
Instance variables:
   1) name: data -  
       type: String
       Visibility/Access modifier: private
   2) name: yint -  
       type: int
       Visibility/Access modifier: private
Methods:
    - insertData - lets you set the values to above encapsulated instance variables.
    - getData - getter method for private data
    - getYint - getter method for private yint
    - setData - setter method for private data
    - setYint - setter method for private yint
for example:
 Db db = new Db();
 db.insertData("aaa",123);
   
 System.out.println(db.getData());//aaa
 System.out.println(db.getYint());//123
  
 db.setData("zzz");
 db.setYint(200);
  
 System.out.println(db.getData());//zzz
 System.out.println(db.getYint());//200
 */
	private String data;
	private int yint;
	
	public void insertData(String data, int yint) {
		this.data=data;
		this.yint=yint;
	}
	
	public String getData() {
		return data;
	}
	public int getYint() {
		return yint;
	}
	public void setData(String data) {
		this.data=data;
	}
	public void setYint(int yint) {
		this.yint=yint;
	}

	public static void main(String[] args) {

		OOP3GetterSetter a=new OOP3GetterSetter();
		a.insertData("I'm rich man", 985000);
		System.out.println(a.getData());
		System.out.println(a.getYint());
		a.setData("My salary is 127K");
		a.setYint(1000000);
		System.out.println(a.getData());
		System.out.println("My house worth a $"+a.getYint());
		
	}	
	
}

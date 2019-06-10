import java.io.Serializable;

public class Seobj implements Serializable{

	//序列化时，对象所在的类的UID需要相同
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	public String GetName()
	{
		return this.name;
	}
	
	public void SetName(String nm)
	{
		this.name = nm;
	}
	
	public int GetAge()
	{
		return this.age;
	}
	
	public void SetAge(int ag)
	{
		this.age = ag;
	}
	
	public String toString() {
		
       return "Name : "+ this.name + " Age: " + this.age;
	}

}

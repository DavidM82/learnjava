package inner;

public class InnerClassExample {

	private String myMember1;
	
	public InnerClassExample(String member1) {
		this.myMember1 = member1;
	}
	
	public String getMyMember1() { return myMember1;}
	
	public void userMyInnerClass() {
		MyInnerClass myInnerClass = new MyInnerClass("test2");
		String innerClassMyMember2 = myInnerClass.getMyMember2();
		System.out.println(innerClassMyMember2);
	}
	
	private class MyInnerClass{
		private String myMember2;
		
		public MyInnerClass(String member2) {
			this.myMember2 = member2;
		}
		
		public String getMyMember2() { return myMember2;}
		
		public String etMyMember1() {return myMember1;}
	}
}

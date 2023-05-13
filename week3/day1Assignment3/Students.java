package week3.day1Assignment3;

public class Students {
	//----------------Assignment:4 Method Overloading-------------------------//
		public void getStudentInfo(int id) {
			System.out.println(id+" ");
			
		}
		public void getStudentInfo(String id, String name) {
			System.out.println(id+" "+name);
			
		}
		public void mul(String mail, String mobNo) {
			System.out.println(mail+" "+mobNo);
			
		}
		

		public static void main(String[] args) {
			Students st = new Students();
			st.getStudentInfo(101);
			st.getStudentInfo("101", "Nisha");
			st.getStudentInfo("nisha123@gmail.com", "0123456789");
			
		}
}

public class MultiCatch {
	
	public void foo() {
		try {
			System.out.println("teste");
		}catch(IOException | SQLException e) {
			System.out.println(" ok");
		}
	}
	
}
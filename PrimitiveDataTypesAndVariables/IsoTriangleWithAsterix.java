
public class IsoTriangleWithAsterix {

	public static void main(String[] args) {
		char ast='*';
		int triangleHeight=10;
		
		for (int i = 1; i < triangleHeight; i++) {
			
			for (int j = 1; j <i; j++) {
				System.out.print(ast);
			}
			System.out.println();
		}
	}
}

import java.awt.Rectangle;
import java.sql.Ref;

public class AccessorsMutators{
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(20, 50);
		rectangle.grow(5, 5);
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getHeight());
	}
}
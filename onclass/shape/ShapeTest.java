package exercise.onclass.shape;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {
	public void testArea() {
		assertEquals(new Dot(new CartPt(4, 3)).area(), 0.0, 0.01);
		assertEquals(new Square(new CartPt(4, 3), 30).area(), 900, 0.01);
		assertEquals(new Circle(new CartPt(5, 5), 20).area(), 1256.64, 0.01);

		IShape s1 = new Dot(new CartPt(4, 3));
		IShape s2 = new Square(new CartPt(4, 3), 30);
		IShape s3 = new Circle(new CartPt(5, 5), 20);
		assertEquals(s1.area(), 0.0, 0.01);
		assertEquals(s2.area(), 900, 0.01);
		assertEquals(s3.area(), 1256.64, 0.01);
	}

	public void testDistanceToO() {
		assertEquals(new Dot(new CartPt(4, 3)).distanceToO(), 5.0, 0.001);
		assertEquals(new Square(new CartPt(4, 3), 30).distanceToO(), 5.0, 0.001);
		assertEquals(new Circle(new CartPt(12, 5), 20).distanceToO(), 13.0, 0.001);

	}

}

package exercise.lab4_2.records;

import junit.framework.TestCase;

/*
 * Images(String name, double sizes, int height, int width, String quality)
 * Texts(String name, double sizes, int numberOfLines)
 * Sounds(String name, double sizes, TimeSound playingTime)
 */
public class RecordsTest extends TestCase {
	public void testContructor() {
		Images images = new Images("stored in flower.gif", 57.234, 100, 50, "medium");
		Texts texts = new Texts("ABC", 100.0, 200);
		TimeSound timeSound = new TimeSound(3, 1);
		Sounds sounds = new Sounds("sounds", 100, timeSound);
	}
}

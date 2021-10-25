package exercise.lab4_5.records;

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

//	test timeToDownload
	public void testTimeDownload() {
		Texts texts = new Texts("ABC", 100.0, 200);

		assertEquals(texts.timeToDownload(50), 2.0);
	}

//test smallerThan
	public void testSmallerThan() {
		Images images = new Images("stored in flower.gif", 57.234, 100, 50, "medium");
		assertTrue(images.smallerThan(100));
	}

// test sameName
	public void testSameName() {
		TimeSound timeSound = new TimeSound(3, 1);
		Sounds sounds = new Sounds("sounds", 100, timeSound);
		
		assertTrue(sounds.sameName("sounds"));
	}
}

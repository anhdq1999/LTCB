package exercise.lab4_5.records;

/*
 * tạo class Records gồm các thuộc tính
 * name, sizes
 */
public abstract class Records {
	protected String name;
	protected double sizes;

	public Records(String name, double sizes) {
		super();
		this.name = name;
		this.sizes = sizes;
	}

	/*
	 * timeToDownload, which computes how long it takes to download a file at some
	 * network connection speed, typically given in bytes per second;
	 */
	public double timeToDownload(int networkSpeed) {
		return this.sizes / networkSpeed;
	}

	/*
	 * smallerThan, which determines whether the file is smaller than some given
	 * maximum size that can be mailed as an attachment
	 */
	public boolean smallerThan(double maxSize) {
		return this.sizes < maxSize;
	};

	/*
	 * sameName, which determines whether the name of a file is the same as some
	 * given name.
	 */
	public boolean sameName(String name) {
		return this.name.equals(name);
	};
}

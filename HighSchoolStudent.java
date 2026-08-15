
public class HighSchoolStudent extends SchoolStudent {
	//using getters and setters
	protected String house;
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public static String getHeadGirlOrBoy() {
		return headGirlOrBoy;
	}
	public static void setHeadGirlOrBoy(String headGirlOrBoy) {
		HighSchoolStudent.headGirlOrBoy = headGirlOrBoy;
	}
	protected int std;
	protected char section;
	protected static String headGirlOrBoy;
}

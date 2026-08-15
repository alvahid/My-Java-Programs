
public class NurseryStudent extends SchoolStudent{

	protected boolean getsSweets;
	public boolean isGetsSweets() {
		return getsSweets;
	}
	public void setGetsSweets(boolean getsSweets) {
		this.getsSweets = getsSweets;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	protected String classes;
	protected char section;
}

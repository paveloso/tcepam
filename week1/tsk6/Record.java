public class Record {
	
	private String note;
	
	Record() {}
	
	Record(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Record note = " + note;
	}
	
	

}

public class Notes {
	
	Record[] records = new Record[10];
	
	void add(Record r) {
		int i = 0;
		if (records[0] == null) {
			records[0] = r;
		} else {
			while (records[i] != null) {
				i++;
			}
			records[i] = r;
		}
	}
	
	void delete(Record r) {
		int i = 0;
		while (records[i] != r) {
			i++;
		}
		records[i] = null;
	}
	
	void edit(Record r, String s) {
		int i = 0;
		while (records[i] != r) {
			i++;
		}
		records[i].setNote(s);
	}
	
	void edit(int i, String s) {
		records[i].setNote(s);
	}
	
	void showAll() {
		for (int i = 0; i < records.length; i++) {
			if (records[i] != null) {
				System.out.println(i + ". " + records[i]);
			}
		}
	}

}

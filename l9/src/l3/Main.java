package l3;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/*Command cmd1 = new OpenCommand("C:\\Users\\student.LABS-NG-BLANK\\Desktop");
        cmd1.Execute();
        Command cmd2 = new StatisticCommand();
        cmd2.Execute();
        DocumentManager.GetInstance().GetBook().print();
*/
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		FirstObserver firstObserver = new FirstObserver();
		SecondObserver secondObserver = new SecondObserver();
		cap1.addObserver(firstObserver);
		cap1.addObserver(secondObserver);
		p1.addObserver(firstObserver);
		p1.addObserver(secondObserver);
		p2.addObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1");
		p1.setNewValue("PARAGRAPH 2");
		p2.setNewValue("PARAGRAPH 3");
		cap1.removeObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1.1");
		
	}

}

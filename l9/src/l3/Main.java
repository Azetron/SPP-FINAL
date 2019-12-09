package l3;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Section cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(new Paragraph("Another One"));
		cap1.add(new Paragraph("Another Two"));
		cap1.add(new Paragraph("Another Three"));
		DocumentManager.GetInstance().SetBook(cap1);
		System.out.println("Book Content: ");
		DocumentManager.GetInstance().GetBook().print();

		new DeleteCommand().Execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.GetInstance().GetBook().print();
		new DeleteCommand().Execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.GetInstance().GetBook().print();
		
		Command undoCommand = new UndoCommand();
		undoCommand.Execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.GetInstance().GetBook().print();
		undoCommand.Execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.GetInstance().GetBook().print();
		
	}

}

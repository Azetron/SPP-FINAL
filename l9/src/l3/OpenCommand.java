package l3;

public class OpenCommand implements Command{
	private String _pathToJSON;

    public OpenCommand(String path){
        this._pathToJSON = path;
    }

    @Override
    public void Execute() {
        JSONBuilder builder = new JSONBuilder();
        builder.Build();
        Book newBook = new Book("book 1");
        newBook.addContent(builder.GetResult());
        DocumentManager.GetInstance().SetBook(newBook);
        newBook.print();
    }

	@Override
	public void unExecute() {
		// TODO Auto-generated method stub
		
	}
}

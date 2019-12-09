package l3;

import java.util.Stack;

public class DocumentManager {

	//private int UndoBuffer;
	
	private static DocumentManager _documentManager = null;
    private Book _book;
    private Section s;

   Stack<Command> stack = new Stack<Command>();
    
    private DocumentManager(){

    }

    public static DocumentManager GetInstance(){
        if(_documentManager == null){
            _documentManager = new DocumentManager();
        }
        return _documentManager;
    }

    public void SetBook(Book book){
        this._book = book;
    }
    
    public void SetBook(Section section) {
    	this.s=section;
    }
    public Book GetBook(){
        return this._book;
    }
    public Section GetSection() {
    	return this.s;
    }
    public void addCommand(Command c) {
    	stack.push(c);
    }
    public Command getLastCommand() {
		return stack.get(stack.size()-1);
    	
    }
}

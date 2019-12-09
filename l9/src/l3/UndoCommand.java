package l3;

import java.util.Stack;

public class UndoCommand implements Command{

	Stack<Command> stack = new Stack<Command>();
	
	@Override
	public void Execute() {
		
		
	}

	@Override
	public void unExecute() {
		// TODO Auto-generated method stub
		
	}

}

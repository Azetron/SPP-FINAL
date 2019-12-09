package l3;

import java.util.Stack;

public class DeleteCommand implements Command{

	Stack<Command> stack = new Stack<Command>();

	@Override
	public void Execute() {
		stack.pop();
	}

	@Override
	public void unExecute() {
		// TODO Auto-generated method stub
		
	}

}

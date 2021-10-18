package pratica08;

import java.util.ArrayList;
import java.util.List;

public class DocumentInstance {
	private final Document _doc = new Document();
    private final List<Command> _commands = new ArrayList<>();

    public void redo(int i) {
    	_commands.get(i).redo();
    }

    public void undo(int i) {
    	_commands.get(i).undo();
    }

    public void write(String text) {
        DocumentEditCommand command = new DocumentEditCommand(_doc, text);
        _commands.add(command);
    }

    public String Read(){
      return _doc.read();
    }
}

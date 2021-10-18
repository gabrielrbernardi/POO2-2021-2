package pratica08;

public class DocumentEditCommand implements Command {
	private final Document _editableDoc;
    private final String _text;

    /*
     * Construtor
     * */
    public DocumentEditCommand(Document document, String text) {
        _editableDoc = document;
        this._text = text;
        _editableDoc.write(text);
    }


    @Override
    public void redo() {
        _editableDoc.write(_text);
    }

    @Override
    public void undo() {
        _editableDoc.erase(_text);
    }
}

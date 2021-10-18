package pratica08;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private List<String> _textArray = new ArrayList<>();

    public void write(String text) {
    	_textArray.add(text);
    }

    public void erase(String text) {
    	_textArray.remove(text);
    }

    public void erase(int textLevel) {
    	_textArray.remove(textLevel);
    }

    public String read() {
        return _textArray.stream().reduce("", (a, b) -> a + b);
    }
}

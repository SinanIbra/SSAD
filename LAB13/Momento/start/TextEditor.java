package LAB13.Momento.start;

import java.util.Stack;

public class TextEditor {
    private StringBuilder text;

    public TextEditor() {
        text = new StringBuilder();
    }

    public void appendText(String newText) {
        text.append(newText);
    }

    public String getText() {
        return text.toString();
    }

    //    Implement the save method
    public Memento save() {
        return null;
    }

    //    Implement the restore method
    public void restore(Memento memento) {
    }
}



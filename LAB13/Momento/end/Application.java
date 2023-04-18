package LAB13.Momento.end;

// Client
public class Application {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        UndoRedoManager undoRedoManager = new UndoRedoManager();

        // Initial text
        System.out.println("Initial text: " + editor.getText());

        // Append some text and save state
        editor.appendText("Hello");
        undoRedoManager.saveState(editor);
        System.out.println("After appending 'Hello': " + editor.getText());

        // Append more text and save state
        editor.appendText(" World");
        undoRedoManager.saveState(editor);
        System.out.println("After appending ' World': " + editor.getText());

        // Undo and show state
        undoRedoManager.undo(editor);
        System.out.println("After undoing: " + editor.getText());

        // Redo and show state
        undoRedoManager.redo(editor);
        System.out.println("After redoing: " + editor.getText());
    }
}

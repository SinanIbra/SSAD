package LAB13.Momento.end;

import java.util.Stack;

public class UndoRedoManager {
    private final Stack<Memento> undoStack;
    private final Stack<Memento> redoStack;

    public UndoRedoManager() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void saveState(TextEditor editor) {
        undoStack.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!undoStack.isEmpty()) {
            redoStack.push(editor.save());
            editor.restore(undoStack.pop());
        }
    }

    public void redo(TextEditor editor) {
        if (!redoStack.isEmpty()) {
            undoStack.push(editor.save());
            editor.restore(redoStack.pop());
        }
    }
}

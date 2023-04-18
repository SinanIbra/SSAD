package LAB13.Momento.start;

import java.util.Stack;

public class UndoRedoManager {
    private final Stack<Memento> undoStack;
    private final Stack<Memento> redoStack;

    public UndoRedoManager() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    //    Implement saveState method
    public void saveState(TextEditor editor) {
    }

    //    Implement undo method
    public void undo(TextEditor editor) {
    }

    //    Implement redo method
    public void redo(TextEditor editor) {
    }
}

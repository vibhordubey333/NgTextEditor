
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.undo.UndoManager;

/**
 *
 * @author avi
 */
public class undo  {
/*Document editDoc;
       UndoHandler undoHandler=new UndoHandler();
       UndoManager undoMan=new UndoManager();
       UndoAction unAc;
       //RedoAction reAc;
       editDoc=TextEditor.jTextArea1.getDocument();
       editDoc.addUndoableEditListener(undoHandler);
       KeyStroke undoKeyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_Z,Event.CTRL_MASK);
        unAc=new TextEditor.UndoAction();
        TextEditor.jTextArea1.getInputMap().put(undoKeyStroke,"undoKeyStroke");
        jTextArea1.getActionMap().put("undoKeyStroke",unAc);
}
class UndoHandler implements UndoableEditListener
    {
        

        @Override
        public void undoableEditHappened(UndoableEditEvent e) {
             undoHandler.addEdit(e.getEdit());
             unAc.update();
        }
    }
    class UndoAction extends AbstractAction
    {
        public UndoAction()
        {
            super("Undo");
            setEnabled(false);
        }
        public void actionPerformed(ActionEvent e)
        {
            try{
                undoManager.undo();
            }catch(Exception ed)
            {
                JOptionPane.showMessageDialog(null,ed);
            }
            update();        
        }
        void update()
        {
            if(undoManager.canUndo())
            {
                setEnabled(true);
                putValue(Action.NAME,undoManager.getUndoPresentationName());
            }
        }*/
    }
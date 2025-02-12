// Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
// Add a new text state at the end of the list every time the user types or performs an action.
// Implement the undo functionality (revert to the previous state).
// Implement the redo functionality (revert back to the next state after undo).
// Display the current state of the text.
// Limit the undo/redo history to a fixed size (e.g., last 10 states).
// Hint:
// Use a doubly linked list where each node represents a state of the text.
// The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
// Keep track of the current state and adjust the next and prev pointers for undo/redo operations.
class Node{
    String textState;
    Node prev, next;
    public Node(String testState){
        this.textState = testState;
        this.prev=null;
        this.next=null;
    }
}
class TextEditor{
        Node head,tail,current;
        int maxhistory=10;
        int count=0;
        
        public TextEditor(){
            this.head=null;
            this.tail=null;
            this.current=null;
        }
        public void addState(String input){
            Node newNode = new Node(input);
            if(head==null){
                head=newNode;
                tail=newNode;
                current=newNode;
                count++;
            }
            else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
                current=tail;
                count++;
                if(count>maxhistory){
                    head=head.next;
                    head.prev=null;
                    count--;
                }
            }

        }
        public void undo(){
            if(current!=null||current.prev!=null){
                current=current.prev;
                System.out.println("Current State: "+current.textState);
                }
                else{
                    System.out.println("No previous state");
                }
        }
        public void redo(){
            if(current!=null||current.next!=null){
                current=current.next;
                System.out.println("cuurent state "+current.textState);
        }
        else{
            System.out.println("No next state");
        }
        
    }

    }
    public class UndoRedoTextEditor {
    
        public static void main(String[] args) {
            TextEditor editor = new TextEditor();
            editor.addState("State 1");
            editor.addState("State 2");
            editor.addState("State 3");
            editor.undo();
            editor.redo();
            editor.undo();
            editor.redo();

        
            
        }
    }
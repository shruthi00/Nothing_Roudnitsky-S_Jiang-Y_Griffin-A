/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode<Card> {

    private Card _cargo;    //cargo may only be of type Card
    private DLLNode<Card> _nextNode, _prevNode; //pointers to next, prev DLLNodes
    
    
    // constructor -- initializes instance vars
    public DLLNode(Card value, DLLNode<Card> prev, DLLNode<Card> next) 
    {
	_cargo = value;
	_nextNode = next;
	_prevNode = prev;
    }


    //--------------v  ACCESSORS  v--------------
    public Card getCargo() { return _cargo; }

    public DLLNode<Card> getNext() { return _nextNode; }

    public DLLNode<Card> getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public Card setCargo( Card newCargo ) {
	Card foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public DLLNode<Card> setNext( DLLNode<Card> newNext ) {
	DLLNode<Card> foo = getNext();
	_nextNode = newNext;
	return foo;
    }

    public DLLNode<Card> setPrev( DLLNode<Card> newPrev ) {
	DLLNode<Card> foo = getPrev();
	_prevNode = newPrev;
	return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) 
{
	//Below is an exercise in creating a linked list...

	/*********************
	//Create a node
	DLLNode<String> first = new DLLNode<String>( "cat", null );
	//Create a new node after the first
	first.setNext( new DLLNode<String>( "dog", null ) );
	//Create a third node after the second
	first.getNext().setNext( new DLLNode<String>( "cow", null ) );
	DLLNode temp = first; 
	while( temp != null ) {
	    System.out.println( temp );
	    temp = temp.getNext();
	}
	***********************/
    }//end main

}//end class DLLNode
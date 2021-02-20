package Interval_oop;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Abstract Idea -  Each  instance of this class represents a sequence of consecutive integers
 * Representations - lower/upper bound; lower/length (in computer memory)
 * 1st step - Definition of CLASS API
 * @immutable (no setters)
 * 
 * abstract state invariants: (a.k.a. public invariants)
 * @invar The sequence of elements equals the sequence starting at he lower bound
 * 		| getLowerBound() <= getUpperBound()
 */


public class Interval {	
	
	//representation invariants a.k.a. private invariants 
	/**
	 * @invar The with is nonegative.
	 * 		| 0 <= width
	 */
	
	private int width;
	private int upperBound;
	
	//getters (inspector methods) --- defines the class's abstract state space = set of possible abstract values/states)
	//immutable class --> the abstract value of an instance
	//Mutable class --> the current abstract state of an instance 
	
	/**
	 * @basic
	 */
	public int getLowerBound() {  
		return upperBound - width;
		}
	
	/**
	 * @basic
	 */
	public int getUpperBound() { 
		return upperBound;
		}
	
	/**
	 * @post The result equals the upper bound minus the lower bound.
	 * 		| result == getUpperBound() - getLowerBound()
	 */
	public int getWidth() { 
		return width;
		}
	
	/**
	 * @post The result is not null
	 * 		| result != null
	 * @post The sequence of elements equals the sequence starting at he lower bound
	 * 		| Arrays.equals(result, IntStream.range(getLowerBound(), getUpperBound()).toArray())
	 */
	public int[] getElements() {
		return IntStream.range(upperBound - width, upperBound).toArray();
		}
	
	/**
	 * Initializes this object so that it represents the interval
	 * specified by the given lower and upper bound
	 * 
	 * @pre The given lower bound is not grater that the given upper bound.
	 * 		| lowerBound <= upperBound
	 * @post This interval's lower bound equals the given lower bound.
	 * 		| getLowerBound() == lowerBound
	 * @post This interval's upper bound equals the given lower bound.
	 * 		| getUpperBound() == upperBound
	 * 
	 */
	
	public Interval(int lowerBound, int upperBound) { 
		this.width = upperBound - lowerBound;
		this.upperBound = upperBound;
		}
	//this would be immutable class (no setters) - no way for clients to change the abstract state of object == no Mutators
	

	

}

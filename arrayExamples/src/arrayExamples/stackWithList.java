package arrayExamples;

/*
 * Terry James
 * Stack with List 
 * 8/20/2019
 * 
 * An implementation of a stack using an ArrayList. 
 * Stack is LIFO data structure that uses basic method like pop, peek, push, 
 * isEmpty, size, and toString.
 */
import java.util.ArrayList;

public class stackWithList {
		private ArrayList<Object> list = new ArrayList<>();
		
		public boolean isEmpty() {
			return list.isEmpty();
		}
		
		public int getSize() {
			return list.size();
		}
		
		public Object peek() {
			return list.get(list.size() - 1);
		}
		
		public Object pop() {
			Object x = list.get(getSize() - 1);
			list.remove(getSize() - 1);
			return x;
		}
		
		public void push(Object input) {
			list.add(input);
		}
		
		@Override
		public String toString() {
			return "stack: " + list.toString();
		}
}

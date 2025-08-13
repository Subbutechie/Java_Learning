package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public abstract class Subbu implements Collection<Subbu>{
	ArrayList<Integer> ls = new ArrayList<Integer>();
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	Vector<Integer> vect = new Vector<Integer>(10,5);
	
	
	public int getSize() {
		return ls.size();
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void rubItAll();
	
	public void method() {
		
	}
	

}

 abstract class Srikar extends Subbu{

	 @Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
 
 
 class Sam extends Srikar{

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Subbu> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Subbu e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Subbu> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void rubItAll() {
		// TODO Auto-generated method stub
		
	}
	 
 }

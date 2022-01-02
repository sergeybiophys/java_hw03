package org.itstep.task01;

public class List {
    private Object[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = new Object[size];
    }
   
    public Object get(int idx) {
        return obj[idx];
    }

    public void add(Object item) throws FullListException {
        //int limit = this.size-1;
        if(cur==this.size) throw new FullListException("The List is Full!!!" + " size: " + this.size + " occupied cells: " + (this.cur+1));
        obj[cur++] = item;
    }

    public void removeLast() throws EmptyListException {
        if(this.cur==0) throw new EmptyListException("The List is Empty!!!"  + " size: " + this.size + " occupied cells: " + this.cur);
        obj[--cur] = null;
    }
}

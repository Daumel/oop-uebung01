package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private CharElement head;
    private static int counter = 0;

    private class CharElement {
        char value;
        CharElement next;
        CharElement(char value, CharElement next){
            this.value = value;
            this.next = next;
            counter++;
        }
    }

    @Override
    public void push(char c) {
        if(head==null){
            head = new CharElement(c, null);
            return;
        }
        CharElement it = head;
        while(it.next!=null){
            it = it.next;
        }
        it.next = new CharElement(c, null);
    }

    @Override
    public char pop() {
        char c;
        int i = counter;
        if(counter==0){
            throw new NoSuchElementException();
        }
        if(counter==1){
            c = head.value;
            head = null;
            counter--;
            return c;
        }
        CharElement it = head;
        while(--i > 1){
            it = it.next;
        }
        c = it.next.value;
        it.next = null;
        counter--;
        return c;
    }

    @Override
    public int size() {
        return counter;
    }
}

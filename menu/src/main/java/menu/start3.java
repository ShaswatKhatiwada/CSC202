/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;


import java.util.Iterator;

/**
 *
 * @author zain
 * @param <z>
 */
public class start3 <z> implements Iterable<z>{
  private LinkedListNode head;
  private LinkedListNode tail;
  private int size;

  public start3() {
    size = 0;
  }


     @Override
  public Iterator<z> iterator() {
    Iterator it = new LinkedListIterator(this);
    return it;
  }

  public class LinkedListNode {

    z element;
    LinkedListNode next;
    LinkedListNode prev;

    public LinkedListNode(z element, LinkedListNode next, LinkedListNode prev) {
      this.element = element;
      this.next = next;
      this.prev = prev;
    }
  }

  private class LinkedListIterator implements Iterator<z> {

    start3<z> list;
    LinkedListNode pointer;

    public LinkedListIterator(start3 list) {
      this.list = list;
      pointer = list.head;
    }

    @Override
    public boolean hasNext() {
      if (list.isEmpty()) {
        return false;
      }
      return pointer != null;
    }

    @Override
    public z next() {
      LinkedListNode temp = pointer;
      pointer = pointer.next;
      return temp.element;
    }

  }

  /**
   * returns the size of the linked list
   *
   * @return
   */
  public int size() {
    return size;
  }

  /**
   * return whether the list is empty or not
   *
   * @return
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * adds element at the end of the linked list
   *
   * @param element
   */
  public void add(z element) {

    LinkedListNode tmp = new LinkedListNode(element, null, tail);
    if (tail != null) {
      tail.next = tmp;
    }
    tail = tmp;
    if (head == null) {
      head = tmp;
    }
    size++;
  }

  /**
   * this method walks forward through the linked list
   */
  public void iterate() {

    LinkedListNode tmp = head;
    while (tmp != null) {
      tmp = tmp.next;
    }
  }

  /**
   * this method delete element from the end of the linked list
   *
   * @return
   */
  public Boolean delete()  {
    if (size == 0) {
      return false;
    }
    LinkedListNode tmp = tail;
    tail = tail.prev;
    tail.next = null;
    size--;
    return true;
  }

  public boolean delete(Object o) {
    if (size == 0) {
      return false;
    }
    if (o != null) {
      if (head.element.equals(o)) {
        head = head.next;
        head.prev = null;
        size--;
        return true;
      } else {
        LinkedListNode next = head.next;
        LinkedListNode temp = head;
        while (null != next) {
          if (next.element.equals(o)) {
            temp.next = next.next;
            next.next.prev = temp;
            next = null;
            size--;
            return true;
          }
          temp = next;
          next = temp.next;
        }
      }
    }
    return false;
  }
}



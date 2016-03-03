import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class LinkedListTest {


    @Test
    public void shouldCreateListWithoutElement() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(0, list.getLength());
    }

    @Test
    public void shouldAddElement() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        assertEquals(1, list.getLength());
        assertEquals(23, list.getHead().getValue());
        assertEquals(23, list.getTail().getValue());
    }

    @Test
    public void shouldAddElementOfFloatType() {
        LinkedList<Float> list = new LinkedList<>();
        list.add((float) 3.6);
        assertEquals(1, list.getLength());
        assertEquals((float) 3.6, list.getHead().getValue());
        assertEquals((float) 3.6, list.getTail().getValue());
    }

    @Test
    public void LinkedListShouldAddTwoElementToTheList() throws Exception {
        LinkedList<Double> list = new LinkedList<>();
        list.add(51.0);
        list.add(101.1);
        assertEquals(2, list.getLength());
        assertEquals(51.0, list.getHead().getValue());
        assertEquals(101.1, list.getTail().getValue());
    }

    @Test
    public void LinkedListShouldAddMultiElementToTheList() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(13);
        list.add(19);
        list.add(25);
        list.add(31);
        list.add(37);
        assertEquals(5, list.getLength());
        assertEquals(13, list.getHead().getValue());
        assertEquals(37, list.getTail().getValue());
    }

    @Test
    public void findThePositionOfAValue() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(13);
        list.add(19);
        list.add(25);
        list.add(31);
        list.add(37);
        assertEquals(3, list.find(25));
    }

    @Test
    public void findThePositionOfAValueIfNotPresent() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(13);
        list.add(19);
        list.add(25);
        list.add(31);
        list.add(37);
        assertEquals(-1, list.find(26));

    }


    @Test
    public void findThePositionOfAStringValueIfNotPresent() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("How");
        list.add("are");
        list.add("you");
        assertEquals(5, list.find("you"));

    }

    @Test
    public void list_iterator_returens_true_if_more_element_available() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("How");
        list.add("are");
        list.add("you");
        LinkedList<String>.Iterator iterator = list.new Iterator();
        assertTrue(iterator.hasNext());
    }

    @Test
    public void test_list_gives_next_element() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("How");
        list.add("are");
        list.add("you");
        LinkedList<String>.Iterator iterator = list.new Iterator();
        assertEquals("Hi",iterator.next());
        assertEquals("Hello",iterator.next());
    }
}
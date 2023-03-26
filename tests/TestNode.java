import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNode {
    Node<Integer> node;

    @Before
    public void setup() {
        node = new Node<>(5);
    }

    @Test
    public void testNode() {
        Assert.assertEquals(5, (int)node.getValue());
        Assert.assertNull(node.getNext());
        node.setNext(new Node<>(6));
        Assert.assertEquals(6, (int)node.getNext().getValue());
    }
}

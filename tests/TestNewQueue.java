import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNewQueue {
    NewQueue<String> nq;

    @Before
    public void setup() {
        nq = new NewQueue<>();
    }

    @Test
    public void testPeek() {
        Assert.assertNull(nq.peek());
        nq.enqueue("Jason");
        Assert.assertEquals("Jason", nq.peek().getValue());
    }

    @Test
    public void testEnqueue() {
        nq.enqueue("Jason");
        Assert.assertEquals("Jason", nq.peek().getValue());
        Assert.assertEquals(1, nq.getLength());
        nq.enqueue("Gillian");
        Assert.assertEquals(2, nq.getLength());
        Assert.assertEquals("Jason", nq.peek().getValue());
    }

    @Test
    public void testDequeue() {
        nq.enqueue("Jason");
        nq.enqueue("Gillian");
        nq.enqueue("Argo");
        nq.enqueue("Iris");
        Assert.assertEquals(4, nq.getLength());
        Assert.assertEquals("Jason", nq.peek().getValue());
        Assert.assertEquals("Jason", nq.dequeue().getValue());
        Assert.assertEquals("Gillian", nq.peek().getValue());
        Assert.assertEquals("Gillian", nq.dequeue().getValue());
        Assert.assertEquals("Argo", nq.peek().getValue());
        Assert.assertEquals("Argo", nq.dequeue().getValue());
        Assert.assertEquals("Iris", nq.peek().getValue());
        Assert.assertEquals("Iris", nq.dequeue().getValue());
        Assert.assertNull(nq.dequeue());
        Assert.assertNull(nq.peek());
        Assert.assertNull(nq.dequeue());
    }
}

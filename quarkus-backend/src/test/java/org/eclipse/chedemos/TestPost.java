package org.eclipse.chedemos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPost {

    @Test
    public void testHelloEndpoint() {
        Post post = new Post("hello", "world");
        assertEquals("HELLO", post.getTitle());
    }
}

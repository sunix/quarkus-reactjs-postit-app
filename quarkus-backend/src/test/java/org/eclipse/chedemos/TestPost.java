package org.eclipse.chedemos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPost {

    @Test
    public void test_post_title_in_uppercase() {
        Post post = new Post("hello", "world");
        assertEquals("HELLO", post.getTitle(), "Post title should be in uppercase");
    }
}

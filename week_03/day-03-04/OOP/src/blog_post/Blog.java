package blog_post;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    //    Reuse your BlogPost class
//    Create a Blog class which can
//            store a list of BlogPosts
//            add BlogPosts to the list
//            delete(int) one item at given index
//    update(int, BlogPost) one item at the given index and update it with another BlogPost
    private List<BlogPost> blogPosts;

    public Blog() {
        this.blogPosts = new ArrayList<>();
    }

    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public void addPost(BlogPost blogPost) {
        blogPosts.add(blogPost);
    }

    public void deletePost(int index) {
        this.blogPosts.remove(index);
    }

    public void updatePost(int index, BlogPost blogPost) {
        blogPosts.add(index, blogPost);
    }
}

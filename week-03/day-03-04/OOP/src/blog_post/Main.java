package blog_post;

public class Main {
    public static void main(String[] args) {

        BlogPost firstPost = new BlogPost();

        firstPost.setTitle("Lorem Ipsum");
        firstPost.setAuthorName("John Doe");
        firstPost.setText("Lorem ipsum dolor sit amet.");
        firstPost.setPublicationDate("2000.05.04");

        System.out.println(firstPost.getTitle());
        System.out.println(firstPost.getAuthorName());
        System.out.println(firstPost.getText());
        System.out.println(firstPost.getPublicationDate());


        BlogPost secondPost = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");

        System.out.println(secondPost.getTitle());
        System.out.println(secondPost.getAuthorName());
        System.out.println(secondPost.getText());
        System.out.println(secondPost.getPublicationDate());

        BlogPost thirdPost = new BlogPost();
        thirdPost.setAuthorName("William Turton");
        thirdPost.setTitle("One Engineer Is Trying to Get IBM to Reckon With Trump");
        thirdPost.setText("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
        thirdPost.setPublicationDate("2017.03.28.");

        Blog myBlog = new Blog();

        myBlog.addPost(firstPost);
        myBlog.addPost(secondPost);
        myBlog.addPost(thirdPost);

        System.out.println(myBlog.getBlogPosts().size());
        myBlog.deletePost(1);
        System.out.println(myBlog.getBlogPosts().size());

        BlogPost newPost = new BlogPost("bob", "asd", "asdasdasd", "2020.06.03");
        myBlog.updatePost(0, newPost);


    }
}

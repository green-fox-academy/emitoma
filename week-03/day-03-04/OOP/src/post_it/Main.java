package post_it;

public class Main {
    public static void main(String[] args) {

        PostIt postIt = new PostIt("orange", "Idea 1", "blue");

        System.out.println(postIt.getBackgroundColor());
        System.out.println(postIt.getText());
        System.out.println(postIt.getTextColor());

        PostIt nextPostIt = new PostIt("pink", "Awesome", "black");

        System.out.println(nextPostIt.getBackgroundColor());
        System.out.println(nextPostIt.getText());
        System.out.println(nextPostIt.getTextColor());

        PostIt postIt3 = new PostIt("yellow", "Superb!", "green");


        System.out.println(postIt3.getBackgroundColor());
        System.out.println(postIt3.getText());
        System.out.println(postIt3.getTextColor());
    }
}

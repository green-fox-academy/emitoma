package post_it;

public class PostIt {
    private String backgroundColor;
    private String text;
    private String textColor;

    //constructor
    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;

    }

    //get and set backgroundcolor
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    // get and set text
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // get and set text color
    public String getTextColor() {
        return this.textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

}

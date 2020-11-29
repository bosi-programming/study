package inheritance;

public class Poem extends Literature {
    private String style;
    
    public Poem(String title, String author, String style)
    {
        super(title, author);
        this.style = style;
    }
    
    public void Print()
    {
        super.Print();
        System.out.println("\tIn The Style Of: " + style);
    }
}

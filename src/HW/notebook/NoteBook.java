package HW.notebook;

public class NoteBook {
    private String name;
    private int cost;
    private VideoCard videoCard;
    private Processor processor;

    public NoteBook(String name, int cost,int gh,int gb) {
        this.name = name;
        this.cost = cost;
        this.processor = new Processor(gb);
        this.videoCard = new VideoCard(gb);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new
                NoteBook(name, cost,processor.getHertz(),videoCard.getMemoryCard());
    }
}

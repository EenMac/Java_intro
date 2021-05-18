public class Printer {
    private int copies;
    private int pages;
    private int tonerVolume;

    public Printer(int pages, int copies, int tonerVolume){
        this.copies = copies;
        this.pages = pages;
        this.tonerVolume = tonerVolume;
    }
    public int pagesLeft(){
        return this.pages;
    }

    public String print(int pagesLeft, int copies){
        pages = this.pages;
        copies = this.copies;
        pagesLeft = pages - copies;
        if (copies <= pages){
            return "you have " + pagesLeft +" pages and " + copies + " copies.";
        } return "not enough pages";
    }
    public int toner(int pages, int tonerVolume){
        int totalVolume = this.tonerVolume;
        int totalPages = this.pages;
        for (int i = pages; i>=0; i--){
            totalVolume -= 1;
        }
        return totalVolume;
    }



}

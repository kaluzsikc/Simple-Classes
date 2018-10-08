public class Printer {
    private int sheetsOfPaper;
    private int tonerVolume;
    
    public Printer(int sheetsOfPaper, int tonerVolume){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheetsOfPaper(){
        return this.sheetsOfPaper;
    }

    public int print(int pages, int copies){
        int totalPagesToBeCopied =  pages * copies;

        if(totalPagesToBeCopied <= this.sheetsOfPaper && totalPagesToBeCopied <= this.tonerVolume) {
            this.sheetsOfPaper -= totalPagesToBeCopied;
            this.tonerVolume -= totalPagesToBeCopied;

        }
        return sheetsOfPaper;
    }

    public int topUpPaper(int topUpPages){
        this.sheetsOfPaper += topUpPages;
        return sheetsOfPaper;
    }

    public int getTonerVolume(){
        return tonerVolume;
    }

}

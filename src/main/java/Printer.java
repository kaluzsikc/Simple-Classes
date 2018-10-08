public class Printer {
    private int sheetsOfPaper;
    
    public Printer(int sheetsOfPaper){
        this.sheetsOfPaper = sheetsOfPaper;
    }

    public int getNumberOfSheetsOfPaper(){
        return this.sheetsOfPaper;
    }

    public int print(int pages, int copies){
        int totalPagesToBeCopied =  pages * copies;

        if(totalPagesToBeCopied <= this.sheetsOfPaper) {
            this.sheetsOfPaper = this.sheetsOfPaper - totalPagesToBeCopied;
        }
        return sheetsOfPaper;
    }

    public int topUpPaper(int toUpPages){
        this.sheetsOfPaper += toUpPages;
        return sheetsOfPaper;
    }

}

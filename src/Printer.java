public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;


    public void fillUpTheToner(){
        this.tonerLevel = 100;
        System.out.println("Toner level get up to " + this.tonerLevel + "%");
    }
public void pirntingPage(int needToPrint){
        if (duplexPrinter){
            this.numberOfPagesPrinted = (needToPrint / 2 + needToPrint % 2);
        }
        else {
            this.numberOfPagesPrinted = needToPrint;
        }
    System.out.println(this.numberOfPagesPrinted + " pages of paper will be printed");
}


    public Printer(int tonerLevel, boolean duplexPrinter) {
       if ((tonerLevel > -1) && (tonerLevel <= 100)){
        this.tonerLevel = tonerLevel;}
        else{this.tonerLevel = -1;}
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }


}

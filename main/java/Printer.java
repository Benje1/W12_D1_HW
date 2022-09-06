public class Printer {

    private int paperLeft;
    private int toner;

    public Printer(int paperLeft, int toner){
        this.paperLeft = paperLeft;
        this.toner = toner;
    }

    public int checkPaperLeft(){
        return this.paperLeft;
    }
    public int checkTonerLeft(){
        return this.toner;
    }

    public boolean willPrint(int paperNeeded){
        if(paperNeeded > this.paperLeft){
            return false;
        } else {
            return true;
        }
    }

    public boolean print(int copies){
        if (willPrint(copies) == true){
            this.paperLeft = this.paperLeft - copies;
            this.toner = this.toner - copies;
        } else {
            return false;
        }
        return false;
    }


}

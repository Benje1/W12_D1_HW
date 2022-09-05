public class Bottle {

    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(){
        if (this.volume > 0){
            int newVolume = this.volume - 10;
            setVolume(newVolume);
            return this.volume;
        } else {
            return this.volume;
        }

    }

    public int empty(){
        return this.volume = 0;
    }

    public int refill(){
        return this.volume = 100;
    }

}

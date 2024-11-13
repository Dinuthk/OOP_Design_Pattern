public class SellStock implements Order{
    private Stock ballStock;

    public SellStock(Stock ballStock){
        this.ballStock = ballStock;
    }
    @Override
    public void excute() {
        ballStock.sell();
    }
}

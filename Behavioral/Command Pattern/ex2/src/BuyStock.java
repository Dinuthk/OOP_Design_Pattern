public class BuyStock implements Order{
    private Stock ballStock;

    public BuyStock(Stock ballStock){
        this.ballStock = ballStock;
    }
    @Override
    public void excute() {
        ballStock.buy();
    }
}

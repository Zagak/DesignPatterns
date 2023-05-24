package restaurant.adapter.bucatarie;

public class Bucatarie implements ISoftRestaurant{
    private String numeBucatar;

    public Bucatarie(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        System.out.println("BUCATARIA "+this.numeBucatar+" ,valoare: "+totalSuma);
    }
}

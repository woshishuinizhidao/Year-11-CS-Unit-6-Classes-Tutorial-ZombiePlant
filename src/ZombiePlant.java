public class ZombiePlant {
    private int maxPotency;
    private int successfulTreatment;
    private int treat;

    public ZombiePlant(int maxPotency, int successfulTreatment ) {
        this.maxPotency = maxPotency;
        this.successfulTreatment = successfulTreatment;
    }
    public int treatmentsNeeded(){
        if(successfulTreatment>=0)
            return successfulTreatment;
        else
            return 0;
    }

    public int getPotencyRequired(){
        return maxPotency;
    }
    public boolean isDangerous(){
        if(successfulTreatment>=1)
            return true;
        else
            return false;
    }

    public void treat(int treat) {
        this.treat = treat;
        if(treat<=maxPotency){
            successfulTreatment=successfulTreatment-1;
        }
        if(treat>maxPotency){
            successfulTreatment=successfulTreatment+1;
        }
    }
}

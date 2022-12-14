package praktek03_yulis;

public class SepedaMotor extends Sepeda{
    private String jenisMotor;
    
    void throttle(){
        System.out.println("NGEEENG......");
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
    
}

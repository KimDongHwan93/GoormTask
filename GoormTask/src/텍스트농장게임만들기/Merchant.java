package 텍스트농장게임만들기;

public class Merchant extends Thread {

    boolean isMerchant = false;
    int isMerchantPeriod;



    public Merchant(int isMerchantPeriod){
        this.isMerchantPeriod = isMerchantPeriod;

    }

    @Override
    public void run(){
        while(true)

            try{
                Thread.sleep(isMerchantPeriod * 1000);
                startMerchant();
                Thread.sleep(isMerchantPeriod * 1000);
                endMerchant();
            }

            catch (InterruptedException e){
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }

    }

    public void startMerchant(){
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("상인이 방문하였습니다. 지금 작물을 판매하시면 판매가격이 '두배'입니다.");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        isMerchant = true;
    }

    public void endMerchant(){
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("상인이 갔습니다. 작물 가격이 정상으로 돌아옵니다.");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        isMerchant = false;
    }
}


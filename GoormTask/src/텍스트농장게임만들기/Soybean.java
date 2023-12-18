package 텍스트농장게임만들기;

public class Soybean extends Crop{

    public Soybean(int no){
        this.no = no;
        name = "Soybean";
    }

    @Override
    public void giveWaterCrop (){
        System.out.println("\n------------------------------------------------");
        System.out.println("물을 주었습니다. 작물이 성장하였습니다.");
        growth++;
        price += 3700;
        System.out.println("현재 작물의 단계는 " + this.growth + "단계 입니다.");
    }

}

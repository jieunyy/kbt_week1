package restaurant;

import java.util.List;

public class Restaurant {

    // 필드
    private String rName;         // 식당 이름
    private String rLocation;     // 식당 위치
    private String rCategory;     // 식당 종류(양식, 한식 등)
    private double rRate;         // 식당 평점
    private int rDeliveryFee;     // 배달료
    private int rMinOrderAmount;  // 최소 주문 금액
    private int rDeliveryTime;    // 배달 시간(배달 선택 시)
    private int rTakeoutTime;
    private List<Menu> menuList;  // 식당 메뉴


    // 생성자
    public Restaurant(String rName, String rLocation, String rCategory, double rRate,
               int rDeliveryFee, int rMinOrderAmount, int rDeliveryTime, int rTakeoutTime) {
        this.rName = rName;
        this.rLocation = rLocation;
        this.rCategory = rCategory;
        this.rRate = rRate;
        this.rDeliveryFee = rDeliveryFee;
        this.rMinOrderAmount = rMinOrderAmount;
        this.rDeliveryTime = rDeliveryTime;
        this.rTakeoutTime = rTakeoutTime;
    }


    // 메소드
    public void addMenus(List<Menu> menuList) {
        this.menuList = menuList;
    }
    public String getrName() {
        return rName;
    }

    public String getrLocation() {
        return rLocation;
    }

    public String getrCategory() {
        return rCategory;
    }

    public double getrRate() {
        return rRate;
    }

    public int getrDeliveryFee() {
        return rDeliveryFee;
    }

    public int getrMinOrderAmount() {
        return rMinOrderAmount;
    }

    public int getrDeliveryTime() {
        return rDeliveryTime;
    }

    public int getrTakeoutTime() {
        return rTakeoutTime;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public void setrLocation(String rLocation) {
        this.rLocation = rLocation;
    }

    public void setrCategory(String rCategory) {
        this.rCategory = rCategory;
    }

    public void setrRate(double rRate) {
        this.rRate = rRate;
    }

    public void setrDeliveryFee(int rDeliveryFee) {
        this.rDeliveryFee = rDeliveryFee;
    }

    public void setrMinOrderAmount(int rMinOrderAmount) {
        this.rMinOrderAmount = rMinOrderAmount;
    }

    public void setrDeliveryTime(int rDeliveryTime) {
        this.rDeliveryTime = rDeliveryTime;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}


package restaurant;

public class Customization extends MenuItem {

    // 필드
    private String customizationType;  // 사이드메뉴 종류


    // 생성자
    public Customization(String itemName, int itemPrice, String customizationType) {
        super(itemName, itemPrice);
        this.customizationType = customizationType;
    }


    // 메소드
    public String getCustomizationType() {
        return customizationType;
    }
}

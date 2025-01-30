package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuItem {

    // 필드
    private String category;                     // 메뉴 종류
    private List<Customization> customizations = null;  // 사이드 메뉴 리스트


    // 생성자
    public Menu(String itemName, int itemPrice,
                String category, List<Customization> customizations) {
        super(itemName, itemPrice);
        this.category = category;
        // customizations이 null일 경우를 대비해 다르게 바인딩
        this.customizations = (customizations != null) ? customizations : new ArrayList<>();
    }


    // 메소드
    public String getCategory() {
        return category;
    }

    public List<Customization> getCustomizations() {
        return customizations;
    }
}

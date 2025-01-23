package cart;

import restaurant.Menu;

public class CartItem {

    // 필드
    private Menu menu;     // 메뉴 이름
    private int quantity;  // 메뉴 수량


    // 생성자
    public CartItem(Menu menu, int quantiy) {
        this.menu = menu;
        this.quantity = quantiy;
    }


    // 메소드
    public int getSubTotal() {
        return menu.getMenuPrice() * getQuantity();
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantiy) {
        this.quantity = quantiy;
    }
}

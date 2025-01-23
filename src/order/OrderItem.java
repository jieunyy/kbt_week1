package order;

import restaurant.Menu;

public class OrderItem {

    // 필드
    private Menu menu;     // 주문 메뉴
    private int quantity;  // 주문 메뉴 수량


    // 생성자
    public OrderItem(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

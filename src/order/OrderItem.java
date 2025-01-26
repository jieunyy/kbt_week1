package order;

import restaurant.Menu;
import restaurant.MenuItem;

public class OrderItem {

    // 필드
    private MenuItem menuItem;     // 주문 메뉴 리스트
    private int quantity;          // 주문 메뉴 수량


    // 생성자
    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }


    // 메소드
    public int getSubTotal() {
        return menuItem.getItemPrice() * getQuantity();
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

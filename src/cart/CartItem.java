package cart;

import restaurant.MenuItem;

public class CartItem {

    // 필드
    private MenuItem menuItem;     // 메뉴 이름
    private int quantity;          // 메뉴 수량


    // 생성자
    public CartItem() {
    }

    public CartItem(MenuItem menuItem, int quantiy) {
        this.menuItem = menuItem;
        this.quantity = quantiy;
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

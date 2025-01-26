package cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // 필드
    private List<CartItem> cartItemList;  // 카트 아이템 리스트


    // 생성자
    public Cart(List<CartItem> cartItemList) {
        // 항상 빈 리스트로 초기화
        this.cartItemList = cartItemList;
    }

    // 메소드
    public void addItem(CartItem cartItem) {
        cartItemList.add(cartItem);
    }

    public void removeItem(CartItem cartItem) {
        cartItemList.remove(cartItem);
    }

    public int getTotalPrice(){
        int totalPrice = 0;
        for(CartItem cartItem : cartItemList) {
            totalPrice += cartItem.getSubTotal();
        }
        return totalPrice;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
}

package order;

import restaurant.Restaurant;
import user.Customer;

enum OrderStatus {
    결제완료,
    가게승인,
    조리완료,
    배달시작,
    배달완료
}

public class Order {

    // 필드
    private long orderId;           // 주문 아이디
    private Customer customer;      // 주문한 고객
    private Restaurant restaurant;  // 주문받은 식당
    private OrderItem orderItem;    // 주문 메뉴
    private OrderStatus orderStatus;     // 주문 상태


    // 생성자
    public Order(long orderId, Customer customer, Restaurant restaurant,
                 OrderItem orderItem, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderItem = orderItem;
        this.orderStatus = orderStatus;
    }


    // 메소드
    public int getTotalPrice() {
        return orderItem.getSubTotal();
    }
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}

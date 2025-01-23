package order;

import restaurant.Restaurant;
import user.Customer;

import static order.OrderStatus.주문대기;

public class Order {

    // 필드
    private long orderId;                      // 주문 아이디
    private Customer customer;                 // 주문한 고객
    private Restaurant restaurant;             // 주문받은 식당
    private OrderItem orderItem;               // 주문 메뉴
    private OrderStatus orderStatus = 주문대기;  // 주문 상태 default 주문대기
    private OrderType orderType;               // 주문 타입(배달, 포장)

    // 생성자
    public Order(long orderId, Customer customer, Restaurant restaurant,
                 OrderItem orderItem, OrderStatus orderStatus, OrderType orderType) {
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderItem = orderItem;
        this.orderStatus = orderStatus;
        this.orderType = orderType;
    }


    // 메소드
    public void updateOrderStatus(OrderType orderType) {
        // enum 활용해서 추가 구현 필요
        OrderStatus nextStatus = orderStatus.nextOrderStatus(orderType, orderStatus);
        this.orderStatus = nextStatus;
    }

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

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }
}
